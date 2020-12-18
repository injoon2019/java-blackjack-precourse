package utils;

import java.util.List;

public class InputValidator {

    private static final int NAME_LENGTH_MIN = 2;
    private static final String ERROR_PREFIX = "이름은 쉼표로 구분되며 2자 이상이어야 합니다";
    private static final String MONEY_ERROR = "숫자로 된 금액만 입력해주세요";

    public static void validatePlayerNames(List<String> playerNames) {
        for (String name : playerNames) {
            if (name.length() < NAME_LENGTH_MIN) {
                throw new IllegalArgumentException(ERROR_PREFIX);
            }
        }
    }

    public static void validateMoney(String money) {
        try {
            Double.parseDouble(money);
        } catch (Exception e) {
            throw new IllegalArgumentException(MONEY_ERROR);
        }
    }
}
