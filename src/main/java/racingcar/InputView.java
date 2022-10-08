package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputView() {
        throw new IllegalStateException("입력을 위한 유틸리티 클래스입니다.");
    }

    private static final String SEPARATOR = ",";

    public static String[] typeCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String carNames = Console.readLine();
        return carNames.split(SEPARATOR);
    }
}
