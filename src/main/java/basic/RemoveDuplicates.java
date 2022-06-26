package basic;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[] = {0,0,1,1,1,2,2,3,3,4};
        int j = 0;
        for(int i = 0; i<a.length-1; i++){
            if(a[i] != a[i+1]){
                a[j] = a[i];
                j++;
            }
        }

        a[j++] = a[a.length-1];
        for(int i = 0; i<j; i++){
            System.out.println(a[i]);
        }

        ////second solution
//        int nums[] = {0,0,1,1,1,2,2,3,3,4};
//        int j = 1;
//        for(int i = 0; i<nums.length-1; i++){
//            if(nums[i] != nums[i+1]){
//                nums[j] = nums[i+1];
//                j++;
//            }
//        }
//        for(int i = 0; i<j; i++){
//            System.out.println(nums[i]);
//        }


    }
}
