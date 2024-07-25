package 排序;

public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 构建最大堆
        for (int i = (n -2)/2; i >= 0; i--) {
            heapify(arr, n, i);
        }


        // 一个接一个地从堆中取出元素
        for (int i = n - 1; i > 0; i--) {
            // 将当前根（最大值）移动到数组末尾
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 重新调整最大堆
            heapify(arr, i, 0);
        }
    }

    // 调整堆，使其满足最大堆性质
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // 将当前节点设为最大值
        int left = 2 * i + 1; // 左子节点
        int right = 2 * i + 2; // 右子节点

        // 如果左子节点存在且大于当前节点
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 如果右子节点存在且大于当前节点
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 如果最大值不是当前节点
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // 递归地调整受影响的子树
            heapify(arr, n, largest);
        }
    }

}

//代码太过抽象，举个例子解释一下。关于堆排序：如何建立一个最大堆
//
//假设 数组{2，57，9，6，54，90，53，9，8}，数组长度为9
//
//直接建立一个堆             2
//                 57           9
//              6      54     90   53
//         9       8
//循环1：从最下面开始调整 元素 6 的下标为3，先比较左子节点9与6的大小，然后比较9与8的大小，交换6与9，8不动。   9
//                                                                                      6     8
//
//循环2：元素9下标为2，交换后 应为   90
//                           9     53
//循环3：调整元素57 下标为 1，57>9且57>54，不需要变动
//循环4：调整元素2 下标为0，先发现2<57，再一次比较发现57<90,交换90与2，还有2与90由于交换节点导致子树变化，也就是
//                        90
//                    57       2
//                  ...      9    53
//继续调整子树：  交换2与53的位置
//      90
// 57        53
//...      9    2
//第一遍堆排序完成：
//                            90
//                       57         53
//                   9       54    9    2
//                 6    8
//可以确定了 90即为最大值，将其放于数组末尾不再变动（和8交换，其余的数继续进行堆排序再次选出最大值放于末尾）
//重复直至堆的尺寸2为1.