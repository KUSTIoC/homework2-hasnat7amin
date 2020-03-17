/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

/**
 *
 * @author MOON COMP&MOBILE
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee obj1=new Employee("null","null",0.0);
        obj1.setFirstName("hasnat");
        obj1.setLastName("amin");
        obj1.setMonthlySalary(12000);
        
        Employee obj2=new Employee("null","null",0.0);
        obj2.setFirstName("hamid");
        obj2.setLastName("shah");
        obj2.setMonthlySalary(13000);
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        
        
    }
    
}
