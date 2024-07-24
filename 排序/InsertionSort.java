package 排序;

public class InsertionSort {


    public static void insertionSort(int[] arr){

        //插入排序法：将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
        //
        //从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。

    for(int i=1;i< arr.length;i++){
//从下标为1的元素开始。
        int beh=arr[i];

        int j=i ;

        while(j>0&&beh<arr[j-1]){  //默认从后往前比

            arr[j] = arr[j - 1];

            j--;
        }//数组下标依次增加以留出空位

        if(i!=j){
            arr[j]=beh;
        }//插入数组
    }

        for(int t=0; t< arr.length;t++)
        { System.out.print(arr[t]);}

    }








}
