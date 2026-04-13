package ch05.ex01;

public class BankAccountTest {
    static void main() {
        BankAccount bankAccount01 = new BankAccount("김영준",300000);
        bankAccount01.showInfo();
        bankAccount01.deposit(160000);
        bankAccount01.showBalance();
        bankAccount01.deposit(160000);
        bankAccount01.showBalance();
        bankAccount01.deposit(160000);
        bankAccount01.showBalance();
        bankAccount01.withdraw(400000);
        bankAccount01.showBalance();


    }
}
