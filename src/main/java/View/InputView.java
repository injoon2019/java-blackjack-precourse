package View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import utils.InputValidator;

public class InputView {

    private static final String NAME_DELIMITER = ",";
    private static final Scanner scanner = new Scanner(System.in);
    private static final String ERROR_PREFIX = "[ERROR] : ";
    private static final String MONEY_INPUT_MESSAGE = "의 배팅 금액은?";
    private static final String INPUT_PLAYER_NAMES_MESSAGE = "게임에 참여할 사람의 이름을 입력하세요(쉼표 기준으로 분리)";

    public static List<String> inputPlayerNames() {
        System.out.println(INPUT_PLAYER_NAMES_MESSAGE);
        String rawPlayerNames = scanner.nextLine().trim();
        List<String> playerNames = Arrays.asList(rawPlayerNames.split(NAME_DELIMITER));
        try {
            InputValidator.validatePlayerNames(playerNames);
            return playerNames;
        } catch (IllegalArgumentException iae) {
            System.out.println(ERROR_PREFIX + iae.getMessage());
            return inputPlayerNames();
        }
    }

    public static List<Double> inputBettings(List<String> playerNames) {
        List<Double> bettings = new ArrayList<>();
        for (String name : playerNames) {
            System.out.println(name + MONEY_INPUT_MESSAGE);
            double money = inputMoney();
            bettings.add(money);
        }
        return bettings;
    }

    private static double inputMoney() {
        try {
            String money = scanner.nextLine();
            InputValidator.validateMoney(money);
            return Double.parseDouble(money);
        } catch (Exception e) {
            System.out.println(ERROR_PREFIX + e.getMessage());
            return inputMoney();
        }
    }
}
