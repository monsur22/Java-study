package basic;

import java.util.Scanner;

public class AddArrayLocation {
    public static void main(String[] args) {
        int size,location,item,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Array Size: ");
        size = s.nextInt();

        int a[] = new int[size+1];
        System.out.println("Enter The Array: ");

        for (i = 0; i<a.length;i++){
            a[i] = s.nextInt();
        }

        System.out.println("Enter Array Location: ");
        location = s.nextInt();

        System.out.println("Enter new Element: ");
        item = s.nextInt();

        for (i=size; i>location;i--){
            a[i]=a[i-1];
        }
        a[location] = item;
        size++;

        for (i = 0; i<a.length;i++){
            System.out.println(a[i]+"");
        }

    }



}
