package ch05.ex02;

public class Manager extends Employee{
    int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    void showSalary(){
        int sum = salary+bonus;
        System.out.println("이름: "+name+" 급여: "+salary+" 보너스: "+bonus+ " 총 급여:"+sum);

    }
}
