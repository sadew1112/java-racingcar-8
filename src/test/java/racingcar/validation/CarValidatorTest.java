package racingcar.validation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CarValidator {
    public List<String> transCarList(String input){
        inputValidate(input);
        List<String> carList = Arrays.stream(input.split(","))
                    .map(String::trim)
                    .filter(car -> !car.isEmpty())
                    .toList();

        carListValidate(carList);
        return carList;
    }

    private void inputValidate(String input){
        if(input == null || input.trim().isEmpty()){
            throw new IllegalArgumentException("자동차 이름 문자열은 공백이거나 비어 있을 수 없습니다.");
        }
    }

    private void carListValidate(List<String> carList){
        if(carList == null || carList.isEmpty()){
            throw new IllegalArgumentException("자동차 이름은 공백이거나 비어 있을 수 없습니다.");
        }

        for(String carName : carList){
            System.out.println("[DEBUG] carName = " + carName);
            if (carName.length() > 5) {
                System.out.println("[DEBUG] Throwing exception for: " + carName);
                throw new IllegalArgumentException("자동차 이름은 5자 이하로만 설정할 수 있습니다.");
            }
        }

        Set<String> carSet = new HashSet<>(carList);
        if (carSet.size() != carList.size()) {
            throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
        }
    }
}
