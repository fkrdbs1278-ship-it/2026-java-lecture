package ch03.ex01;

public class ex03 {
    static void main() {
        int sum = 0;
        for (int i = 0; i <= 100; i ++) {
            if (i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
