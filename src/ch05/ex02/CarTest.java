package ch05.ex02;

public class CarTest {
    static void main() {
        Vehicle vehicle = new Vehicle();
        vehicle.speed=10;
        System.out.println(vehicle.speed);
        vehicle.accelerate();
        Car car = new Car();
        car.speed=30;
        System.out.println(car.speed);
        car.accelerate();
    }
}
