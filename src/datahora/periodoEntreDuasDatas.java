/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author luis.silva
 */
public class periodoEntreDuasDatas {

    public static void main(String[] args) {

        LocalDate anniversary = LocalDate.of(1973, Month.JUNE, 26);
        LocalDate today = LocalDate.now();
        Period period = Period.between(anniversary, today);

        System.out.println("Number of Days Difference: " + period.getDays());
        System.out.println("Number of Months Difference: " + period.getMonths());
        System.out.println("Number of Years Difference: " + period.getYears());
    }

}
