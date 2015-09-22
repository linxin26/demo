package co.solinx.leetCode.plusone;

import java.util.Arrays;

/**
 * Created by linx on 2015/9/21.
 */
public class Solution {

    public static void main(String[] args){

        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 2, 3, 4, 5})));
    }

    public int[] plusOne(int[] digits){
        int[] result=new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            result[i]=digits[i]+1;
        }
        return result;
    }

}
