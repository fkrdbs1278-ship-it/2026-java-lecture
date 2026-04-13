package ch05.ex02;

public class Rectangle extends Shape{
    @Override
    void area(){
        int area =width*hight;
        System.out.println("넓이는: "+area);
    }
}
