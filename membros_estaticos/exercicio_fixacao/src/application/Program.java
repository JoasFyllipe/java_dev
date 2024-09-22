package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.priceDollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantityDollarGet = sc.nextDouble();

        double addImp = CurrencyConverter.vallueDollarGet(quantityDollarGet) * CurrencyConverter.IOF;
        double vallueTotal = (CurrencyConverter.vallueDollarGet(quantityDollarGet))+ addImp;

        System.out.printf("Amount to be paid in reais: %.2f", vallueTotal);

        sc.close();
    }
}
