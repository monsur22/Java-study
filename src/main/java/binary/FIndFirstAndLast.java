package binary;

public class FIndFirstAndLast {
    public static int[] myFunciton(int nums[], int target){

        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        if (firstIndex == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{firstIndex, lastIndex};
    }
    public static void main(String[] args) {

        FIndFirstAndLast obj = new FIndFirstAndLast();
//        int nums[] = {5,7,7,8,8,9,10};
        int nums[] = {1,3,3,3};
//        obj.myFunciton(nums,8);
        int[] indices = obj.myFunciton(nums,3);

// Print the indices of the target element.
        for (int i = 0; i < indices.length; i++) {
            System.out.println(indices[i]);
        }

    }
}
