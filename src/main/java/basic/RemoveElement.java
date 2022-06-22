package basic;
import java.util.*;
public class RemoveElement {
    public static void main(String[] args) {
//        int a[] = new int[5];
        int a[] = {1,2,2,3,9,9,4,5};
        int n = 9;
        int size = a.length;
        int j = 0;
        for (int i = 0; i < size; i++) {
            if(a[i] != n){
                a[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
