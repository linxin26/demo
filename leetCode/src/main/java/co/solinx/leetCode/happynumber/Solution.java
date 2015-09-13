package co.solinx.leetCode.happynumber;

import java.util.ArrayList;

/**
 * Created by lin8x_000 on 2015-09-13.
 */
public class Solution {

    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.oneNumber(987));
        System.out.println(solution.isHappyNumber(999));
    }

    public boolean isHappyNumber(int n){

        boolean result=false;
        int square=n;
        ArrayList record=new ArrayList();
        while(true){
             square= this.square(square);
            if(square==1){
                result=true;
                break;
            }else if(record.contains(square)){
                break;
            }else{
                record.add(square);
            }
        }
        return result;
    }

    public int square(int n){
        String number= String.valueOf(n);
        int num=0;
        for (char temp:number.toCharArray()){
            num+=(Integer.valueOf(String.valueOf(temp))*Integer.valueOf(String.valueOf(temp)));
        }
        return num;
    }

    public int oneNumber (int i){
        int j = 0;
        while(i != 0){
             j=i%10;
            i = i /10;
            System.out.println(j);
        }
        return j;
    }
}
