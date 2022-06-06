package oop;

abstract class MotorbikeHunda {
    abstract void brake();
}

class SportBike extends MotorbikeHunda {
    @Override
    void brake() {
        System.out.println("Sport Bike Brake.");
    }
}

class MountainBike extends MotorbikeHunda {
    @Override
    void brake() {
        System.out.println("Mountain Bike Brake.");
    }
}

public class AbstructionMethod {
    public static void main(String[] args) {
        SportBike sportBike = new SportBike();
        sportBike.brake();

        MountainBike mountainBike = new MountainBike();
        mountainBike.brake();
    }
}
