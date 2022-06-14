package basic;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        System.out.println("Enter the Array size: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        System.out.println("Enter the Array: ");

        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("The Array :");

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("Enter the Index for Delete: ");

        int index = s.nextInt();
        //If we create a new array b[] then apply this code
        /*
        int b[] = new int[size-1];
        for(int i = 0; i<a.length; i++){
            if(i<index){
                b[i] = a[i];
            }else if(i == index){
                b[i] = a[i-1];
            }else{
                b[i-1] = a[i];
            }
        }
        System.out.println("New Array will be:");
        for(int i = 0; i<size-1;i++){
            System.out.print(b[i]+" ");
        }

         */
        //if we user old array user this code

        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;
        System.out.println("New Array After Delete: ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }

    }
}
