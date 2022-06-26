package basic;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int digits[] = {9,8,7,6,5,4,3,2,};
//        int res=0;
//        for(int i=0;i<digits.length;i++) {
//            res=res*10+digits[i];
//        }
//        int result  = res + 1;
//
//        System.out.println(Arrays.toString(digits));
//        System.out.println(res);
//        System.out.println(result);
//
//        String temp = Integer.toString(result);
//        int[] newGuess = new int[temp.length()];
//        for (int i = 0; i < temp.length(); i++)
//        {
//            newGuess[i] = temp.charAt(i) - '0';
//        }
//        System.out.println(Arrays.toString(newGuess));

        for(int i=digits.length-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
//                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int [digits.length+1];
        newNumber[0] = 1;
//        return newNumber;
        System.out.println(Arrays.toString(newNumber));
    }
}
