package co.solinx.leetCode.SingleNumberII;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by linx on 2015/9/16.
 */
public class Solution {

    public static void main(String[] args){

        Solution solution=new Solution();
        System.out.println(solution.singleNumber(new int[]{2}));

    }

    public int singleNumber(int[] nums){

        int result=0;
        Map map=new HashMap<>();
        for (int temp:nums){
            if(map.containsKey(temp)) {
                map.put(temp,Integer.valueOf((Integer) map.get(temp))+1);
            }else{
                map.put(temp,1 );
            }
        }

        for (Object temp:map.keySet()){
            if(!map.get(temp).equals(3)){
                result= (int) temp;
            }
        }

        return result;
    }

}
