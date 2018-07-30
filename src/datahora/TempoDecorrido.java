/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 *
 * @author luis.silva
 */
public class TempoDecorrido {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(1973, Month.JUNE, 26);
        LocalDate ld2 = LocalDate.of(2018, Month.JULY, 27);
        long days = DAYS.between(ld1, ld2);

        LocalTime lt1 = LocalTime.of(7, 0);
        LocalTime lt2 = LocalTime.of(9, 30);
        long hours = HOURS.between(lt1, lt2);
        long minutes = MINUTES.between(lt1, lt2);

        long year = days / 365;

        System.out.println("Using between (year): " + year);
        System.out.println("Using between (days): " + days);
        System.out.println("Using between (hours): " + hours);
        System.out.println("Using between (minutes): " + minutes);

        // Using the until() method
        long days2 = ld1.until(ld2, DAYS);
        long hours2 = lt1.until(lt2, HOURS);
        long minutes2 = lt1.until(lt2, MINUTES);

        long year2 = days2 / 365;

        System.out.println("Using until (year): " + year2);
        System.out.println("Using until (days): " + days2);
        System.out.println("Using until (hours): " + hours2);
        System.out.println("Using until (minutes): " + minutes2);

    }

}
