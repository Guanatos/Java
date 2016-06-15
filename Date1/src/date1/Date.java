/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date1;

/**
 *
 * @author danunora
 */
public class Date {
 public int day;
 public int month;
 public int year;
 
public boolean isLeapYear(int year) {
    return (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
}

public int daysInMonth(int month, int year){
    int rv;
    switch(month) {
        case 9:
        case 4:
        case 6:
        case 11:
            rv = 30;
            break;
        case 2:
            if (isLeapYear(year)) {
                rv = 29;}
            else {
                rv = 28;}
            break;
        default:
            rv = 31;
            break;
            }
        return rv;
    }

public void nextDay() {
    int dayCount = daysInMonth(this.month, this.year);
    this.day++;
    if (this.day > dayCount) {
        this.day = 1;
        this.month++;
        if (this.month > 12)
            this.month = 1;
            this.year++;
    }
}
 
 public Date(int d, int m, int y) {
     this.day = d;
     this.month = m;
     this.year = y;
 } 
}
