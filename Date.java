/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;

/**
 *
 * @author MOON &MOBILE
 */
public class Date {
    private int day,month,year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>31)
            day=0;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>12)
            month=0;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void displayDate()
    {
        System.out.println("Your date is :"+day+"/"+month+"/"+year);
    }
    
    
}
