package racingcar.validation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CountValidatorTest {

    private final CountValidator validator = new CountValidator();

    @Test
    void 정상_케이스() {
        assertThat(validator.validate("5")).isEqualTo(5);
    }

    @Test
    void 입력값_0_예외_케이스() {
        assertThatThrownBy(() -> validator.validate("0"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 입력값_음수_예외_케이스() {
        assertThatThrownBy(() -> validator.validate("-1"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 숫자가_아닌_문자면_예외() {
        assertThatThrownBy(() -> validator.validate("abc2"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}

