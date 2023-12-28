package binary;

public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        SingleElement obj = new SingleElement();
        int nums[] = {1,1,2,3,3,4,4,8,8};
        int uniqueNumber = obj.singleNonDuplicate(nums);
        System.out.println("The number that does not have a duplicate is: " + uniqueNumber);

    }
}
