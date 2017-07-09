package co.solinx.leetCode.wordbreak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by linx on 2015/9/21.
 */
public class Solution {

    public static void main(String args[]){

        Solution solution=new Solution();
        HashSet set= new HashSet<String>();
//        set.add("leet");
//        set.add("code");
        set.add("a");
        set.add("abc");
        set.add("b");
        set.add("cd");
        System.out.println(solution.wordBreak("abcd", set));
    }

    public boolean wordBreak(String s,Set<String> wordDict){
        Boolean result=false;
        if(wordDict.size()>0) {
            String total ="";
            for (String temp : wordDict) {
                total+=temp;
                if (temp.indexOf(s) !=-1) {
                    result = true;
                }
            }

            Object[] str= wordDict.toArray();
            for (int i = 0; i <str.length; i++) {
                for (int j = i+1; j < str.length; j++) {
                    String temp=str[i].toString()+str[j].toString();
                    System.out.println(temp);
                    if((temp).equals(s)){
                        result=true;
                    }
                }
            }

            if(total.equals(s)){
                result=true;
            }

        }else{
            result=false;
        }
        return result;
    }

}
