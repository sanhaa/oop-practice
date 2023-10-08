package org.oop.vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        vehicleExample(); // 다형성

        vehicleExample2(); // getter, setter
    }
    public static void vehicleExample(){
        System.out.println("vehicleExample을 실행합니다.");

        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        Driver driver = new Driver();
        driver.drive(car); // 매우 높은 결합도
        driver.drive(motorBike);

        // 다형성을 활용한 객체 생성 방식
        Vehicle myCar = new Car(); // 여전히 높은 결합도

        driver.drive(myCar);


    }

    public static void vehicleExample2(){

        Car car2 = new Car("Genesis", "Black"); // 생성자를 이용한 객체 생성
        car2.printCarInfo();

        // 객체 값을 가져오거나 변경하고 싶을 때
        // System.out.println("내 차 모델 출력:" + car2.model); // private이라 접근 불가능
        System.out.println("내 차 모델은: "+car2.getModel());

        car2.setModel("Volvo XC60");
        car2.printCarInfo();
    }

}