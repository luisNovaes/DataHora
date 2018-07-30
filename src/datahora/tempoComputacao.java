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
public class tempoComputacao {

    public static void main(String[] args) throws Exception {
        // Get current time
        long start = System.currentTimeMillis();
        System.out.println(start);
        // Do something ...

        // Get elapsed time in milliseconds
        long elapsedTimeMillis = System.currentTimeMillis() - start;

        // Get elapsed time in seconds
        float elapsedTimeSec = elapsedTimeMillis / 1000F;

        // Get elapsed time in minutes
        float elapsedTimeMin = elapsedTimeMillis / (60 * 1000F);

        // Get elapsed time in hours
        float elapsedTimeHour = elapsedTimeMillis / (60 * 60 * 1000F);

        // Get elapsed time in days
        float elapsedTimeDay = elapsedTimeMillis / (24 * 60 * 60 * 1000F);
    }

}
