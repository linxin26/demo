package co.solinx.leetCode.twosum;

import java.util.Arrays;

/**
 * Created by lin8x_000 on 2015-09-19.
 */
public class TwoSum {

    public static void main(String[] args){
        TwoSum solution=new TwoSum();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 1, 9, 4, 4, 56, 90, 3}, 8)));
    }

    public int[] twoSum(int[] nums,int target){
        int[] result=null;
        for (int i=0;i<nums.length;i++){
            for (int x = i+1; x < nums.length; x++) {
                if (nums[i] +nums[x]== target) {
                    result=new int[2];
                    result[0] = i+1;
                    result[1] = x+1;
                    break;
                }
            }
            if(result!=null){
                break;
            }
        }
        return result;
    }

}
