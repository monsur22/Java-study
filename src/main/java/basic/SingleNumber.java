package basic;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int a[] = {2,2,1};
        int result = 0, i;
        for(i = 0; i<a.length; i++){
            result ^= a[i];
        }

        System.out.println(result);
    }
}
