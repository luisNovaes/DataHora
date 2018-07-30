/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author luis.silva
 */
public class AnoMesDia {

    public static void main(String[] args) {
        newSpecifiedDate();
    }

    public static void newSpecifiedDate() {
        LocalDate date = LocalDate.of(1973, Month.JUNE, 26);
        System.out.println("Date from specified date: " + date);
    }

}
