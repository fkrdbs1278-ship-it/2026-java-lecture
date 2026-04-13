package ch04;

public class CircleTest {
    static void main() {
        Circle circle = new Circle();
        circle.radius = 10;
        circle.name="자바 피자";
        double area = circle.getArea();
        System.out.println(circle.name+"의 면적은 "+area+"입니다.");
    }
}
