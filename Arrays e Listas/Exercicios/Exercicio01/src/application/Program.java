//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        Integer[] negativos = new Integer[n];


        for (int i=0; i<negativos.length; i++){
            System.out.println("Digite um numero: ");
            negativos[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int i=0; i<negativos.length; i++){
            if(negativos[i] < 0){
                System.out.println(negativos[i]);
            }
        }

        sc.close();
    }
}
