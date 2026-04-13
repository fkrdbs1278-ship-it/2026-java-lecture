package ch05.ex02;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void showSalary(){
        System.out.println("이름은: "+name+"연봉은: "+salary);
    }
}
