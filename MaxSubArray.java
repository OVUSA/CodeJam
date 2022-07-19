import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSubArray {
    public static void main(String [] args){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }


    public static int maxSubArray(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }

        List<Integer> sums= new ArrayList<>();

        int i= 0;
        int j = nums.length-1;
        int left = nums[0];
        int right = nums[nums.length-1];

        while(i<nums.length-1){
            if((left+nums[i+1])<=( right+nums[j-1])){
                sums.add(right+nums[j-1]);
                right +=nums[j-1];
                j--;

            }else{
                sums.add(left+nums[i+1]);
                left +=nums[i+1];
                i++;

            }
        }
        Collections.sort(sums);
        return sums.get(sums.size()-1);

    }
}
