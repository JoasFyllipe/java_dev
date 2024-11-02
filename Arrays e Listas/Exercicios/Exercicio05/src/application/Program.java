package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] maiPos = new double[n];
        for (int i=0; i< maiPos.length; i++){
            System.out.print("Digite um numero: ");
            maiPos[i] = sc.nextDouble();
        }

        double maiorValor = 0.0;
        int posicaoMaior = 0;
        for (int i=0; i< maiPos.length; i++){
            if(maiPos[i] > maiorValor){
                maiorValor = maiPos[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("MAIOR VALOR= %.1f\n", maiorValor);
        System.out.printf("POSIÇÃO DO MAIOR NUMERO= %d\n",posicaoMaior);

        sc.close();
    }
}
