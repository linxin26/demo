package co.solinx.leetCode.containsduplicate;

/**
 * Created by linx on 2015/9/17.
 */
public class ContainsDuplicateII {

    public static void main(String[] args){

        ContainsDuplicateII containsDuplicate=new ContainsDuplicateII();
        System.out.println(containsDuplicate.ContainsDuplicate(new int[]{99,99}, 2));
    }

    public boolean ContainsDuplicate(int[] nums,int k){

        boolean result=false;
        int len=nums.length;
        for (int i=0;i<len;i++) {
            int indices = i + 1;
            int time=1;
            while (indices < len&&time<=k){
                if (nums[i] == nums[indices]) {
                    result = true;
                    break;
                }
                indices++;
                time++;
           }
            if(result){
                break;
            }
        }
        return result;
    }

}
