//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] somaVetor = new double[n];

        for (int i=0; i<somaVetor.length; i++){
            System.out.println("Digite um numero: ");
            somaVetor[i] = sc.nextDouble();
        }

        System.out.print("VALORES: ");
        for(int i=0; i<somaVetor.length; i++){
            System.out.print(somaVetor[i]+ " ");
        }

        double soma = 0.0;
        System.out.print("\nSOMA: ");
        for (int i=0; i<somaVetor.length; i++){
            soma += somaVetor[i];
        }
        System.out.printf("%.2f\n", soma);

        double media = (soma/somaVetor.length);
        System.out.printf("MÉDIA: %.2f\n", media);

        sc.close();
    }
}
