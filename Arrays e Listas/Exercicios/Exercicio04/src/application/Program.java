package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        int num = 0;
        int[] numPar = new int[n];
        for (int i=0; i< numPar.length; i++){
            System.out.print("Digite um numero: ");
            numPar[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for (int i=0; i<numPar.length; i++){
            if(numPar[i] %2 == 0){
                System.out.print(numPar[i]+" ");
            }
        }

        int qntPar = 0;
        for (int i=0; i<numPar.length; i++){
            if(numPar[i] %2 == 0){
                qntPar++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES: "+ qntPar);

        sc.close();
    }
}
