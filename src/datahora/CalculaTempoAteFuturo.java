/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author luis.silva
 */
public class CalculaTempoAteFuturo {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1973, Month.JUNE, 26);

        LocalDate nextBDay = birthday.withYear(today.getYear());

        // Se seu aniversário já ocorreu este ano, adicione 1 ao ano.
        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }

        Period p = Period.between(today, nextBDay);
        long p2 = ChronoUnit.DAYS.between(today, nextBDay);
        System.out.println("There are " + p.getMonths() + " months, and "
                + p.getDays() + " days until your next birthday. (" + p2
                + " total)");
    }
}
