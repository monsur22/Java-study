package basic;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array:");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        System.out.println("Enter The array: ");
        int[] nums = new int[size];
        for (int i = 0; i<size; i++){
            nums[i] = s.nextInt();
        }
        System.out.println("The array: ");
        for (int i = 0; i<size; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("Enter the target :");
        int target = s.nextInt();
        for (int i = 0; i<nums.length; i++){
            if(nums[i]+nums[i+1] == target){
                System.out.println(nums[i]+"+"+nums[i+1]+"="+target);
            }

        }
        System.out.print("not equal");
    }
}
