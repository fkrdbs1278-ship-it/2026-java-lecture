package ch05.ex02;

public class Student extends Person{
    int grade;
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void showInfo(){
        System.out.println("이름은: "+name+" 나이는: "+age+" 학년은:"+grade);
    }
}
