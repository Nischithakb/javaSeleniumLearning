package Day1;

import java.util.*;


public class ATMSimulator {
    static Scanner sc = new Scanner(System.in);
    static int accountBal;
    public void currentBalanceInputFromUser(){
        System.out.println("Please enter your current balance:");
        accountBal = sc.nextInt();

    }

    public void displayMainMenu(){
        System.out.println("Deposit");
        System.out.println("Withdrawal");
        System.out.println("Check Balance");
        System.out.println("Exit");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to ATM!");

        ATMSimulator atm = new ATMSimulator();
        atm.currentBalanceInputFromUser();
        atm.displayMainMenu();

        System.out.println("Please enter your selection:");
        int UserSelection = sc.nextInt();
        if(UserSelection==4){
            System.out.println("Thank you for using ATM");

        }
        else{

        atm.userSelect(UserSelection);
        }


    }

    public void userSelect(int num) {
        switch (num) {
            case 1:
                System.out.println("Please enter your Deposit amount:");
                int depositAmount=sc.nextInt();
                System.out.println("Your current account balance is:"+(accountBal+depositAmount));
                break;
            case 2:
                System.out.println("Please enter your withdrawal amount:");
                int withdrawAmount=sc.nextInt();
                if(withdrawAmount>accountBal){
                    System.out.println("In sufficient funds");
                }
                else {
                    System.out.println("Your current account balance is:" + (accountBal - withdrawAmount));
                }
                break;

            case 3:
                System.out.println("Your current account balance is:"+(accountBal));
                break;

            default:
                System.out.println("Please enter valid input (1-4)");

        }

    }

}