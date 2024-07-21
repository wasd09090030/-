package 排序;
public class SimpleSort{


    public static void sort(int[] arr){



        for(int j=arr.length-1 ; j>=0; j--){

            for(int i=0;i<j;i++){

              int a=  arr[i];
              int b=  arr[i+1];

              if(a>b){
                 int c = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = c;
              }


            }

        }

       for(int t=0; t< arr.length;t++)
       { System.out.println(arr[t]);}



    }





}
