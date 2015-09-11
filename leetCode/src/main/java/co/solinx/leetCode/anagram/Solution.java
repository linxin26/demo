package co.solinx.leetCode.anagram;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by linx on 2015/9/11.
 */
public class Solution {


    public static void main(String[] args){

        Solution solution=new Solution();
        System.out.println(solution.anagram(null, null));

    }

    /**
     * 回文构词法，有颠倒顺序的字幕顺序组成的单词，字母与字母个数不变只是改变了字母顺序
     * For example,
     * s = "anagram", t = "nagaram", return true.
     * s = "rat", t = "car", return false.
     * @param str1
     * @param str2
     * @return
     */
    public boolean anagram(String str1,String str2){

        boolean valid=false;
        Map map=new HashMap<>();
        if(str1!=null&&str2!=null&&str1.length()==str2.length()) {
            //存储每个字母的个数
            for (char temp : str1.toCharArray()) {
                if (map.containsKey(temp)) {
                    map.put(temp, Integer.parseInt(map.get(temp).toString()) + 1);
                } else {
                    map.put(temp, 1);
                }
            }

            for (char temp : str2.toCharArray()) {
                if (map.containsKey(temp)) {
                    Integer sum = (Integer) map.get(temp);
                    if (sum == 1) {
                        map.remove(temp);
                    } else if (sum > 1) {
                        sum -= 1;
                        map.put(temp, sum);
                    }
                } else {
                    break;
                }
            }
            if (map.size() == 0) {
                valid = true;
            }
        }
        return valid;
    }

}
