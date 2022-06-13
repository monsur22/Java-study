package basic;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int size,location,item,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Array Size: ");
        size = s.nextInt();

        int a[] = new int[size];
        System.out.println("Enter The Array: ");

        for (i = 0; i<size;i++){
            a[i] = s.nextInt();
        }

        System.out.println("Enter Array Location: ");
        location = s.nextInt();


        for (i=location; i<size-1;i++){
            a[i]=a[i+1];
        }
        size--;

        for (i = 0; i<size;i++){
            System.out.println(a[i]+"");
        }

    }
}
