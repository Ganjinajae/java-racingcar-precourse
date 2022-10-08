package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList;

    public Cars(String[] carNames) {
        validateCarListSize(carNames);
        this.carList = this.mapper(carNames);
    }

    private void validateCarListSize(String[] carNames) {
        if (carNames.length < 2) {
            throw new IllegalArgumentException("[ERROR] 자동차 입력 값은 2개 이상이어야 합니다.");
        }
    }

    private List<Car> mapper(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNames.length; i++) {
            cars.add(new Car(carNames[i], 0));
        }
        return cars;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
