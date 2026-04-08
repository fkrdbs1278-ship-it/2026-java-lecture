package ch03.ex01;

public class ex02 {
    static void main() {
        int num = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
