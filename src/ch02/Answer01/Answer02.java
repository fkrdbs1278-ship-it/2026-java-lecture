package ch02.Answer01;

import java.util.Scanner;

public class Answer02 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10~99사이 정수를 입력하세요");
        int su = scanner.nextInt();
        int ten = su / 10;
        int one = su % 10;
        if (ten == one) {
            System.out.println(" Yes! 10의 자리와 1의 자리가 같습니다.");
        } else if (ten != one) {
            System.out.println("틀렸습니다.");
        }
        System.out.println(ten);
        System.out.println(one);
    }
}
