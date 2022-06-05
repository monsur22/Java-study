package basic;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        int int_number = 10;
        Scanner scan_number = new Scanner(System.in);
        System.out.println("Enter your Age");
        int_number = scan_number.nextInt();
        System.out.println( "Your Age is: "+int_number);
    }
}
