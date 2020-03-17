/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;

/**
 *
 * @author MOON COMP&MOBILE
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date obj=new Date(0,0,0);
        obj.setDay(10);
        obj.setMonth(04);
        obj.setYear(2002);
        obj.displayDate();
    }
    
}
