package co.solinx.leetCode.HIndex;

import java.util.*;

/**
 * Created by linx on 2015/9/10.
 */
public class Solution {

    public static void main(String[] args){
         Set<String> NON_WORDS = new HashSet<String>() {{
            add("the"); add("and"); add("of"); add("to"); add("a");
            add("i"); add("it"); add("in"); add("or"); add("is");
            add("d"); add("s"); add("as"); add("so"); add("but");
            add("be"); }};
        Solution solution=new Solution();
        System.out.println(solution.hIndex(new int[]{102}));
    }

    /**
     * 得到H-index（H指数）
     * According to the definition of h-index on Wikipedia:
     * "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."
     * h-index含义：至少有X篇文章被引用x次
     *
     * 思路：遍历引用次数检查x次引用是否有x篇文章
     * @param citations
     * @return
     */
    public int hIndex(int[] citations){
            int sum = citations.length;
            int hIndex=0;
            if(sum>0) {
                int a=1;
                while(true){
                            int x=0;
                            for (int temp:citations) {
                                if(temp!=0) {
                                    if (temp >= a) {
                                        x++;
                                    }
                                }
                            }
                          //不满足X篇文章被引用x次
                            if(x<a){
                                //hIndex为上一个值
                                hIndex=a-1;
                                break;
                            }
                        a++;
                    }
                }
            return hIndex;
    }

}
