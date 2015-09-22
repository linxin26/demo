package co.solinx.leetCode.rotatearray;

import java.util.Arrays;

/**
 * Created by linx on 2015/9/21.
 */
public class Solution {

    public static void main(String[] args){

        Solution solution=new Solution();
        solution.rotate(new int[]{1,2},3);
    }

    public void rotate(int[] nums,int k){
        int size=nums.length;
         int[] result=new int[size];
        int temp=size-k,num=0;
//        System.out.println(temp);
        if(size>=k) {
            for (int i = temp; i < size; i++) {
                result[num++] = nums[i];
            }
            for (int i = 0; i < temp; i++) {
                result[num++] = nums[i];
            }
        }else if(k>size){
            for (int i = nums.length-1, x=0; i >=0; i--) {
                result[x++]=nums[i];
            }
        }

        if(k<=size){
            for (int i = 0; i < size; i++) {
                nums[i]=result[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(result));
    }

}
