package oop;

abstract class Motorbike {
    void color() {
        System.out.println("Bike colour is Blue;");
    }
}

// cannot use without extends.
class AbstractionClass extends Motorbike {
    public static void main(String[] args) {
        AbstractionClass ref = new AbstractionClass();
        ref.color();
    }
}
