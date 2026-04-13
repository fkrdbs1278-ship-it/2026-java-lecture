package ch05.inherit;

public class ClassTest {
    static void main() {
        Student student = new Student();
        student.study();
        student.eat();

        StudentWokrer studentWokrer = new StudentWokrer();
        studentWokrer.work();

        ResearCher researCher = new ResearCher();
        researCher.eat();
        researCher.research();

        ProFessor proFessor = new ProFessor();
        proFessor.research();
        proFessor.teach();
    }
}