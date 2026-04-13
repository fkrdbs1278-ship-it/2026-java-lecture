package ch05.ex01;

public class Student {
    String name;
    int kor;
    int eng;
    int math;

    void showInfo(){
        System.out.println("이름:"+name+" 국어점수:"+kor+" 영어점수:"+eng+" 수학점수:"+math);
    }
    int getTotal(){
        return kor+eng+math;
    }
    double getAverage(){
        int temp =(int)(getTotal()/3.0 *100);
        return temp/100.0;
    }

}
