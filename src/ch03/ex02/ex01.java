package ch03.ex02;

public class ex01 {
    static void main() {
        int i = 0;
        int max = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                max+=i;
            }
            i++;
        }
        System.out.println(max);

//        int max = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                max+=i;
//            }
//        }
//        System.out.println(max);
    }
}
