package racingcar;

import racingcar.game.RacingGame;
import racingcar.strategy.MoveStrategy;
import racingcar.validation.CarValidator;
import racingcar.validation.CountValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView(
                new CarValidator(),
                new CountValidator()
        );
        List<String> carList = inputView.cars();
        int count = inputView.moveCount();

        RacingGame game = new RacingGame(new MoveStrategy(), new OutputView());
        game.race(carList, count);
    }
}
