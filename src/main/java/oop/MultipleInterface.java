package oop;

interface FirstInterface {
    void myMethod();
}

interface SecondInterface {
    void anotherMethod();
}

public interface MultipleInterface {
    static void main(String[] args) {
        Demo demo = new Demo();
        demo.myMethod();
        demo.anotherMethod();
    }
}

class Demo implements FirstInterface, SecondInterface {
    @Override
    public void myMethod() {
        System.out.println("First Interface");
    }

    @Override
    public void anotherMethod() {
        System.out.println("Second Interface ");
    }
}
