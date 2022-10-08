package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("자동차", 0);
    }

    @Test
    void 이름_길이_1자_이상_5자_이하() {
        assertThatNoException()
                .isThrownBy(() -> car = new Car("가", 0));
        assertThatNoException()
                .isThrownBy(() -> car = new Car("가나다라마", 0));
    }

    @Test
    void 이름_길이_0인_문자열_예외() {
        assertThatThrownBy(() -> car = new Car("", 0))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 이름_길이_5자_이상_예외() {
        assertThatThrownBy(() -> car = new Car("가나다라마바", 0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
