package racingcar;

public class Car {
    private String name;
    private int position;

    public Car(String name, int position) {
        validateNameLength(name);
        this.name = name;
        this.position = position;
    }

    private void validateNameLength(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 빈 값을 허용하지 않습니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
