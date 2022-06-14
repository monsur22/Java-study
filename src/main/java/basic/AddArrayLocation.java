package basic;

import java.util.Scanner;

public class AddArrayLocation {
    public static void main(String[] args) {
        System.out.println("Enter the Array size: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        System.out.println("Enter the Array: ");

        int a[] = new int[size + 1];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("The Array :");

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("Enter the Index: ");

        int index = s.nextInt();
        System.out.println("Enter the value: ");

        int value = s.nextInt();
        //If we create a new array b[] then apply this code
/*
        int b[] = new int[size+1];
        for(int i = 0; i<size+1; i++){
            if(i<index){
                b[i] = a[i];
            }else if(i == index){
                b[i] = value;
            }else{
                b[i] = a[i-1];
            }
        }
        System.out.println("New Array will be:");
        for(int i = 0; i<size+1;i++){
            System.out.print(b[i]+" ");
        }
*/
        //if we user old array user this code
        for (int i = size; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = value;
        size++;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }


}
