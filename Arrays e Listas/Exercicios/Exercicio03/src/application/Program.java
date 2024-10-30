package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoa = new Pessoa[n];
        for (int i=0; i< pessoa.length; i++){
            sc.nextLine();
            System.out.println("Dados da "+ (i+1)+ "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0;
        for (int i=0; i< pessoa.length; i++){
            soma += pessoa[i].getAltura();
        }
        double alturaMedia = soma/ pessoa.length;
        System.out.printf("\nAltura média: %.2f%n",alturaMedia);

        int menorDezesseis = 0;
        for (int i=0; i< pessoa.length; i++){
            if(pessoa[i].getIdade() < 16){
                menorDezesseis++;
            }
        }
        double porcentagem = menorDezesseis*100/ pessoa.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", porcentagem);
        for (int i=0; i< pessoa.length; i++){
            if(pessoa[i].getIdade() < 16){
                System.out.println(pessoa[i].getNome());
            }
        }

        sc.close();
    }
}