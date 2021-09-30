import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public double calcCheckingDeposit (double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public double calcSavingDeposit (double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from your checking account");
        double amount = input.nextDouble();
    
    if ((checkingBalance - amount) >= 0) {
        calcCheckingWithdraw(amount);
        System.out.println("Your new Checking Account Balance: " + moneyFormat.format(checkingBalance));
    } else {
        System.out.println("The checking balance cannot be negative." + "\n");
    }
}

    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit to your checking account");
        double amount = input.nextDouble();
    
    if ((checkingBalance + amount) >= 0) {
        calcCheckingDeposit(amount);
        System.out.println("Your new Checking Account Balance: " + moneyFormat.format(checkingBalance));
    } else {
        System.out.println("The checking balance cannot be negative." + "\n");
    }
}

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from your saving account");
        double amount = input.nextDouble();
    
    if ((savingBalance - amount) >= 0) {
        calcSavingWithdraw(amount);
        System.out.println("Your new Saving Account Balance: " + moneyFormat.format(savingBalance));
    } else {
        System.out.println("The saving balance cannot be negative." + "\n");
    }
}

    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposit to your saving account");
        double amount = input.nextDouble();
    
    if ((savingBalance + amount) >= 0) {
        calcSavingDeposit(amount);
        System.out.println("Your new Saving Account Balance: " + moneyFormat.format(savingBalance));
    } else {
        System.out.println("The saving balance cannot be negative." + "\n");
    }
}
}