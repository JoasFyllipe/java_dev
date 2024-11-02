package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        int[] arrayC = new int[n];

        for (int i=0; i<arrayA.length; i++){
            System.out.print("Digite o valor do vetor A para a posição "+i+": ");
            arrayA[i] = sc.nextInt();
        }
        System.out.println(" ");
        for (int i=0; i<arrayB.length; i++){
            System.out.print("Digite o valor do vetor B para a posição "+i+": ");
            arrayB[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.println("VETOR RESULTANTE");
        for (int i=0; i<arrayC.length; i++){
            arrayC[i] = arrayA[i] + arrayB[i];
            System.out.println(arrayC[i]);
        }
        sc.close();
    }
}
