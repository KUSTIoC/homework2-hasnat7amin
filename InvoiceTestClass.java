/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicetestclass;

/**
 *
 * @author MOON COMP&MOBILE
 */
public class InvoiceTestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Invoice obj1=new Invoice("null","null",0,0.0,0.0);
        obj1.setPartDescription("mobile");
        obj1.setPartNumber("x625");
        obj1.setPricePerItem(12000);
        obj1.setQuantityOfItem(3);
        System.out.println(obj1.toString());
    }
    
}
