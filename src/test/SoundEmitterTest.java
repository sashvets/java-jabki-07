package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.soundemitter.AlarmClock;
import main.soundemitter.CarHorn;
import main.soundemitter.Dog;
import main.soundemitter.SoundEmitter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class SoundEmitterTest {

    @Test
    void testSoundEmitter() {
        SoundEmitter soundevice = new SoundEmitter() {
            @Override
            public void makeSound() {
                System.out.println("Пипипи!");
            }
        };
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        soundevice.makeSound();
        Assertions.assertEquals("Пипипи!", outputStream.toString().trim());
    }

    @Test
    void testDog() {
        Dog dog = new Dog();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        dog.makeSound();
        Assertions.assertEquals("ГавГав!", outContent.toString().trim());
    }

    @Test
    void testCarHorn() {
        CarHorn carHorn = new CarHorn();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        carHorn.makeSound();
        Assertions.assertEquals("Бибип!", outContent.toString().trim());
    }

    @Test
    void testAlarmClock() {
        AlarmClock alarmClock = new AlarmClock();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        alarmClock.makeSound();
        Assertions.assertEquals("ДинДонДинДон!", outContent.toString().trim());
    }
}