package basic;

public class AddBinary {
    public static void main(String[] args) {
        String a = "111";
        String b = "01";
        int i = 0;
        int carry = 0;
        String result  = "";

        while (i<a.length() || i<b.length() || carry!=0){
            int x =0, y = 0;
            if(i<a.length() && a.charAt(a.length()-1-i) == '1'){
                x = 1;
            }
            if(i<b.length() && b.charAt(b.length()-1-i) == '1'){
                y = 1;
            }
            result = (x+y+carry)%2+result;
            carry = (x+y+carry)/2;
            i++;
        }
        System.out.println(result);

    }
}
