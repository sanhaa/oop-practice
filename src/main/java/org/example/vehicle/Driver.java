package org.oop.vehicle;

public class Driver {
    void drive(Car car){
        car.moveForward();
        car.moveBackward();
    }

    void drive(MotorBike motorBike){
        motorBike.moveForward();
        motorBike.moveBackward();
    }

    void drive(Vehicle vehicle){
        System.out.println("Vehicle drive");
        vehicle.moveForward();
        vehicle.moveBackward();
    }
}
