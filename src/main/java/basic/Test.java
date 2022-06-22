package basic;

import java.util.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum  = 0;
        for(int i = 0; i<nums.length; i++){
            sum = nums[i]+sum;
        }
//        return sum;
        System.out.println(sum);
    }

}
