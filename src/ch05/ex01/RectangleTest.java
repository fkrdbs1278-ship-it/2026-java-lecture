package ch05.ex01;

public class RectangleTest {
    static void main() {
        Rectangle rectangle01 = new Rectangle(20,13);
        System.out.println("넓이:"+rectangle01.getArea());
        System.out.println("둘레:"+rectangle01.getPerimeter());
    }
}
