package 排序;

public class MergeSort {

    // 主函数，供外部调用的归并排序方法
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // 数组长度小于2，直接返回
        }
        int mid = arr.length / 2; // 找到数组的中间位置
        int[] left = new int[mid];//设定两个数组的容量
        int[] right = new int[arr.length - mid];

        // 将数组分成左右两个子数组，并且逐一填入
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // 递归地对左右子数组进行排序
        mergeSort(left);
        mergeSort(right);

        // 合并左右两个有序子数组
        merge(arr, left, right);
    }

    // 合并两个有序数组的方法
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        //在左和右数组消耗完前，比较大小并且插入arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];  //i，k加上1
            } else {
                arr[k++] = right[j++];
            }
        }
        // 将剩余元素拷贝到arr数组中
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }


}
