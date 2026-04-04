package principal;

import java.util.Scanner;

import entidades.Titular;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Titular conta = new Titular(0, null, 0);

        System.out.print("Enter account number:");
        int account = sc.nextInt();

        System.out.print("Enter account holder:");
        String holder = sc.next();

        System.out.print("Is there na initial deposit (y/n)?");
        char opcao = sc.next().charAt(0);

        while (opcao != 'y' && opcao != 'n') {
            System.out.print("Opção invalida");
        }

        double balance = 0.0;

        if (opcao == 'y') {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();

            System.out.print("Account data:");
            System.out.print(" Account " + account + " Holder: " + holder + "  Balance: " + balance);

            // Deposito
            System.out.print("Enter a deposit value: ");
            double depositar = sc.nextDouble();

            conta.deposit(depositar);
            System.out.println("Updated account data: ");
            System.out.print(" Account " + account + " Holder: " + holder + "  Balance: " + depositar);

            // Saque
            System.out.print("Enter a withdraw value: ");
            double saque = sc.nextDouble();

            System.out.println("Updated account data: ");
            conta.withdraw(saque);
            System.out.print(" Account " + account + " Holder: " + holder + "  Balance: " + saque);

        } else if (opcao == 'n') {
            System.out.print("  Account " + account + "  Holder: " + holder + " Balance: " + balance);

            // Deposito
            System.out.println("Enter a deposit value: ");
            double depositar = sc.nextDouble();

            conta.deposit(depositar + balance);
            System.out.println("Updated account data: ");
            System.out.print(" Account " + account + " Holder: " + holder + "  Balance: " + balance); // ERRO NA CHAMADA

            // Saque
            System.out.println("Enter a withdraw value: ");
            double saque = sc.nextDouble();

            System.out.println("Updated account data: ");
            conta.withdraw(saque - balance);
            System.out.print(" Account " + account + " Holder: " + holder + "  Balance: " + balance); // ERRO NA CHAMADA

        }

    }

}
