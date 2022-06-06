package oop;

class Person {
    private int age;

    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        age = newAge;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person ref = new Person();
        ref.setAge(40);
        System.out.println(ref.getAge());
    }
}
