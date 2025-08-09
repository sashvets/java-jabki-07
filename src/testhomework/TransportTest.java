package testhomework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import transport.Airplane;
import transport.Bicycle;
import transport.Transport;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TransportTest {

    @Test
    void testTransport() {
        Transport transport = new Transport(150) {
            @Override
            public void move() {
                System.out.printf("Движение со скоростью %.1f км/ч", this.getSpeed());
            }
        };
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        transport.move();
        Assertions.assertEquals("Движение со скоростью 150,0 км/ч", outputStream.toString().trim());
    }

    @Test
    void testBicycle() {
        Bicycle bicycle = new Bicycle(15);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        bicycle.move();
        Assertions.assertEquals("Велосипед катится со скоростью 15,0 км/ч", outputStream.toString().trim());

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Bicycle(-15));
        Assertions.assertEquals("Скорость не может быть отрицательной", exception.getMessage());
    }

    @Test
    void testAirplane() {
        Airplane bicycle = new Airplane(230);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        bicycle.move();
        Assertions.assertEquals("Аэроплан летит со скоростью 230,0 км/ч", outputStream.toString().trim());

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> new Airplane(-15));
        Assertions.assertEquals("Скорость не может быть отрицательной", exception.getMessage());
    }
}