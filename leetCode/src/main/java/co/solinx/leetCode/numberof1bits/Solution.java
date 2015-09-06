package co.solinx.leetCode.numberof1bits;

import java.util.Arrays;

/**
 * Created by linx on 2015/9/6.
 */
public class Solution {

    public static void main(String[] args){
         Solution solution=new Solution();
        System.out.println(solution.numberof2(88888888));
    }


    public int numberof(int num){
        int sum=0;
        String temp=Integer.toBinaryString(num);
        char[] chars=temp.toCharArray();
        for (char ch: chars) {
            if(ch=='1'){
                sum++;
            }
        }
        return sum;
    }

    public int numberof2(int num){
        int sum=0;
        System.out.println(Integer.numberOfLeadingZeros(num));
        long flag=0x80000000l;
        for (int i = 0; i <32; i++) {
            long value=num&(flag>>i);
            System.out.println("value : "+value +" i="+i);
            if(value!=0){
                sum++;
            }
        }
        return sum;
    }


}
