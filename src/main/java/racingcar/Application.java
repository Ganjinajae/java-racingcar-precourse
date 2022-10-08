package racingcar;

public class Application {
    public static void main(String[] args) {
        Cars cars = getCars();
    }

    private static Cars getCars() {
        while (true) {
            try {
                String[] carNames = InputView.typeCarNames();
                return new Cars(carNames);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
