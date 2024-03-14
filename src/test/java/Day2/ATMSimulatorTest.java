package Day2;

import Day2.ATMSimulator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ATMSimulatorTest {

    //@Test
    public void validAmountDepositMoney(){
        // Create an instance of ATMSimulator
        ATMSimulator atm=new ATMSimulator();
        // Set initial balance and new balance
        int initialBalance= 1000;
        int depositAmount=2000;
        // Set the initial balance and deposit the new balance
        atm.currentBalanceInputFromUser(initialBalance);
        atm.depositAmount(depositAmount);
        // Display main menu and select deposit option
        atm.displayMainMenu();
        int optionSelect=1;
        int newBalance=atm.userSelect(optionSelect);
        // Assert that the new balance equals the initial balance plus the deposited amount
        Assert.assertEquals(newBalance,initialBalance+depositAmount,"initialBalance should increased by newBalance");

    }
    //@Test
    public void invalidAmountDepositMoney(){
        // Create an instance of ATMSimulator
        ATMSimulator atm=new ATMSimulator();
        // Set initial balance and new balance
        int initialBalance= 1000;
        int depositAmount=-100;
        // Set the initial balance and deposit the new balance
        atm.currentBalanceInputFromUser(initialBalance);
        atm.depositAmount(depositAmount);
        // Display main menu and select deposit option
        atm.displayMainMenu();
        int optionSelect=1;
        int newBalance=atm.userSelect(optionSelect);

        Assert.assertEquals(newBalance,initialBalance,"Balance should remain same");

    }
    //@Test
    public void withdrawWithSufficientFunds(){
        // Create an instance of ATMSimulator
        ATMSimulator atm=new ATMSimulator();
        // Set initial balance and new balance
        int initialBalance= 1000;
        int withdrawAmount=100;
        // Set the initial balance and deposit the new balance
        atm.currentBalanceInputFromUser(initialBalance);
        atm.withdrawAmount(withdrawAmount);
        // Display main menu and select deposit option
        atm.displayMainMenu();
        int optionSelect=2;
        int newBalance=atm.userSelect(optionSelect);

        Assert.assertEquals(newBalance,initialBalance-withdrawAmount,"Balance should initial subtract withdraw amount");

    }
    @Test
    public void withdrawWithinSufficientFunds(){
        // Create an instance of ATMSimulator
        ATMSimulator atm=new ATMSimulator();
        // Set initial balance and new balance
        int initialBalance= 1000;
        int withdrawAmount=2000;
        // Set the initial balance and deposit the new balance
        atm.currentBalanceInputFromUser(initialBalance);
        atm.withdrawAmount(withdrawAmount);
        // Display main menu and select deposit option
        atm.displayMainMenu();
        int optionSelect=2;
        int newBalance=atm.userSelect(optionSelect);


    }

}
