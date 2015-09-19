package co.solinx.leetCode.reverseinteger;

import java.util.ArrayList;

/**
 * Created by lin8x_000 on 2015-09-19.
 */
public class Solution {

    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.reverse(1463847412));
    }

    public int reverse(int x){

        int sum;
         long reverse = 0;
        int min=0x80000000;
        int max=0x7FFFFFFF;
        while (x!=0){
            sum=x%10;
             x=x/10;
            reverse=reverse*10+sum;
        }
        if(reverse>max||reverse<min){
            reverse=0;
        }
        return (int) reverse;
    }

}
