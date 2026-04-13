package ch05.ex02;

public class Circle extends Shape{

    @Override
    double pi;
    double radius;
    void area(){
        double area = radius*radius*pi;
        System.out.println(area);
    }
}
