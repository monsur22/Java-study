package oop;

public class Inheritance {
    int roll, marks;
    String name;

    void input() {
        System.out.println("Enter roll , name and marks: ");
    }
}

class SubClass extends Inheritance {
    public static void main(String[] args) {
        SubClass ref = new SubClass();
        ref.input();
        ref.display();
    }

    void display() {
        roll = 1;
        name = "Monsur";
        marks = 50;
        System.out.println(roll + " " + name + " " + marks);
    }
}