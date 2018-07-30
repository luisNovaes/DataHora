/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 *
 * @author luis.silva
 */
public class datasDeslocamento {

    public static void main(String[] args) {
        // Creete a zone-offset +05:30
        ZoneOffset offset = ZoneOffset.ofHoursMinutes(5, 30);

        // Get the current offset time
        OffsetTime ot1 = OffsetTime.now();
        System.out.println("Current offset time: " + ot1);

        // Create an offset time
        OffsetTime ot2 = OffsetTime.of(16, 40, 28, 0, offset);
        System.out.println("One offset time: " + ot2);

        // Get the current offset datetime
        OffsetDateTime odt1 = OffsetDateTime.now();
        System.out.println("Current offset datetime: " + odt1);

        // Create an offset datetime
        OffsetDateTime odt2 = OffsetDateTime.of(2019, 5, 11,
                18, 10, 30, 0,
                offset);
        System.out.println("One offset datetime: " + odt2);

        // Get the local date and time from the offset datetime
        LocalDate ld1 = odt1.toLocalDate();
        LocalTime lt1 = odt1.toLocalTime();
        System.out.println("Current Local Date: " + ld1);
        System.out.println("Current Local Time: " + lt1);

        // Get the instant from the offset datetime
        Instant i1 = odt1.toInstant();
        System.out.println("Current Instant: " + i1);

        // Create an offset datetime from the instant
        ZoneId usChicago = ZoneId.of("America/Chicago");
        OffsetDateTime odt3 = OffsetDateTime.ofInstant(i1, usChicago);
        System.out.println("Offset datetime from instant: " + odt3);
    }

}
