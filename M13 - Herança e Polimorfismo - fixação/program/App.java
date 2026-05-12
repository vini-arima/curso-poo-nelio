package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import entidades.Product;
import entidades.UsedProduct;
import entidades.ImportedProduct;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int qtd = Integer.parseInt(scan.nextLine());

        List<Product> list = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Product" + (i + 1) + " data:  ");

            System.out.print("Common, used or imported (c/u/i)? ");
            char opcao = scan.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = scan.nextLine().trim();

            System.out.print("Price ");
            double price = Double.parseDouble(scan.nextLine());

            if (opcao == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String input = scan.nextLine().trim();
                LocalDate matufacture = LocalDate.parse(input, fmt);

                Product prod = new UsedProduct(name, price, matufacture);
                list.add(prod);

            } else if (opcao == 'i') {
                System.out.println("Customs fee:");
                double customfree = Double.parseDouble(scan.nextLine());

                Product prod = new ImportedProduct(name, price, customfree);
                list.add(prod);

            } else {
                Product prod = new Product(name, price);
                list.add(prod);
            }
        }

        System.out.println("PAYMENT ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());

        }
    }
}
