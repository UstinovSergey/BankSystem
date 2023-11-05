package banksystem.service;

import banksystem.entity.Account;
import banksystem.entity.Bill;

public class DepositService {
    public void deposit (Account account, int amountDeposit){
        Bill bill = account.getBill();
        int currentBillAmount = bill.getEmount();
        System.out.println("Account status: " + currentBillAmount);
        bill.setEmount(currentBillAmount + amountDeposit);
        System.out.println("Account status after deposit : " + bill.getEmount());
    }
}
