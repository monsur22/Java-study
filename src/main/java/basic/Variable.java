package basic;

public class Variable {
    static  int s = 10; // Static variable
    int i = 15;  // Instance variable
    public static void main(String[] args) {
        int a = 5;  //Local variable
        Variable ref = new Variable();
        System.out.println(a);
        System.out.println(Variable.s);
        System.out.println(ref.i);
    }
}
