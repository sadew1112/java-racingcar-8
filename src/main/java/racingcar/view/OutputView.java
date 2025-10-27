package racingcar.view;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OutputView {
    public void raceStart() {
        System.out.println("\n실행 결과");
    }
    public void progressView(Map<String, Integer> sheet){
        for(Map.Entry<String,Integer> entry : sheet.entrySet()){
            System.out.println(entry.getKey() + " : " + "-".repeat(entry.getValue()));
        }
        System.out.println();
    }
    public void winnerView(Map<String, Integer> sheet) {

        int max = sheet.values().stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        List<String> winnerList = sheet.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("최종 우승자 : " + String.join(", ", winnerList));
    }
}
