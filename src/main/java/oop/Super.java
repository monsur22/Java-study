package oop;

class Animal {
    void eat() {
        System.out.println("I can eat || Super class");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        super.eat(); // call super class method
        System.out.println("I eat dog food. || Override in Sub Class");
    }

    void bark() {
        System.out.println("I can Barking.");
    }
}

public class Super {
    public static void main(String[] args) {
        Dog ref = new Dog();
        ref.eat();
        ref.bark();
    }
}
