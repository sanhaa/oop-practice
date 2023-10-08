package org.oop.vehicle;

public class MotorBike implements Vehicle {

    @Override
    public void moveForward() {
        System.out.println("오토바이 전진!! >>> ");
    }

    @Override
    public void moveBackward() {
        System.out.println("오토바이 후진!! <<< ");

    }
}
