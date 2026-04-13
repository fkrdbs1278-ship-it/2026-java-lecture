package ch04;

public class Circle {
    int radius = 10;
    String name;
    Circle(){
        System.out.println("나는 매개변수를 가지는 생성자 함수이다");
        radius=100;
    }
    Circle(int _radius){
        System.out.println("나는 매개변수를 가지는 생성자 함수이다");
        radius = _radius;
    }
    Circle(String _name, int _radius){
        System.out.println("나는 매개변수를 가지는 생성자 함수이다");
        radius = _radius;
        name = _name;
    }
    double getArea() {
        return  radius*radius*3.14;
    }
}
