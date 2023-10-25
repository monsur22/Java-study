package basic;

public class Factorial {
    public static void factorial(int n){
        int fact = 1;
        if(n<0){
            System.out.println("invalid number");
        }
        for(int i=n; i>=1;i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.factorial(3);

    }
}
