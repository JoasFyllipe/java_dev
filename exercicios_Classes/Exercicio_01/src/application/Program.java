package application;

import entities.Retangulo;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height");

        Retangulo retangulo = new Retangulo();

        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.printf("AREA = "+ String.format("%.2f%n",retangulo.area()));
        System.out.printf("PERIMETER = "+ String.format("%.2f%n",retangulo.perimeter()));
        System.out.printf("DIAGONAL = "+ String.format("%.2f%n",retangulo.diagonal()));

    }
}
