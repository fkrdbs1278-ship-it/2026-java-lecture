package ch02;

import java.util.Scanner;

public class IfTest02 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학년을 입력하세요 : ");
        int year = scanner.nextInt();
        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt();
        if (year >= 4 && score >= 70){
            System.out.println("PASS");
        } else if (year < 4 && score >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        //변수 2개 year score 둘다 int 로 한다.
        //score 가 60점 이상이면 pass인데
        // 이때 4학년 이상은 70점 이상이면 합격
    }
}
