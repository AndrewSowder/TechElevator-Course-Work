package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolder;

    private String accountNumber;

    private int debt ;


    public CreditCardAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        debt = 0;
    }

        public int getBalance(){
        int negativeDebt = 0 - debt;
        return negativeDebt;

    }

        public String getAccountHolder() {
            return accountHolder;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public int getDebt() {
            return debt;
        }

        public int pay(int amountToPay){
        debt = (debt - amountToPay);
        return getBalance();


        }
        public int charge(int amountToCharge){
        debt = (debt + amountToCharge);
        return getBalance();

        }






}
