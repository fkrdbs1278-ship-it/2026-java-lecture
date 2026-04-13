package ch05.ex02;

public class Circle extends Shape{
    double pi;
    double radius;
    void area(){
        double area = radius*radius*pi;
        System.out.println("원의 넓이는: "+area);
    }
}
