package binary;

public class Sqrt {
    public static int myFunciton(int x){
        int start = 0;
        int end = x;
        while (start<=end){
            int mid = start + (end-start)/2;
            long square = (long)mid*mid;
            if(square == x){
                return mid;
            } else if(square>x){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        Sqrt obj = new Sqrt();
        int x = 8;
        int result  = obj.myFunciton(x);
        System.out.println(result);

    }
}
