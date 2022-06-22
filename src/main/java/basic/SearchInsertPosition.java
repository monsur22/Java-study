package basic;

public class SearchInsertPosition {
    static int searchInsert(int[] nums, int target) {
        ////linear search
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            if( target == nums[i] ){
//                return i;
//            }
//            else if(target < nums[i]){
//                return i;
//            }
//            else if(target>nums[i] && target<=nums[i+1]){
//                return i+1;
//            }
//            else if( target>nums[i+1] && (nums.length-1==i+1) ){
//
//                return nums.length;
//            }
//            else if(target<nums[i] && i==0){
//                i = 0;
//                return i;
//            }
//        }
//        return n;

        //binary search
        int low = 0;
        int high = nums.length - 1;

        while(low<=high){
            int mid = low +(high - low)/2;
            if(nums[mid]  == target){
                return mid;
            } else if(nums[mid] > target){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 5;
        searchInsert(nums,target);

        System.out.println(searchInsert(nums,target));
    }

}
