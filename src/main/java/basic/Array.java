package basic;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int a[] = {5,10};
        int size, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        size = scanner.nextInt();
        int a[] = new int[size];
        for (i=0;i<size;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println("Printed Array element");
        for(i=0;i<size;i++){
            System.out.println(a[i]+"");
        }

        System.out.println();
    }
}
