package basic;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        System.out.println("Enter The Size");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("Enter The Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        int search = s.nextInt();
        int count = 0;
        System.out.println("Insert search item: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                System.out.println("search item found " + i);
            }
        }
    }
}
