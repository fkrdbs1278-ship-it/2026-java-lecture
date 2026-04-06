public class CircleArea {
    static double circleArea(double radius){
        final double PI =3.14;
        double result = radius*radius*PI;
        return result;
    }
    static void main() {
        System.out.println(circleArea(5));
    }
}
