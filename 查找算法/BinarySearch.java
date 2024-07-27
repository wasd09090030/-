package 查找算法;

public class BinarySearch {

    //二分查找：只适用于有序的一组元素，O(log2n)
    //第一种：折半,还有另一种递归式
    public static int Binarysearch (int[]value, int fromArray,int begin,int end){

        int low=begin;
        int high=end;

        while(low<=high){

            int mid = (low+high-1)/2;


            if(value[mid]==fromArray){
                return mid;
            }
             if(value[mid]<fromArray){
                low=mid+1;
            }
             if (value[mid]>fromArray) {
                high=mid-1;
            }

        }
        return -1;
    }


}
