package Day2;

import java.util.Scanner;


public class ATMSimulator {
    int depositAmount;
    int withdrawAmount;
    static Scanner sc = new Scanner(System.in);
    public static int accountBal;
    public void currentBalanceInputFromUser(int balance){
        System.out.println("Your current balance is:"+balance);
        accountBal=balance;
    }

    public void displayMainMenu(){
        System.out.println("Deposit");
        System.out.println("Withdrawal");
        System.out.println("Check Balance");
        System.out.println("Exit");
    }
    public void depositAmount(int Amt){
        depositAmount=Amt;
    }
    public void withdrawAmount(int Amt){
        withdrawAmount=Amt;
    }
    public int userSelect(int num) {
        switch (num) {
            case 1:
                if(depositAmount>0) {
                    System.out.println("Your current account balance is:" + (accountBal + depositAmount));
                    return accountBal + depositAmount;
                }
                else{
                    System.out.println("Your current account balance is:" + accountBal);
                    return accountBal;
                }

            case 2:

                if (withdrawAmount > accountBal) {
                    System.out.println("In sufficient funds");
                    return accountBal;
                } else {
                    System.out.println("Your current account balance is:" + (accountBal - withdrawAmount));
                    return accountBal - withdrawAmount;
                }


            case 3:
                System.out.println("Your current account balance is:" + (accountBal));
                return accountBal;

            default:
                System.out.println("Please enter valid input (1-3)");
                return accountBal;
        }

    }

}