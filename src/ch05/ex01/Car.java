package ch05.ex01;

public class Car {
    String brand;
    int speed;
    void showInfo(){
        System.out.println("브랜드: "+brand+" 속도: "+speed);
    }

    void accelerate(){
        speed = speed+10;
        System.out.println("현재 속도는: "+speed);

    }
    void decelerate(){
        if (speed>0){
            speed = speed-10;
        }
        System.out.println("현재 속도는: "+speed);

    }
}
