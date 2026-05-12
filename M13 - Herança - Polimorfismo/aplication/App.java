package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Employee;
import entidades.OutEmployee;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of employees:");
        int qtd = Integer.parseInt(scan.nextLine());

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Employee " + (i + 1) + " data:  ");

            System.out.print("Outsourced (y/n)? ");
            char opcao = scan.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = scan.nextLine().trim();

            System.out.print("Hours: ");
            int hours = Integer.parseInt(scan.nextLine());

            System.out.print("Value per hour: ");
            double valueH = Double.parseDouble(scan.nextLine());

            if (opcao == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = Double.parseDouble(scan.nextLine());
                // ADICIONAR - list + declaração do objeto
                list.add(new OutEmployee(name, hours, valueH, additionalCharge));

                // Employee emp = new OutEmployee(name, hours, valueH, additionalCharge)
                // list(emp) ;
            } else {
                list.add(new Employee(name, hours, valueH));
            }
        }

        System.out.println("PAYMENT ");
        for (Employee worker : list) {
            System.out.println(worker.getName() + " - " + worker.payment());
        }

    }
}
