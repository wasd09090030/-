package 排序;
public class SimpleSort{


    public static void sort(int[] arr){

//简单排序（冒泡排序）：两两对比大小，首先确定最大的元素，剩下的元素中再选出最大的直至只剩一个元素。

        for(int j=arr.length-1 ; j>=0; j--){
//遍历一次后，数组长度减去1
            for(int i=0;i<j;i++){

              int a=  arr[i];
              int b=  arr[i+1];

              if(a>b){
                 int c = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = c;
              }
//交换位置

            }

        }


       for(int t=0; t< arr.length;t++)
       { System.out.println(arr[t]);}



    }





}
