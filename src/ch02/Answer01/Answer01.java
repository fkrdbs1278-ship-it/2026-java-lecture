package ch02.Answer01;

import java.util.Scanner;

public class Answer01 {
    static void main() {
        System.out.println("두자리 정수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ten = num / 10;
        int one = num % 10;
        if (ten == one) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }
    }
}
