//print temperature from input

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        
        double[] temperature = new double[7];
        enterTemps( temperature );
        displayTemps( temperature );
    }

    private static void enterTemps(double[] temperature) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < temperature.length ; i++) {
            System.out.println("enter max temperature for day" + (i+1));
            temperature[i] = sc.nextDouble();
        }
    }

    private static void displayTemps(double[] temperature) {
        System.out.println();
        System.out.println("***TEMPERATURE ENTERED***");
        for (int i = 0 ; i < temperature.length ; i++){
            System.out.println( "day " +(i+1) +" " + temperature[i]);
        }
    }
}
