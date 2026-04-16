package aplication;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.Departament;
import entidades.HourContract;
import entidades.Worker;
import entidades.WorkerLevel;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Departament departament = new Departament(null);

        System.out.print("Enter department's name:");
        String depName = scan.nextLine();

        Departament dep = new Departament(depName);

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        String workerName = scan.nextLine();

        System.out.print("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(scan.nextLine());

        System.out.print("BaseSalary: ");
        double baseSalary = Double.parseDouble(scan.nextLine());

        Worker worker = new Worker(workerName, workerLevel, baseSalary, dep);

        System.out.print("How many contracts to this worker ?");
        int qtd = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < qtd; i++) {
            System.out.println("Enter contract" + (i + 1) + "data:");

            System.out.print("Date (DD/MM/YYYY): ");
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String input = scan.nextLine().trim();
            LocalDate contractDate = LocalDate.parse(input, fmt);

            System.out.print("Value per hour: ");
            double valueHour = Double.parseDouble(scan.nextLine());

            System.out.print("Duration (hours): ");
            int hour = Integer.parseInt(scan.nextLine());

            HourContract contract = new HourContract(contractDate, valueHour, hour);
            worker.addContract(contract);
        }

        System.out.print("Entre o ano e mes para calcular o ganho (MM/YYYY): ");
        String monthAndYear = scan.nextLine();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name:" + worker.getName());
        System.out.println("Departamenet:" + worker.getDepartament().getName());
        System.out
                .println("Income: " + monthAndYear + " : " + String.format("%.2f", worker.incomeContract(year, month)));
    }
}
