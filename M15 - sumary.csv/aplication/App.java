package aplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Produto;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pathIn = "C:\\temp\\in.txt";

        List<Produto> list = new ArrayList<>();

        System.out.print("Quantos produtos o arquivo tem: ");
        int N = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < N; i++) {
            System.out.println("Digite o " + (i + 1) + "o  Produto  ");
            System.out.print("nome: ");
            String nome = scan.nextLine();

            System.out.print("preco: ");
            double preco = Double.parseDouble(scan.nextLine());

            System.out.print("qtd: ");
            int qtd = Integer.parseInt(scan.nextLine());

            Produto prod = new Produto(nome, preco, qtd);
            list.add(prod);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathIn))) {

            // aqui é o in.txt
            for (Produto prod : list) {
                bw.write(prod.toString());
                bw.newLine();
            }

            System.out.println("Arquivo criado com sucesso!");

            // out.txt
            String pathOut = "C:\\temp\\out.txt";

            try (BufferedWriter bout = new BufferedWriter(new FileWriter(pathOut));) {

                for (Produto prod : list) {
                    bout.write(prod.getNome() + "," + prod.valorTotal());
                    bout.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scan.close();

    }
}
