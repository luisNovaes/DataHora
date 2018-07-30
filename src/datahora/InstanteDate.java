/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author luis.silva
 */
public class InstanteDate {

    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println("The current timestamp: " + timestamp);

        // Agora menos três dias
        Instant minusThree = timestamp.minus(3, ChronoUnit.DAYS);
        System.out.println("Now minus three days:" + minusThree);

        ZonedDateTime atZone = timestamp.atZone(ZoneId.of("GMT"));
        System.out.println(atZone);

        Instant yesterday = Instant.now().minus(24, ChronoUnit.HOURS);
        System.out.println("Yesterday: " + yesterday);
    }

}
