package co.solinx.leetCode.adddigits;

/**
 * Created by linx on 2015/9/6.
 */
public class Solution {

    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.addDigits2(11));
    }

    public int addDigits(int num){
        int result=0;
        if(num<10){
            result=num;
        }else{
           char[] temp= String.valueOf(num).toCharArray();
            for (int i = 0; i < temp.length; i++) {
                result=result+Integer.parseInt(String.valueOf(temp[i]));
            }
            result= this.addDigits(result);
        }
        return result;
    }

    public int addDigits2(int num){
        int result=0;
        if (num<10){
            result=num;
        }else{
            while(num>=10){
                char[] temp=String.valueOf(num).toCharArray();
                int item=0;
                for (char ch:temp){
                    int t=Integer.parseInt(String.valueOf(ch));
                    item+=t;
                }
                num=item;
            }
            result=num;
        }
        return result;
    }

}
