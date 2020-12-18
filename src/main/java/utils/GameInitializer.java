package utils;

import View.InputView;
import domain.user.Dealer;
import domain.user.Player;
import java.util.List;

public class GameInitializer {

    public static Dealer initDealer() {
        return new Dealer();
    }

    public static List<Player> initPlayers() {
        List<String> playerNames = InputView.inputPlayerNames();
    }
}
