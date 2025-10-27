package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.validation.CarValidator;
import racingcar.validation.CountValidator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    private final CarValidator carValidator;
    private final CountValidator countValidator;

    public InputView(CarValidator carValidator, CountValidator countValidator){
        this.carValidator = carValidator;
        this.countValidator = countValidator;
    }

    public List<String> cars(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputCars = Console.readLine();

        return carValidator.transCarList(inputCars);
    }

    public Integer moveCount(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        String inputCount = Console.readLine();

        return countValidator.validate(inputCount);
    }
}
