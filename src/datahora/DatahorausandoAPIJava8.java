/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author luis.silva
 */
public class DatahorausandoAPIJava8 {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local Date and Time: " + ldt);

        // Obtain the LocalDateTime object of the date 11/11/2000 at 12:00
        LocalDateTime ldt2 = LocalDateTime.of(2000, Month.NOVEMBER, 11, 12, 00);
        System.out.println("Specified Date and Time: " + ldt2);

        // Obtain the month from LocalDateTime object
        Month month = ldt.getMonth();
        int monthValue = ldt.getMonthValue();
        System.out.println("Month: " + month);
        System.out.println("Month Value: " + monthValue);

        // Obtain day of Month, Week, and Year
        int day = ldt.getDayOfMonth();
        DayOfWeek dayWeek = ldt.getDayOfWeek();
        int dayOfYr = ldt.getDayOfYear();
        System.out.println("Day: " + day);
        System.out.println("Day Of Week: " + dayWeek);
        System.out.println("Day of Year: " + dayOfYr);

        // Obtain year
        int year = ldt.getYear();
        System.out.println("Date: " + day + "/" + monthValue + "/" + year);

        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int second = ldt.getSecond();
        System.out.println("Current Time: " + hour + ":" + minute + ":" + second);

        // Calculation of Months, etc.
        LocalDateTime currMinusMonths = ldt.minusMonths(12);
        LocalDateTime currMinusHours = ldt.minusHours(10);
        LocalDateTime currPlusDays = ldt.plusDays(30);

        System.out.println("Current Date and Time Minus 12 Months: "
                + currMinusMonths);

        System.out.println("Current Date and Time Minus 10 Hours: "
                + currMinusHours);

        System.out.println("Current Date and Time Plus 30 Days:"
                + currPlusDays);
    }

}
