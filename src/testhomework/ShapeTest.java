package testhomework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;

class ShapeTest {

    @Test
    void startShape() {
        Shape shape = new Circle(10);
        DecimalFormat df = new DecimalFormat("#.##");
        Assertions.assertEquals("314,16", df.format(shape.area()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        shape.displayArea();
        Assertions.assertEquals("Площадь окружности радиусом 10,00 равна 314,16", outContent.toString().trim());
    }

    @Test
    void testCircle() {
        Circle circle = new Circle(10);
        DecimalFormat df = new DecimalFormat("#.##");
        Assertions.assertEquals("314,16", df.format(circle.area()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        circle.displayArea();
        Assertions.assertEquals("Площадь окружности радиусом 10,00 равна 314,16", outputStream.toString().trim());

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle(-10));
        Assertions.assertEquals("Радиус окружности должен быть больше 0", exception.getMessage());
    }

    @Test
    void getRectangle() {
        Rectangle rectangle = new Rectangle(10, 20);
        Assertions.assertEquals(200, rectangle.area());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        rectangle.displayArea();
        Assertions.assertEquals("Площадь прямоугольника с шириной 10,00 и высотой 20,00 равна 200,00", outputStream.toString().trim());

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-10, 20));
        Assertions.assertEquals("Ширина должна быть больше 0", exception.getMessage());

        exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(10, 0));
        Assertions.assertEquals("Высота должна быть больше 0", exception.getMessage());
    }
}