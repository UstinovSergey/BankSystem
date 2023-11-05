package banksystem.service;

import banksystem.entity.Account;
import banksystem.entity.Bill;

public class PaymentService {
    public void pay (Account account,int amountForPay ){
        Bill bill = account.getBill();
        if (bill.getEmount() < amountForPay){
            System.out.println("Not enough money for payment!");
        }else {
            int currentBillAmount = bill.getEmount();
            System.out.println("Account status: " + currentBillAmount);
            bill.setEmount(currentBillAmount - amountForPay);
            System.out.println("Account status after payment: " + bill.getEmount());
        }
    }
}
