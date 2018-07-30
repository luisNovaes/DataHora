/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.JUNE;
import java.time.ZonedDateTime;

/**
 *
 * @author luis.silva
 */
public class DataHoraAtual {

    public static void main(String[] args) {
        // Obtém data e hora atuais e datatime
        LocalDate dateOnly = LocalDate.now();
        LocalTime timeOnly = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime dateTimeWithZone = ZonedDateTime.now();

        System.out.println("Current Date: " + dateOnly);
        System.out.println("Current Time: " + timeOnly);
        System.out.println("Current Date and Time: " + dateTime);
        System.out.println("Current Date, Time, and Zone: " + dateTimeWithZone);

        // Construir uma data e hora de nascimento a partir dos componentes de data e hora
        LocalDate myBirthDate = LocalDate.of(1973, JUNE, 26);
        LocalTime myBirthTime = LocalTime.of(12, 45);
        System.out.println("My Birth Date: " + myBirthDate);
        System.out.println("My Birth Time:: " + myBirthTime);
    }

}
