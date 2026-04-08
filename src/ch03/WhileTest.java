package ch03;

public class WhileTest {
    static void main() {
        int i = 0;
        int sum = 0;
        while (i <= 10) {
            if (i < 10) {
                System.out.println(i + "+");
            } else {
                System.out.println(i + "=");
            }
            sum += i;
            i++;


        }
        System.out.println(sum);
        //i=0 sum=

    }
}
