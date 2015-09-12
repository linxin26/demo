package co.solinx.leetCode.poweroftwo;

/**
 * Created by lin8x_000 on 2015-09-12.
 * 判断n是否是2的N次幕（偶数）
 */
public class Solution {

    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.isPowerOfTwo(15));
        System.out.println(solution.isPowerOfTwo2(16));
    }

    /**
     * 根据能整除来判断
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n){

        boolean result =true;
        if(n<1){
            result=false;
        }
        while(n>1){
            if(n%2==1){
                result=false;
            }
            n/=2;
        }
        return result;
    }

    /**
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo2(int n){
        /**
          二进制
          1
          10
          11
          100
          101
          110
          111
         偶数的二进制第一位都是1，根据这个规则使用n&n-1就可以判断该数是否为2的N次幂

         */
        boolean result=false;

        if(n>0) {
            if (n == 1) {
                result = true;
            }
            if ((n & (n - 1)) == 0) {
                result = true;
            }
        }

        return result;
    }


}
