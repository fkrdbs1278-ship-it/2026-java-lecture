package ch05.ex01;

public class BankAccount {
    String owner;
    int balance;

    void showInfo() {
        System.out.println("통장주인: " + owner + " 통장잔고:" + balance);
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int money) {
        balance += money;
        System.out.println("입금: " + money);
    }

    void withdraw(int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원이 출금되었습니다");
        }else {
            System.out.println("잔액이 부족합니다.");
        }

    }

    void showBalance() {
        System.out.println(owner+ "님의 남은금액:" + balance);
    }

}
