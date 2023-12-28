package leetcode;

public class HappyNumber {

    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        HappyNumber obj = new HappyNumber();
        int numToCheck = 7;
        boolean result = obj.isHappy(numToCheck);
        System.out.println("Is " + numToCheck + " a Happy Number? " + result);
    }
}
