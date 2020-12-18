package View;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import utils.InputValidator;

public class InputView {

    private static final String NAME_DELIMITER = ",";
    private static final Scanner scanner = new Scanner(System.in);
    private static final String ERROR_PREFIX = "[ERROR] : ";

    public static List<String> inputPlayerNames() {
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
}
