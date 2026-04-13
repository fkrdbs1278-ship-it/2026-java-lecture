package ch03.ex01;

public class ex09 {
    static void main() {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j < i; j++){
                if (i%2==0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
