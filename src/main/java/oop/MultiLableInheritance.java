package oop;

class SuperClass {
    int a, b, c;

    void add() {
        a = 5;
        b = 10;
        c = a + b;
        System.out.println("Sum of Two numbers: " + c);
    }

    void sub() {
        a = 5;
        b = 10;
        c = a - b;
        System.out.println("Sub of Two numbers: " + c);
    }
}

class SubClassA extends SuperClass {
    void multi() {
        a = 5;
        b = 10;
        c = a * b;
        System.out.println("Multiple of Two numbers: " + c);
    }

    void div() {
        a = 5;
        b = 10;
        c = b / a;
        System.out.println("Divided of Two numbers: " + c);
    }
}

class SubClassB extends SubClassA {
    void rem() {
        a = 5;
        b = 10;
        c = b % a;
        System.out.println("Remainder of Two numbers: " + c);
    }
}

public class MultiLableInheritance {
    public static void main(String[] args) {
        SubClassB ref = new SubClassB();
        ref.add();
        ref.sub();
        ref.multi();
        ref.div();
        ref.rem();
    }
}
