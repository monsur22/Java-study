package basic;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        System.out.println("Enter row and column:");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();

        int a[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
