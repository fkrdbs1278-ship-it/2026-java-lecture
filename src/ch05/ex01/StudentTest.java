package ch05.ex01;

public class StudentTest {
    static void main() {
        Student student01 = new Student();
        student01.name ="철수";
        student01.kor = 90;
        student01.eng = 90;
        student01.math = 90;
        System.out.println("총 점수:"+student01.getTotal());
        System.out.printf("평균: %.2f",student01.getAverage());
        System.out.println();
        student01.showInfo();


    }
}
