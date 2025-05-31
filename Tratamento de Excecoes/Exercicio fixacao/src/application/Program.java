package application;

import model.entities.Account;
import model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account = new Account();

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double amount = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();
        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        Double withdraw = sc.nextDouble();

        account.setNumber(number);
        account.setHolder(holder);
        account.deposit(amount);
        account.setWithdrawLimit(withdrawLimit);

        try {
            account.withdraw(withdraw);
            System.out.println(account);
        } catch (WithdrawException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
