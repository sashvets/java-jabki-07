package main.shape;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина должна быть больше 0");
        } else if (height <= 0) {
            throw new IllegalArgumentException("Высота должна быть больше 0");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public void displayArea() {
        System.out.printf("Площадь прямоугольника с шириной %.2f и высотой %.2f равна %.2f%n", this.width, this.height, this.area());
    }
}