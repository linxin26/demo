package co.solinx.leetCode.SingleNumber;

import java.util.ArrayList;

/**
 * Created by linx on 2015/9/16.
 */
public class Solution {

    public static void main(String[] args){


        Solution solution=new Solution();
        System.out.println(solution.singleNumber(new int[]{1, 1, 2, 2, 3, 4, 4,}));

    }

    public int singleNumber(int[] nums){

        ArrayList array=new ArrayList();
        int result=0;
        for (Integer temp:nums){
            if(array.contains(temp)){
                array.remove((temp));
            }else{
                array.add(temp);
            }
        }
        result= (int) array.get(0);
        return  result;
    }

}
