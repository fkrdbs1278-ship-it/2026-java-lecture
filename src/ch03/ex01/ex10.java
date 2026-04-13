package ch03.ex01;

public class ex10 {
    static void main() {
        int[] scores = {55, 70, 85, 40, 90, 60};
        int count = 0;
        for (int i=0; i<scores.length;i++){
            if (scores[i]>=60){
                System.out.println(scores[i]);
                count++;
            }
        }
        System.out.println("합격자 수: "+count);
    }
}
