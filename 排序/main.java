package 排序;



public class main {

    public static void main(String[] args){

        int[] arrays01 ={2,4,6,3,9,7,1,8};
        SimpleSort .sort(arrays01);
        System.out.println();

        int[] arrays02 ={2,4,6,3,9,7,1,8};
        SelectionSort.Selectionsort(arrays02);
        System.out.println();

        int[] arrays03 ={2,4,6,3,7,9,7,1,8};
        InsertionSort.insertionSort(arrays03);
        System.out.println();

        int[] arrays04 ={2,4,6,3,7,9,7,1,8};
        ShellSort.shellsort(arrays04);
        System.out.println();

        int[] array05 = new int[] { 9, 7, 8, 6, 5, 4, 3, 2, 10 };
        MergeSort.mergeSort(array05);
        for(int t=0; t< array05.length;t++)
        { System.out.print(array05[t]+" ");}
        System.out.println();

        int[] array06={2,6,87,2,4,65,78,9};
        QuickSort.quicksort(array06);
        for(int t=0; t< array06.length;t++)
        { System.out.print(array06[t]+" ");}
        System.out.println();





    }







}
