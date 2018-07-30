/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author luis.silva
 */
public class DataHoraLocal {

    public static void main(String[] args) {
        // Create a local date and time
        LocalDate ld = LocalDate.of(2018, Month.JULY, 27);
        LocalTime lt = LocalTime.of(9, 00, 00);
        System.out.println("ld: " + ld);
        //é ano bissexto?
        System.out.println("ld.isLeapYear(): " + ld.isLeapYear());
        System.out.println("lt: " + lt);

        // Create a local datetime from the local date and time
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        System.out.println("ldt: " + ldt);

        // Add 2 months and 25 minutes to the local datetime
        LocalDateTime ldt2 = ldt.plusMonths(2).plusMinutes(25);
        System.out.println("ldt2: " + ldt2);

        // Derive the local date and time from the localdatetime
        LocalDate ld2 = LocalDate.from(ldt2);
        LocalTime lt2 = LocalTime.from(ldt2);
        System.out.println("ld2: " + ld2);
        System.out.println("lt2: " + lt2);
    }

}
