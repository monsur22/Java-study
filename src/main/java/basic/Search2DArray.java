package basic;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        System.out.println("Enter THe row and column: ");

        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();

        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter Search Item:");
        int search = s.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == search) {
                    System.out.println("Number found in (" + i + "," + j + ")");
                }
            }

        }
    }
}
