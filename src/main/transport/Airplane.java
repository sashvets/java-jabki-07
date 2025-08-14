package main.transport;

public class Airplane extends Transport {

    public Airplane(double speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.printf("Аэроплан летит со скоростью %.1f км/ч%n", getSpeed());
    }
}
