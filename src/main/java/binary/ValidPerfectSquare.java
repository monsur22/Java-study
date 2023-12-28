package binary;

public class ValidPerfectSquare {

    public static  boolean myFunciton(int num){
        int start = 0;
        int end = num;
        while (start<=end){
            int mid = start + (end-start)/2;
            long square = (long) mid * mid; // Use long to avoid integer overflow
            if(square == num){
                return true;
            } else if(square >num){
                end = mid-1;
            } else if(square<num){
                start = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ValidPerfectSquare obj = new ValidPerfectSquare();
        int num = 16;
        obj.myFunciton(num);

    }
}
