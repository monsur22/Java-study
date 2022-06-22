package basic;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
//        int a[] = {1,2,4,5,8,9};
//        int i;
//        for( i = 0; i<a.length; i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println(" After Reverse: ");
//        for( i = a.length-1; i >=0; i--){
//            System.out.print(a[i]+" ");
//        }

//       int s[] = {1,2,4,5,8,9};

        String s[] = {"h","e","l","l","o"};
        int start =0, end = s.length-1;
//        int temp;
        String temp;
        while (start < end){
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));


    }
}
