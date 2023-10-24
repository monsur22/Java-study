package binary;

public class BinarySearch {
    public  static int  myFunction(int nums[], int target){
        int low = 0;
        int high = nums.length-1;
        while (low <= high){
            int mid = (low + (high-low))/2;

            if (nums[mid] < target){
                low = mid+1;
            }else if (nums[mid]>target){
                high = mid -1;
            } else {
                return mid;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
            BinarySearch obj = new BinarySearch();
            int nums[] = {1,2,3,4};
            int result = obj.myFunction(nums,2);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }

    }
}
