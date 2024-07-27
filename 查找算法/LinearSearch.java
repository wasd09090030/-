package 查找算法;

public class LinearSearch {

    //线性查找，时间复杂度On
    public static int linearsearch(String[] value, String fromArray,int begin,int end){
        for(int i=begin;i<end;i++){
            if(value[i].equals(fromArray)){
                return i ;
            }
        }
        return -1;
    }
}
