package homework;

import file.File;
import file.ImageFile;
import file.TextFile;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import soundemitter.AlarmClock;
import soundemitter.CarHorn;
import soundemitter.Dog;
import soundemitter.SoundEmitter;
import transport.Airplane;
import transport.Bicycle;
import transport.Transport;

public class Homework {

    public static void main(String[] args) {
        /**
         * 1. Фигуры
         * Создайте абстрактный класс Shape с абстрактным методом double area() и методом void displayArea().
         * Создайте классы-наследники:
         * Circle с полем radius.
         * Rectangle с полями width и height.
         * Создайте массив Shape[], заполните его экземплярами и вызовите displayArea() для каждого элемента (полиморфизм).
         */
        Shape[] shapes = {
                new Circle(10),
                new Rectangle(10, 20),
                new Circle(2),
                new Rectangle(2, 2)
        };
        for (Shape shape : shapes) {
            System.out.printf("Площадь фигуры : %.2f%n", shape.area());
            shape.displayArea();
        }

        /**
         * 2. Звуки
         * Создайте интерфейс SoundEmitter с методом void makeSound().
         * Реализуйте его в классах:
         * Dog
         * AlarmClock
         * CarHorn
         * Создайте метод playAllSounds(SoundEmitter[] devices), который вызывает makeSound() у каждого объекта.
         * Покажите преимущества интерфейсов.
         */
        SoundEmitter[] sounds = {
                new Dog(),
                new AlarmClock(),
                new CarHorn()
        };
        playAllSounds(sounds);

        /**
         * 3. Файловая система
         * Абстрактный класс File с полями name и абстрактным методом long getSize().
         * Реализации:
         * TextFile с полем content (строка).
         * ImageFile с полями width, height, bytesPerPixel.
         * Реализуйте метод getSize() в каждом классе.
         * Напишите метод, который считает общий размер всех файлов в массиве File[].
         */
        File[] files = {
                new TextFile("Чебурашка.txt", "Привет"),
                new ImageFile("Смайл.bmp", 1024, 768, 8),
                new TextFile("Крокодил.txt", "Пока"),
                new ImageFile("Смайл.bmp", 1920, 1080, 32)
        };
        System.out.printf("Общий размер всех файлов : %d%n", getFilesSize(files));

        /**
         * 4. Транспорт
         * Абстрактный класс Transport с полем speed и абстрактным методом void move().
         * Подклассы:
         * Bicycle
         * Airplane
         * В каждом классе реализуйте move() с описанием движения.
         * Создайте метод startRace(Transport[] vehicles), который вызывает move().
         */
        Transport[] vehicle = {
                new Bicycle(20),
                new Airplane(230),
                new Bicycle(15),
                new Airplane(150)
        };
        startRace(vehicle);
    }

    public static void playAllSounds(SoundEmitter[] devices) {
        for (SoundEmitter device : devices) {
            device.makeSound();
        }
    }

    public static long getFilesSize(File[] files) {
        long size = 0;
        for (File file : files) {
            size += file.getSize();
        }
        return size;
    }

    public static void startRace(Transport[] vehicles) {
        for (Transport vehicle : vehicles) {
            vehicle.move();
        }
    }
}