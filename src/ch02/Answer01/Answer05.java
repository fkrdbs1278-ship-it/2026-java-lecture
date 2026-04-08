package ch02.Answer01;

public class Answer05 {
    static void main() {
        int a = 4, b = 3, c = 5;
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("삼각형이 될 수 있습니다.");
        } else {
            System.out.println("삼각형이 될 수 없습니다.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("삼각형이 될 수 없습니다.");
        } else {
            System.out.println("삼각형이 될 수 있습니다.");
        }

    }
}
