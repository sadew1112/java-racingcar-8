package racingcar.validation;

public class CountValidator {

    public Integer validate(String input){
        if(input == null || input.trim().isEmpty()){
            throw new IllegalArgumentException("시도 횟수는 공백이거나 비어 있을 수 없습니다.");
        }

        try {
            int count = Integer.parseInt(input.trim());
            if(count <= 0){
                throw new IllegalArgumentException("시도 횟수는 음수이거나 0회일 수 없습니다.");
            }
            return count;
        } catch (Exception e){
            throw new IllegalArgumentException("시도 횟수는 숫자로만 구성될 수 있습니다.");
        }
    }
}
