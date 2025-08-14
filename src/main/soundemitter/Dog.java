package main.soundemitter;

public class Dog implements SoundEmitter {

    @Override
    public void makeSound() {
        System.out.println("ГавГав!");
    }
}
