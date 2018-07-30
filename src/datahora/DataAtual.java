/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.Clock;
import java.time.LocalDate;

/**
 *
 * @author luis.silva
 */
public class DataAtual {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Data atual:" + date);

        Clock clock = Clock.systemUTC();
        date = LocalDate.now(clock);
        System.out.println("Data do relógio:" + date);
    }

}
