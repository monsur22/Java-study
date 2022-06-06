package oop;

public interface Interface {
    void identify(String name, String phone);
}

class Address implements Interface {
    @Override
    public void identify(String name, String phone) {
        System.out.println("Name: " + name + " Phone Number: " + phone);
    }
}

class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.identify("Monsur", "01632114455");
    }
}