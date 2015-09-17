package co.solinx.leetCode.containsduplicate;

import java.util.*;

/**
 * Created by linx on 2015/9/17.
 */
public class Solution {

    public static void main(String[] args){

         Solution solution=new Solution();
        System.out.println(solution.containsDuplicate(new int[]{}));
    }


    public boolean containsDuplicate(int[] nums){

        boolean result=false;
        Map map=new HashMap<>();
        for (Integer temp:nums){
            if(map.containsKey(temp)){
                map.put(temp,Integer.valueOf((Integer) map.get(temp))+1);
            }else {
                map.put(temp, 1);
            }
        }
        for (Object temp:map.values()){
            if(Integer.valueOf(temp.toString())>=2){
                result=true;
            }
        }
        if (nums.length==0){
            result=false;
        }
//        for (Iterator iterator= map.entrySet().iterator();iterator.hasNext();){
//             Map.Entry entry= (Map.Entry) iterator.next();
//        }
        return result;
    }

}
