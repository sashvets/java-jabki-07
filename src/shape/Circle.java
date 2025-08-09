package shape;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус окружности должен быть больше 0");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void displayArea() {
        System.out.printf("Площадь окружности радиусом %.2f равна %.2f%n", this.radius, this.area());
    }
}