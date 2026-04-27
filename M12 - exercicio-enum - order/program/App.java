package program;

import java.util.Scanner;

import entidades.Client;
import entidades.Order;
import entidades.OrderItem;
import entidades.OrderStatus;
import entidades.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1) VARIAVEL TEMPORARIA
        // Escopo local -> serva apenas para passa parametros

        // DADOS CLIENTE
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY):");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String birth = sc.nextLine().trim();
        LocalDate niver = LocalDate.parse(birth, fmt);

        Client client = new Client(name, email, niver);

        // DADOS order data

        System.out.println("Enter order data:");
        System.out.print("Status:");
        String input = sc.nextLine().trim().toUpperCase();
        OrderStatus status = OrderStatus.valueOf(input);

        System.out.print("How many items to this order?");
        int qtd = Integer.parseInt(sc.nextLine());

        Order order = new Order();
        for (int i = 0; i < qtd; i++) {
            System.out.println("Enter contract " + (i + 1) + " data: ");

            System.out.println("Product name: ");
            String name_product = sc.nextLine();

            System.out.println("Product price:");
            Double price_product = Double.parseDouble(sc.nextLine());

            System.out.println("Quantity:");
            int quantity = Integer.parseInt(sc.nextLine());

            // 2) ATENÇÃO: APRENDER A CRIAR CONSTRUTORES PARA A APLICAÇÃO (CRIA CONSTRUTOR
            // VAZIO + SETTER OU CONSTUTOR QUE CHAMA PARARAMETRO)
            Product product = new Product(name_product, price_product);

            // CONSTSTRUTOR VAZIO ( NÃO É BOA PRATICA )
            // Product product = new Product();
            // product.setName(varA)
            // product.setPrice(varB)

            OrderItem orderItem = new OrderItem(quantity, product.getPrice(), product);
            order.addItem(orderItem);

            // 3) ATENÇÃO: AO FINAL DE CADA ENTRADA DE VARIAVIES TEMPORARIAS CHAMAR
            // CONSTRUTORES
            // int var1 = scan,nextInt();
            //
            // Construtor obj = new Construtor (var1) ;

        }
        DateTimeFormatter dmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // ATENÇÃO LEMBRAR: SETTER
        order.setMoment(LocalDateTime.now());
        order.setStatus(OrderStatus.PROCESSING);

        // MOSTRA DADOS
        System.out.println("ORDER SUMMARY:");

        System.out.printf("Order moment: %s%n", dmt.format(order.getMoment()));
        System.out.printf("Order status: %s%n", order.getStatus());
        System.out.printf("Client: %s (%s) - %s%n",
                client.getName(),
                client.getBirthDate(),
                client.getEmail());

        System.out.println(order);

    }
}
