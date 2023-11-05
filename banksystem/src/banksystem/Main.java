package banksystem;

import banksystem.entity.Account;
import banksystem.entity.Bill;
import banksystem.entity.Person;
import banksystem.service.DepositService;
import banksystem.service.PaymentService;
import banksystem.service.TransferService;

public class Main {
    public static void main(String[] args) {
        Person JohnySilva = new Person("Johny","Silva", "=123345");
        Bill JohnySilvaBill = new Bill(10000);
        Account JohnySilvaAccount = new Account(JohnySilva,JohnySilvaBill);

        Person JaneAdams = new Person("Jane", "Adams", "+57843");
        Bill JaneAdamsBill = new Bill(8000);
        Account JaneAdamsAccount = new Account(JaneAdams, JaneAdamsBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(JohnySilvaAccount, 5000);
        paymentService.pay(JaneAdamsAccount, 2000);

        DepositService depositService = new DepositService();
        depositService.deposit(JohnySilvaAccount, 5000);
        depositService.deposit(JaneAdamsAccount, 3000);

        TransferService transferService = new TransferService();
        transferService.transfer(JohnySilvaAccount, JaneAdamsAccount, 50 000);

    }
}
