package binary;

public class GuessNumber {
    public static int myFunction(int n){
        int guess = 5;
        int low = 0;
        int high = n;

//        -1: Your guess is higher than the number I picked (i.e. num > pick).
//        1: Your guess is lower than the number I picked (i.e. num < pick).
////        0: your guess is equal to the number I picked (i.e. num == pick).
        while (low<=high){
            int mid = low+(high-low)/2;
//            int guessNumber = guess(mid);
//            if (guessNumber == -1) {
//                high = mid - 1;
//            } else if (guessNumber == 1) {
//                low = mid + 1;
//            } else {
//                return mid;
//            }

            if (mid>guess){
                high = mid+1;
            } else if(mid<guess){
                low = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        GuessNumber obj = new GuessNumber();
        int result = obj.myFunction(100);
        if (result == -1) {
            System.out.println("Target  is not found in the range.");
        } else {
            System.out.println("Target  is found");
        }
    }
}
