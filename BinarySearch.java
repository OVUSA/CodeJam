
//nums = [-1,0,3,5,9,12], target = 9
public class BinarySearch {
    public static void main(String[] args) {
       int [] nums = {-1,0,3,5,9,12};
       int target = 9;
       System.out.println("Target number in the posistion :"+ search(nums,target));

    }
        public static int search(int[] nums, int target) {

        return binarySearch(nums,0,nums.length, target);

        }

        public static int binarySearch(int []nums, int start, int end, int target){
            if(start>end){
                return -1;
            }
            int mid = start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                return binarySearch(nums, mid+1,end,target);
            }else{
                return binarySearch(nums, start,mid-1,target);
            }
        }

}
