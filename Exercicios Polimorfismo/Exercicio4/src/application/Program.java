package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.printf("Tax payer #%d data: \n", i);
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            if(ch=='i'){
                System.out.print("Anual income: ");
                double rendaAnual = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double gastosComSaude = sc.nextDouble();
                list.add(new PessoaFisica(name, rendaAnual, gastosComSaude));
            }
            else if(ch == 'c'){
                System.out.print("Anual income: ");
                double rendaAnual = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numeroDeFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(name, rendaAnual, numeroDeFuncionarios));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        double valueTotal = 0.0;
        for(Pessoa pessoa: list){
            valueTotal += pessoa.valorImposto();
            System.out.println(pessoa);
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f",valueTotal);
    }
}
