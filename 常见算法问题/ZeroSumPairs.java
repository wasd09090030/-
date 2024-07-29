package 常见算法问题;

public class ZeroSumPairs {


    //求出一个数组中的数互不相同，求其中和为 0 的数对的个数。（枚举算法）
    //普通解法
    //for (int i = 0; i < n; ++i)
    //  for (int j = 0; j < n; ++j)
    //      if (arr[i] + arr[j] == 0) {
    //              count++;
    //          }



    //优化搜寻条件
    //题中未说明分不分顺逆序，因此需要X2

    public static int countZeroSumPairs(int[] arr) {
        int count = 0; // 用于计数和为0的数对个数
        int n = arr.length; // 数组的长度

        // 枚举所有的数对
        //为了节约时间，设定寻找的范围
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    // 测试函数
    public static void main(String[] args) {
        int[] arr = { 2, -2, 3, -3, 4, -4, 5, -5, 1 };
        int result = countZeroSumPairs(arr);
        System.out.println("和为0的数对个数: " + result*2);
    }
}
