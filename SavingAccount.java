/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingaccounttestclass;

/**
 *
 * @author MOON COMP&MOBILE
 */
public class SavingAccount {
    private static int AnnualInterestRate;
    private double SavingBalance;

    public SavingAccount(double SavingBalance) {
        this.SavingBalance = SavingBalance;
    }

    public static int getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public static void setAnnualInterestRate(int AnnualInterestRate) {
        SavingAccount.AnnualInterestRate = AnnualInterestRate;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public void setSavingBalance(double SavingBalance) {
        this.SavingBalance = SavingBalance;
    }
    
    public double  setMonthlyInterest()
    {
        SavingBalance =((getSavingBalance()*getAnnualInterestRate())/12)+SavingBalance;
        return ((getSavingBalance()*getAnnualInterestRate())/12);
        
    }
   

    @Override
    public String toString() {
        return "\nSavingAccount\nYour Saving Balance is:" + getSavingBalance() + "\nYour Monthly Interest is:" + setMonthlyInterest() +"\nyour new Saving Balance is:"+getSavingBalance() ;
    }
    
}
