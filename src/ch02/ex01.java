package ch02;

import java.util.Scanner;

public class ex01 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원화를 입력하세요(단위 원)");
        int money = scanner.nextInt();
        double won = money/1500.0;
        System.out.println(money+"원은 $"+won+"입니다.");
//        System.out.printf("%d은 $ %.2f 입니다.",money,won); %d 정수 %f 실수 %s 문자열
    }
}
