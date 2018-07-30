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
public class calculoHoraAtual {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Hora Atual: " + time);

        //atDate (LocalDate): obtenha a data e hora local
        LocalDateTime ldt = time.atDate(LocalDate.of(2018, Month.JULY, 27));
        System.out.println("objeto Data Hora Local: " + ldt);

        // de (int horas, int min): obtenha um horário específico
        LocalTime pastTime = LocalTime.of(1, 10);

        // compareTo (LocalTime): compare duas vezes. Valor de retorno
        // positivo retornado se maior
        System.out.println("Comparando tempos: " + time.compareTo(pastTime));

        // getHour (): hora de retorno no valor int (formato de 24 horas)
        int hour = time.getHour();
        int min = time.getMinute();
        int nano = time.getNano();
        int sec = time.getSecond();
        System.out.println("Hora: " + hour);

        // isAfter (LocalTime): return Comparação booleana
        System.out.println("É hora local após pastTime? : " + time.isAfter(pastTime));

        // minusHours (int): subtrair horas de LocalTime
        LocalTime minusHrs = time.minusHours(5);
        System.out.println("Tempo menos 5 horas: " + minusHrs);

        // plusMinutes (int): adiciona minutos ao LocalTime
        LocalTime plusMins = time.plusMinutes(30);
        System.out.println("Hora mais 30 min: " + plusMins);
    }

}
