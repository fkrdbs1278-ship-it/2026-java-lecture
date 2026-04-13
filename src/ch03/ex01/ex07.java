package ch03.ex01;

public class ex07 {
    static void main() {

        for (int dan = 2; dan < 10; dan++) {
            for (int i = 1; i < 10; i++) {
                if (dan % 2 == 0) {
                    System.out.println(dan + "x" + i + "=" + dan * i);
                }
            }
        }
    }
}
