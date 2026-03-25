import java.util.Scanner;

public class Retangulo {
    double Width;
    double Height;

    public double area() {
        return Width * Height;
    }

    public double perimetro() {
        return (Width + Width) + (Height + Height);
    }

    public double diagonal() {
        return Math.sqrt((Width * Width) + (Height * Height));
    }
}
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Retangulo figura = new Retangulo();

        System.out.println("Enter rectangle width and height: \n");
        figura.Width = scan.nextDouble();
        figura.Height = scan.nextDouble();

        System.out.printf("AREA = %.2f PERIMETER = %.2f DIAGONAL = %.2f%n",
                figura.area(), figura.perimetro(), figura.diagonal());
    }
}
