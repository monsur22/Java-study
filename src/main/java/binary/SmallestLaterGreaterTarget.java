package binary;

public class SmallestLaterGreaterTarget {
    public char myFunction(char letters[], char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Check if the result is within bounds and return it
        if (left < letters.length) {
            return letters[left];
        } else {
            return letters[0];
        }
    }


    public static void main(String[] args) {
        char letters[] = {'c','f','d'};

        SmallestLaterGreaterTarget obj =  new SmallestLaterGreaterTarget();

        char nextElement = obj.myFunction(letters,'c');

        System.out.println(nextElement);
    }
}
