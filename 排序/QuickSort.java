package 排序;

public class QuickSort {


    //快速排序：是一种基于分治法的高效排序算法。它的基本思想是选择一个“基准”（pivot）元素，
    // 通过一趟排序将数组分成两部分，一部分比基准元素小，另一部分比基准元素大，然后递归地对这两部分进行排序。
    //例如
    // {23 58 13 10 57 62} 65 {106 78 95 85}
    //--->
    //{10 13} 23 {58 57 62} 65 {85 78 95} 106
    //--->
    //10 13 23 57 58 62 65 78 85 95 106
    public static  void  quicksort(int[] arr){
        quicksort_inplement(arr,0, arr.length-1);
        //end为数组最后一个元素的下标
    }

    public static void quicksort_inplement(int[] arr, int begin, int end){

        if(begin<end) //判断能否继续再分
        {
            int pivot = partition(arr, begin, end);

            quicksort_inplement(arr, begin, pivot - 1);
            quicksort_inplement(arr, pivot + 1, end);
        }
    }


    public  static int partition(int[] arr, int low, int high){

        // 选择最右边的元素作为基准
        int pivot = arr[high];
        int i = (low - 1); // 较小元素的索引

        for (int j = low; j < high; j++) {
            // 如果当前元素小于或等于基准
            //当然如果第一个元素就是小于基准的，相当于自己换自己没有变化
            if (arr[j] <= pivot) {
                i++;
                // 交换 arr[i] 和 arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 交换 arr[i+1] 和 arr[high] (或 pivot)
        // 遍历数组完毕后， 共有i+1个元素比基准小
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // 返回分区点

    }
}

