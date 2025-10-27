package racingcar.game;

import racingcar.strategy.MoveStrategy;
import racingcar.view.OutputView;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RacingGame {
    private final MoveStrategy moveStrategy;
    private final OutputView outputView;

    public RacingGame(MoveStrategy moveStrategy, OutputView outputView){
        this.moveStrategy = moveStrategy;
        this.outputView = outputView;
    }

    public void race(List<String> carList, int count){
        Map<String, Integer> sheet = new LinkedHashMap<>();
        for (String car : carList) {
            sheet.put(car, 0);
        }
        outputView.raceStart();

        for(int i = 0 ; i < count ; i++){
            for(String car : carList){
                int isMoved = move();
                sheet.put(car, sheet.get(car) + isMoved);
            }

            outputView.progressView(sheet);
        }
        outputView.winnerView(sheet);

    }

    private int move(){
        int isMoved;
        if(moveStrategy.isMovable()){
            isMoved = 1;
        }else {
            isMoved = 0;
        }

        return isMoved;
    }
}
