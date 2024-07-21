package 排序;

public class SelectionSort {


    public static void Selectionsort(int[] arr) {
        int length = arr.length;
        int index, temp;

        for (int i = 0; i < length; i++) {
            index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[index])
                    index = j;
            }
            if (index != i) {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        for(int t=0; t< arr.length;t++)
        { System.out.println(arr[t]);}

    }

}