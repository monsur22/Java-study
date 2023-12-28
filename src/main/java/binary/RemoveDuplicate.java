package binary;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int count = 0;
        int nums[] = {1,2,3,4,3,3};
        int newArray[] = new int[nums.length];
        for(int n:nums){
            boolean isDuplicate = false;
            for(int i = 0; i<=nums.length-1;i++){
                if(newArray[i] == n){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                newArray[count] = n;
                count++;
            }
        }
        System.out.println(count);
        for (int i =0;i<=count-1;i++){
            System.out.println(newArray[i]);
        }
    }
}
