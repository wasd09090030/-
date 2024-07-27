package 查找算法;

public class Main {

    public static void main(String[] args){
        String[] ss={"apple","pine","pineapple","water","alex"};
        int index=LinearSearch.linearsearch(ss,"pine",0,ss.length);
        System.out.println(ss[index]+" index is "+index);



        int[] s2={1,2,4,5,6,7,9,12,13,22,32};
        int index01=BinarySearch.Binarysearch(s2,5,0,s2.length);
        System.out.println(s2[index01]+" index is "+index01);


    }
}
