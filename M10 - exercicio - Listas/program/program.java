package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        int id = 0;
        String name = null;
        double salary = 0.0;

        Scanner scan = new Scanner(System.in);

        // LISTA DE FUNCIONARIOS
        List<Employee> listEmployees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int qtd = scan.nextInt();

        // (entrada) qtd de funcioanrios
        for (int i = 0; i < qtd; i++) {
            System.out.println("Employee #" + (i + 1));

            System.out.print("ID: ");
            id = scan.nextInt();

            System.out.print("Name: ");
            name = scan.next();

            System.out.print("Salary: ");
            salary = scan.nextDouble();

            Employee emp = new Employee(id, name, salary);
            listEmployees.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase :");
        id = scan.nextInt();

        System.out.print("Enter the percentage: ");
        double percentage = scan.nextDouble();

        boolean found = false;
        // Verificar se ID é igual
        for (Employee emp : listEmployees) {
            if (emp.getId() == id) {
                emp.incrementSalary(percentage);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("This id does not exist!");
        }

        // (Mostra a quantidade )
        System.out.println("List of employees: ");
        for (Employee emp : listEmployees) {
            System.out.print(emp.getId() + " , ");
            System.out.print(emp.getName() + " , ");
            System.out.print(emp.getSalary() + " , ");

        }

        scan.close();
    }
}
