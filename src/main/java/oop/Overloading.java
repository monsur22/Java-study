package oop;

class Identify {
    void display() {
        System.out.println("My Name is Monsur");
    }

    void display(String name) {
        System.out.println("My Name is " + name);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Identify ref = new Identify();
        ref.display();
        ref.display("Karamot Ali");
    }
}
