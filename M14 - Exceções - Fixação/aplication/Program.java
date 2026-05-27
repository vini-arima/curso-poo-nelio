package aplication;

import java.util.Scanner;

import model_entidades.Account;
import model_exeções.AccountException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Holder: ");
            String holder = sc.nextLine().trim();

            System.out.print("Initial balance: ");
            double balance = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Withdraw limit: ");
            double withdrawLimit = Double.parseDouble(sc.nextLine().trim());

            Account acc = new Account(number, holder, balance, withdrawLimit);
            System.out.println("Enter amount for withdraw:");
            double amount = Double.parseDouble(sc.nextLine().trim());

            acc.windraw(amount);
            System.out.println("New balance:" + acc.getBalance());

        } catch (AccountException e) {
            System.out.println("Unexpected error" + e.getMessage());

        }
    }
}
