package ch02.Answer01;

public class Answer04 {
    static void main() {
        int a = 20, b = 100, c = 33;
        int center = 0;
        System.out.println(center);
        if ((a >= b && a < c) || (a >= c && a <= c)) {
            center = a;
        } else if (b >= a && b <= c || b <= a && b >= c) {
            center = b;
        } else {
            center = c;
        }
        System.out.println("세 숫자" + a + "," + b + "," + c + "의 중간은" + center + "입니다.");
    }
}
