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
public class Date1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date meetingDate = new Date(29, 2, 2012);
        
//        meetingDate.day = 14;
//        meetingDate.month = 6;
//        meetingDate.year = 2016;
        meetingDate.day++;

        System.out.println("Meeting will be: "
        + meetingDate.day + "/"
        + meetingDate.month + "/"
        + meetingDate.year);
        
        Date betterMeetingDate = new Date(29, 2, 2012);
        betterMeetingDate.nextDay();
        System.out.println("Better meeting will be: "
        + betterMeetingDate.day + "/"
        + betterMeetingDate.month + "/"
        + betterMeetingDate.year);
    }
    
}
