package ch02.Answer01;

public class Answer08 {
    static void main() {
        double a = 0;
        double b = 5;
        double result = 0;
        String operator = "/";
        if (operator == "+") {
            result = a + b;
        } else if (operator == "-") {
            result = a - b;
        } else if (operator == "*") {
            result = a * b;
        } else {
            if (b == 0 || a == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
            result = a / b;
        }
        System.out.printf("%.0f %s %.0f = %.2f", a, operator, b, result);

    }
}
