package racingcar.strategy;

import org.junit.jupiter.api.RepeatedTest;
import static org.assertj.core.api.Assertions.*;

class MoveStrategyTest {
    private final MoveStrategy moveStrategy = new MoveStrategy();
    @RepeatedTest(5)
    void 랜덤값_시뮬레이션() {
        assertThat(moveStrategy.isMovable())
                .isIn(true, false);
    }
}

