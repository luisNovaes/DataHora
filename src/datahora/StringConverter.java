/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahora;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.HijrahChronology;
import java.time.chrono.IsoChronology;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.MinguoChronology;
import java.time.chrono.ThaiBuddhistChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DecimalStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

/**
 * @author luis.silva Convert LocalDate -> ChronoLocalDate -> String and back.
 *
 */
public class StringConverter {

    /**
     * Converte um valor LocalDate (ISO) para uma data ChronoLocalDate usando a
     * Cronologia fornecida e formata o ChronoLocalDate para uma String usando
     * um DateTimeFormatter com um padrão * SHORT baseado na Cronologia e na
     * Localidade atual.
     *
     * @param localDate - a data ISO para converter e formatar.
     * @param chrono - uma cronologia opcional. Se null, então IsoChronology é
     * usado.
     */
    public static String toString(LocalDate localDate, Chronology chrono) {
        if (localDate != null) {
            Locale locale = Locale.getDefault(Locale.Category.FORMAT);
            ChronoLocalDate cDate;
            if (chrono == null) {
                chrono = IsoChronology.INSTANCE;
            }
            try {
                cDate = chrono.date(localDate);
            } catch (DateTimeException ex) {
                System.err.println(ex);
                chrono = IsoChronology.INSTANCE;
                cDate = localDate;
            }
            String pattern = "M/d/yyyy GGGGG";
            DateTimeFormatter dateFormatter = DateTimeFormatter
                    .ofPattern(pattern);
            return dateFormatter.format(cDate);
        } else {
            return "";
        }
    }

    /**
     * Analisa uma String para um ChronoLocalDate usando um DateTimeFormatter
     * com um padrão curto com base na Locale atual e na cronologia fornecida,
     * em seguida, converte isso em um valor LocalDate (ISO) .
     *
     * @param text - o texto da data de entrada no formato SHORT esperado para a
     * Cronologia e a Localidade atual.
     *
     * @param chrono - uma cronologia opcional. Se null, então IsoChronology é
     * usado.
     */
    public static LocalDate fromString(String text, Chronology chrono) {
        if (text != null && !text.isEmpty()) {
            Locale locale = Locale.getDefault(Locale.Category.FORMAT);
            if (chrono == null) {
                chrono = IsoChronology.INSTANCE;
            }
            String pattern = "M/d/yyyy GGGGG";
            DateTimeFormatter df = new DateTimeFormatterBuilder()
                    .parseLenient().appendPattern(pattern).toFormatter()
                    .withChronology(chrono)
                    .withDecimalStyle(DecimalStyle.of(locale));
            TemporalAccessor temporal = df.parse(text);
            ChronoLocalDate cDate = chrono.date(temporal);
            return LocalDate.from(cDate);
        }
        return null;
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1973, Month.JUNE, 26);
        System.out.printf("%s%n", StringConverter.toString(date, JapaneseChronology.INSTANCE));
        System.out.printf("%s%n", StringConverter.toString(date, MinguoChronology.INSTANCE));
        System.out.printf("%s%n", StringConverter.toString(date, ThaiBuddhistChronology.INSTANCE));
        System.out.printf("%s%n", StringConverter.toString(date, HijrahChronology.INSTANCE));

        System.out.printf("%s%n", StringConverter.fromString("10/29/0008 H", JapaneseChronology.INSTANCE));
        System.out.printf("%s%n", StringConverter.fromString("10/29/0085 1", MinguoChronology.INSTANCE));
        System.out.printf("%s%n", StringConverter.fromString("10/29/2539 B.E.", ThaiBuddhistChronology.INSTANCE));
        System.out.printf("%s%n", StringConverter.fromString("6/16/1417 1", HijrahChronology.INSTANCE));
    }
}
