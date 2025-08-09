package transport;

public abstract class Transport {

    private double speed;

    public Transport(double speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Скорость не может быть отрицательной");
        }
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public abstract void move();
}