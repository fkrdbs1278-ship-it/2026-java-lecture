package ch02.Answer01;

import java.util.Scanner;

public class Answer03 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 입력하시오.");
        int won = scanner.nextInt();
        int o = won / 50000;
        won %= 50000;
        System.out.println("오만원권" + o + "매");
        int man = won / 10000;
        won %= 10000;
        System.out.println("만원권" + man + "매");
        int chen = won / 1000;
        won %= 1000;
        System.out.println("천원권" + chen + "매");
        int back = won / 100;
        won %= 100;
        System.out.println("100원 동전" + back + "개");
        int osim = won / 50;
        won %= 50;
        System.out.println("50원 동전" + osim + "개");
        int ten = won / 10;
        won %= 10;
        System.out.println("10원 동전" + ten + "개");
    }
}
