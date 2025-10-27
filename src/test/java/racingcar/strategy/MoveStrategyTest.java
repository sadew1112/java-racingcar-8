package racingcar.strategy;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class MoveStrategy {
    public boolean isMovable(){
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }

}
