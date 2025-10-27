package racingcar.validation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


public class CarValidatorTest {
    private final CarValidator validator = new CarValidator();

    @Test
    void 정상_케이스1() {
        assertThat(validator.transCarList("a11, b11, c11"))
                .containsExactly("a11", "b11", "c11");
    }

    @Test
    void 정상_케이스2() {
        assertThat(validator.transCarList("가나1!, 나다1!, 다라1!"))
                .containsExactly("가나1!", "나다1!", "다라1!");
    }

    @Test
    void 정상_케이스3() {
        assertThat(validator.transCarList("가나1!, 나다1!, 다라1!,,"))
                .containsExactly("가나1!", "나다1!", "다라1!");
    }

    @Test
    void 글자수_초과_예외_케이스() {
        assertThatThrownBy(() -> validator.transCarList("sadew,akduvkdf"))
                .isInstanceOf(IllegalArgumentException.class);
    }


    @Test
    void 빈문자열_입력_예외_케이스() {
        assertThatThrownBy(() -> validator.transCarList("   "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void null_입력_예외_케이스() {
        assertThatThrownBy(() -> validator.transCarList(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 중복_이름이면_예외_케이스() {
        assertThatThrownBy(() -> validator.transCarList("a11, a11"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
