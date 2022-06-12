package basic;

import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {
        int a[] = {1,2,4,5};
        int l = a.length;
        int newArr[] = new int[l+1];
        int value = 3;
        System.out.println(Arrays.toString(a));
        for (int i=0;i<l;i++){
            newArr[i] = a[i];
        }
        newArr[l] = value;
        System.out.println(Arrays.toString(newArr));
    }
}
