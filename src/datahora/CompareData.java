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
public class CompareData {

    public static void main(String[] args) {
        LocalDate ldt1 = LocalDate.of(2018, Month.JULY, 28);
        LocalDate ldt2 = LocalDate.now();
        int comparison = ldt1.compareTo(ldt2);
        if (comparison > 0) {
            System.out.println(ldt1 + " is after " + ldt2);
        } else if (comparison < 0) {
            System.out.println(ldt1 + " is before " + ldt2);
        } else {

            System.out.println(ldt1 + " is equal to " + ldt2);
        }

        if (ldt1.isAfter(ldt2)) {
            System.out.println(ldt1 + " is after " + ldt2);
        } else if (ldt1.isBefore(ldt2)) {
            System.out.println(ldt1 + " is before " + ldt2);
        } else if (ldt1.isEqual(ldt2)) {
            System.out.println(ldt1 + " is equal to " + ldt2);
        }

    }

}
