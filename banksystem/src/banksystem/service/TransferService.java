package banksystem.service;

import banksystem.entity.Account;

public class TransferService {
    public void transfer (Account accountFrom, Account accountTo, int amountTransfer){
        int billFromAmount = accountFrom.getBill().getEmount();
        int billToAmount = accountTo.getBill().getEmount();
        if (billFromAmount < amountTransfer){
            System.out.println("Not enough money! Deposit your account!");
        }else {
            System.out.println("Transfer operation from: " + accountFrom.getAccountHolder().getName() +
                    " account to " + accountTo.getAccountHolder().getName());
            accountFrom.getBill().setEmount(billFromAmount - amountTransfer);
            accountTo.getBill().setEmount(billToAmount + amountTransfer);
            System.out.println("Sucsess! Transfer complete! ");
        }
    }
}
