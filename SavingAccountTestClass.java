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
public class SavingAccountTestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SavingAccount obj1=new SavingAccount(0);
        obj1.setSavingBalance(2000);
        obj1.setAnnualInterestRate(4);
        
        SavingAccount obj2=new SavingAccount(0);
        obj2.setSavingBalance(3000);
        obj2.setAnnualInterestRate(5);
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
    
}
