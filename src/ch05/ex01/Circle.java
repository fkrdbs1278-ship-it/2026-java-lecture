package ch05.ex01;

public class Circle {
    double radius;
    double sum;

    public Circle(double radius) {
        this.radius = radius;
    }
    double getArea(){
        sum = radius*radius*3.14;
        System.out.println("원의 넓이는"+sum);
        return 0;
    }
}
