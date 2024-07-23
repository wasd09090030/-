package 排序;



public class main {

    public static void main(String[] args){

        int[] arrays01 ={2,4,6,3,9,7,1,8};

        SimpleSort .sort(arrays01);




        int[] arrays02 ={2,4,6,3,9,7,1,8};

        SelectionSort.Selectionsort(arrays02);


        int[] arrays03 ={2,4,6,3,7,9,7,1,8};

        InsertionSort.insertionSort(arrays03);

        int[] arrays04 ={2,4,6,3,7,9,7,1,8};

        ShellSort.shellsort(arrays04);

        int[] array04 = new int[] { 9, 7, 8, 6, 5, 4, 3, 2, 10 };

        MergeSort.mergeSort(array04);
        for(int t=0; t< array04.length;t++)
        { System.out.println(array04[t]);}








    }







}
