package oop;

class Student {
    void attend() {
        System.out.println("Student can not Attended Class.");
    }
}

class StuParent extends Student {
    @Override
    void attend() {
        System.out.println("Parents Don't Care Properly.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        StuParent ref = new StuParent();
        ref.attend();
    }
}
