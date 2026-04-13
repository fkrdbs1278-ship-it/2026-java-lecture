package ch03.ex02;

import java.util.Scanner;

public class ex03 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*: 개수를 입력하세요");
        String star = scanner.nextLine();
        for (int j = 0; j >=10; j--) {
            for (int i = 0; i < j; i++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
