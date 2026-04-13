package ch05.ex02;

public class Car extends Vehicle{
    @Override
    void accelerate(){
        speed = speed+20;
        System.out.println(speed);
    }
}
