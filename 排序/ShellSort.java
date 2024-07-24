package 排序;

public class ShellSort {

    public static void  shellsort(int[] arr){

        int length = arr.length;
        int temp;

        //length/2得到gap,每次循环后再次/2，直至gap=1变为直接插入
        for (int step = length / 2; step >= 1; step /= 2) {
            //
            for (int i = step; i < length; i++) {
                temp = arr[i];//先将arr[i]赋值

                int j = i - step;//需要进行对比的元素的下标

                //当下标较小的元素大于每组相对应的元素时，留出空位等待插入
                //仿照直接插入法，不同的点是gap值不一定是1
                //例如：arr[0]->arr[2],arr[2]->arr[4],留出arr[0]等待插入
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j = j-step;
                }
                arr[j + step] = temp;//插入元素
            }
        }
        for(int t=0; t< arr.length;t++)
        { System.out.print(arr[t]);}

    }




}
