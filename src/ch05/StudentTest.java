package ch05;

public class StudentTest {
    static void main() {
        Student student01 = new Student();
        student01.name = "장동건";
        student01.grade=2;
        Student student02 = new Student();
        student02.name="현빈";
        student02.grade=3;
        Student student03 = new Student("장성호",1);
        student01.showInfo();
        student02.showInfo();
        student03.showInfo();
        student01.kor=90;
        student01.eng=90;
        student01.math=90;
        System.out.println(student01.total());
        System.out.println
                (student01.average());
    }
}