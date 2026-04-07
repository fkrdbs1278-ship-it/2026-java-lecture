package ch02;

import java.util.Scanner;

public class SwitchTest {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력하세요:");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("겨울 입니다.");
                break;
            case 11:
            case 10:
                System.out.println("가을 입니다.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("여름 입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄 입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
        //switch는 조건을 쓰는 다른 방법

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("점수를 입력하세요:");
//        int hakjum = scanner.nextInt();
//        switch (hakjum/10){
//            case 10:
//            case 9:
//                System.out.println("A학점 입니다.");
//                break;
//            case 8:
//                System.out.println("B학점 입니다.");
//                break;
//            case 7:
//                System.out.println("C학점 입니다.");
//                break;
//            case 6:
//                System.out.println("D학점 입니다.");
//                break;
//            default:
//                System.out.println("F학점 입니다.");
//        }
//        String order = "아이스아메리카노";
//        switch (order) {
//            case "아이스아메리카노":
//                System.out.println("2,000원 입니다.");
//                ;
//                break;
//            case "카라멜마끼아또":
//                System.out.println("4,500원 입니다.");
//                ;
//                break;
//            case "카페라떼":
//                System.out.println("2,500원 입니다.");
//                ;
//                break;
//            default:
//                System.out.println("해당메뉴는 없습니다.");
//        }
    }
}
