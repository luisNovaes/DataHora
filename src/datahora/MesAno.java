/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;

/**
 *
 * @author luis.silva
 */
public class MesAno {

    public static void main(String[] args) {
        YearMonth yearMo = YearMonth.now();
        System.out.println("Current Year and month:" + yearMo);

        YearMonth specifiedDate = YearMonth.of(2000, Month.NOVEMBER);
        System.out.println("Specified Year-Month: " + specifiedDate);

        MonthDay monthDay = MonthDay.now();
        System.out.println("Current month and day: " + monthDay);

        monthDay = MonthDay.of(Month.NOVEMBER, 11);
        System.out.println("Specified Month-Day: " + monthDay);
    }

}
