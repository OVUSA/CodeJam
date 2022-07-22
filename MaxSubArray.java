import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSubArray {
    public static void main(String [] args){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        if(nums.length==1){
            return nums[0];
        }
        for(int num:nums){
            // сравнить сумму предыдущих цифр c настоящим число ,если сумма больше то добавляем в сумму
            // в обратном случаи сознадем новый массив
            if((sum+num)> num){
                sum+=num;
            }else{
                sum=num;
            }
            max = Math.max(sum,max);

        }
        return max;
    }
}
