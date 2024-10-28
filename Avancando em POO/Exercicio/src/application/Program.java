package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char resp = sc.nextLine().charAt(0);
        if(resp == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else{
            account = new Account(number, holder);
        }

        System.out.println("Account data: "+ account.getNumber());
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withDrawValue = sc.nextDouble();
        account.withDraw(withDrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}
