package main.soundemitter;

public class CarHorn implements SoundEmitter {

    @Override
    public void makeSound() {
        System.out.println("Бибип!");
    }
}
