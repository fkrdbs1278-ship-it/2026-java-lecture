package ch02.Answer01;

public class Answer06 {
    static void main() {
        int num = 19;
        int ten = num / 10;
        int one = num % 10;
        int count = 0;
        if (ten != 0 && ten % 3 == 0) {
            count++;
        }
        if (one != 0 && one % 3 == 0) {
            count++;
        }
        if (count == 1) {
            System.out.println("박수 짝");
        } else if (count == 2) {
            System.out.println("박수 짝짝");
        }
    }
}
