package basic;

import java.util.Arrays;

public class LengthLastWord {
    public static void main(String[] args) {
        String a = "Geeks For Geeks";
        String word[] = a.split(" ");
        int length = 0;
        if(word.length > 0){
            length = word[word.length-1].length();
        } else{
            length = 0;
        }
        System.out.println(length);
        System.out.println(word[0]);
    }
}
