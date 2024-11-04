package application;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        Estudante[] estudante = new Estudante[10];
        for (int i=0; i<n; i++){
            System.out.println("Rent #"+ (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            estudante[room] = new Estudante(name, email);
            sc.nextLine();
        }
        for (int i=0; i<estudante.length; i++){
            if(estudante[i] != null){
                System.out.println(i+": "+estudante[i].toString());
            }
        }
        sc.close();
    }
}
