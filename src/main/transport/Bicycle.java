package main.transport;

public class Bicycle extends Transport {

    public Bicycle(double speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.printf("Велосипед катится со скоростью %.1f км/ч%n", getSpeed());
    }
}