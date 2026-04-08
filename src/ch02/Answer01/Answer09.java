package ch02.Answer01;

import java.util.Scanner;

public class Answer09 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몸무게를 입력하세요: ");
        double kg = scanner.nextInt();
        System.out.println("키를 입력하세요: ");
        double cm = scanner.nextInt();
        double m = cm/100;
        double bmi = kg / (m * m);
        String result = null;
        if (bmi < 20) {
            result="저체중";
        } else if (bmi >= 20 && bmi < 25) {
            result="정상";
        } else if (bmi >= 25 && bmi < 30) {
            result="과체중";
        } else {
            result="비만";
        }
        System.out.printf("당신의 몸무게는 %.2f 키는 %.2f이고 %s",kg, cm,result);
    }
}
