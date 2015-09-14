package co.solinx.leetCode.SingleNumberIII;

import java.util.*;

/**
 * Created by linx on 2015/9/14.
 */
public class Solution {


    public static void main(String[] args){

        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.singleNumber(new int[]{})));
    }

    public int[] singleNumber(int[] nums){

        ArrayList<Integer> singleArray=new ArrayList<>();
        for (Integer temp:nums){
            if(singleArray.contains(temp)){
                singleArray.remove(temp);
            }else{
                singleArray.add(temp);
            }
        }

        int[] result=new int[singleArray.size()];
        for (int i = 0; i < singleArray.size(); i++) {
            result[i]=singleArray.get(i);
        }
        return result;
    }

}
