package basic;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int aLength = a.length;
        int bLength = b.length;
        int c[] = new int[aLength+bLength];
        int i = 0,j = 0,k = 0;

//        for( i = 0; i < bLength; i++){
//            a[aLength + i] = b[i];
//        }
//
//        System.out.println(a[i]);

        while (i < aLength && j<bLength){
            if (a[i] < b[j]){
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        while (i < aLength){
            c[k++] = a[i++];
        }
        while (j < bLength){
            c[k++] = b[j++];
        }
        for (i = 0; i<(aLength+bLength);i++){
            System.out.print(c[i]+" ");
        }
    }
}
