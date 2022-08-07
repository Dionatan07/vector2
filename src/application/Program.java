package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        int n = key.nextInt();

        double[] vector = new double[n];

        double average = 0.0;

        for (int i = 0; i < vector.length;i++){
            System.out.print("Enter the number: ");
            vector[i] = key.nextDouble();
            average += vector[i];
        }

        double finalAverage = (Double) average / vector.length;

        System.out.println();
        System.out.println("Vector Average: " + String.format("%.3f", finalAverage ));

        System.out.println("Elements below average: ");
        for (int i = 0; i < vector.length; i++){
            if(vector[i] < finalAverage){
                System.out.println(String.format("%.1f", vector[i]));
            }
        }

    }
}
