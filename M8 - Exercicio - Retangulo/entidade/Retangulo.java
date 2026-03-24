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