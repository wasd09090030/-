package 排序;

public class SelectionSort {

//选择排序法：先选出最大（小）的元素，将其放置到数组的尾（首）端.再重复这个步骤直至完成排序。
    public static void Selectionsort(int[] arr) {
        int length = arr.length;
        int index, temp;

        for (int i = 0; i < length; i++) {
            index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }
            //遍历数组找到最大的
            if (index != i) {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
            //交换位置
        }
        for(int t=0; t< arr.length;t++)
        { System.out.println(arr[t]);}

    }

}