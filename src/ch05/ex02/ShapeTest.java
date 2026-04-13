package ch05.ex02;

public class ShapeTest {
    static void main() {
        Rectangle rectangle = new Rectangle();
        rectangle.hight = 10;
        rectangle.width = 25;
        rectangle.area();

        Circle circle = new Circle();
        circle.radius = 5;
        circle.pi=3.14;
        circle.area();
    }
}
