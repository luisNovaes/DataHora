/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

/**
 *
 * @author luis.silva
 */
public class DetermineAnoBissexto {

    public static void main(String[] args) {
        int year = 2012;

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Year " + year + " é um ano bissexto");
        } else {
            System.out.println("Year " + year + " Não é um ano bissexto");
        }
    }

}
