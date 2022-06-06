package oop;

interface InterfaceMethod {
    void frontEndTask();

    void backEndTask();
}

abstract class FrontendDev implements InterfaceMethod {
    @Override
    public void frontEndTask() {
        System.out.println("Complete FrontEnd Task By Front End Dev");
    }
}

class BackendDev extends FrontendDev {
    @Override
    public void backEndTask() {
        System.out.println("Backend task done By Backend and extend frontend dev class");
    }

}

class InterfaceMethodMain {
    public static void main(String[] args) {
        BackendDev backendDev = new BackendDev();
        backendDev.backEndTask();
        backendDev.frontEndTask();
    }
}
