package test;

import main.file.File;
import main.file.ImageFile;
import main.file.TextFile;
import main.Homework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.soundemitter.AlarmClock;
import main.soundemitter.CarHorn;
import main.soundemitter.Dog;
import main.soundemitter.SoundEmitter;
import main.transport.Airplane;
import main.transport.Bicycle;
import main.transport.Transport;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class HomeworkTest {

    @Test
    void testPlayAllSounds() {

        SoundEmitter[] sounds = {
                new Dog(),
                new AlarmClock(),
                new CarHorn()
        };

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Homework.playAllSounds(sounds);
        Assertions.assertEquals("ГавГав!\r\nДинДонДинДон!\r\nБибип!", outputStream.toString().trim());
    }

    @Test
    void testGetFilesTotalSize() {
        File[] files = {
                new TextFile("Чебурашка.txt", "Привет"),
                new ImageFile("Смайл.bmp", 1024, 768, 8),
                new TextFile("Крокодил.txt", "Пока"),
                new ImageFile("Смайл.bmp", 1920, 1080, 32)
        };
        Assertions.assertEquals(72646676, Homework.getFilesTotalSize(files));
    }

    @Test
    void testStartRace() {
        Transport[] vehicle = {
                new Bicycle(20),
                new Airplane(230),
                new Bicycle(15),
                new Airplane(150)
        };

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Homework.startRace(vehicle);
        Assertions.assertEquals(
                "Велосипед катится со скоростью 20,0 км/ч\r\n" +
                        "Аэроплан летит со скоростью 230,0 км/ч\r\n" +
                        "Велосипед катится со скоростью 15,0 км/ч\r\n" +
                        "Аэроплан летит со скоростью 150,0 км/ч", outputStream.toString().trim());
    }
}