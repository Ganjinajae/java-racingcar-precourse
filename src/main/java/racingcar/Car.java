package racingcar;

public class Car {
    private Name name;
    private Position position;

    public Car(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }

    public void move(int singleDigitRandomValue) {
        if (singleDigitRandomValue >= 4) {
            position.move();
        }
    }

    public int getPosition() {
        return position.getValue();
    }
}
