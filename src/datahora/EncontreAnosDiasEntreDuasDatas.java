/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author luis.silva
 */
public class EncontreAnosDiasEntreDuasDatas {

    public static void main(String[] args) {
        LocalDate anniversary = LocalDate.of(1973, Month.JUNE, 26);
        LocalDate today = LocalDate.now();
        long yearsBetween = ChronoUnit.YEARS.between(anniversary, today);
        System.out.println("Years between dates: " + yearsBetween);

        long daysBetween = ChronoUnit.DAYS.between(anniversary, today);
        System.out.println("Days between dates:" + daysBetween);
    }

}
