package aluno;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    double notaGeral = nota1 + nota2 + nota3;

    public double finalgrade() {
        return nota1 + nota2 + nota3;
    }

    public double missingnote() {

        if (notaGeral < 60.0) {
            return 60.0 - finalgrade();
            // return finalGrade() - notaGeral;
        }
        return 0.0;
    }
}
