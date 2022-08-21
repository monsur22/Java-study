package basic;

import java.util.Arrays;

public class Longest_common_prefix {
    public static void main(String[] args) {
        String a[] = {"club","clap","clove"};
        Arrays.sort(a);

        char[] first = a[0].toCharArray();
        char[] last = a[a.length-1].toCharArray();
        System.out.println("The String Array");
        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+",");
        }
        System.out.print("The longest common prefix: ");
        for (int i=0; i<a.length; i++)
        {
            if(first[i] != last[i])
                break;
            System.out.print(first[i]);
        }

    }
}
