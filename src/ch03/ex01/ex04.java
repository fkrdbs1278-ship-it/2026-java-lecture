package ch03.ex01;

public class ex04 {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "짝수");
            } else if (i % 2 == 1) {
                System.out.println(i + "홀수");
            }
        }
    }
}
