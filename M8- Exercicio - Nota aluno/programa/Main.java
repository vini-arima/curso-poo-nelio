package programa;

import java.util.Scanner;

import aluno.Student;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student aluno = new Student();

        String name = scan.nextLine();
        aluno.nota1 = scan.nextDouble();
        aluno.nota2 = scan.nextDouble();
        aluno.nota3 = scan.nextDouble();

        System.out.printf("FINAL GRADE = %.2f ",
                aluno.finalgrade());

        if (aluno.finalgrade() < 60.0) {
            System.out.println("PASS");
        } else {
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingnote());
            System.out.println("FAILED");
        }

        scan.close();
    }
}
