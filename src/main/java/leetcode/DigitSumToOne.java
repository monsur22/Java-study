package leetcode;

public class DigitSumToOne {

    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            // Calculate the sum of digits
            while (num > 0) {
                sum += num % 10; // Extracts the last digit and adds it to sum
                num /= 10;       // Removes the last digit from num
            }

            // Assign the sum to num for next iteration
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        DigitSumToOne digitSum = new DigitSumToOne(); // Creating an instance of the DigitSumToOne class

        int number = 38; // Assigning the number to be processed
        int result = digitSum.addDigits(number); // Calling the addDigits method with the number

        System.out.println("The final result after adding digits to one digit: " + result); // Printing the final result
    }
}