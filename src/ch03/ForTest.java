package ch03;

public class ForTest {
    static void main() {
        int sum = 0;
        for (int i = 0; i <= 100; i+=2) {
            sum = sum + i;
//            System.out.println("hello world" + i);
        }
        System.out.println(sum);

    }
}
