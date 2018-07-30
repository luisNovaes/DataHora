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
public class UsandoEnumMes {

    public static void main(String[] args) {
        // Use Month.JULY como um argumento do método
        LocalDate ld1 = LocalDate.of(2019, Month.JULY, 1);

        // Deriva um mês a partir de uma data local
        Month m1 = Month.from(ld1);

        // Cria um mês a partir de um valor int 2
        Month m2 = Month.of(6);

        // Obter o próximo mês de m2
        Month m3 = m2.plus(1);

        // Obtém o mês a partir de uma data local
        Month m4 = ld1.getMonth();

        // Converta uma constante enum em int
        int m5 = m2.getValue();

        System.out.format("%s, %s, %s, %s, %d%n", m1, m2, m3, m4, m5);
    }

}
