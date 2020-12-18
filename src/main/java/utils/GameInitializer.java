package utils;

import View.InputView;
import domain.user.Dealer;
import domain.user.Player;
import java.util.ArrayList;
import java.util.List;

public class GameInitializer {

    public static Dealer initDealer() {
        return new Dealer();
    }

    public static List<Player> initPlayers() {
        List<String> playerNames = InputView.inputPlayerNames();
        List<Double> playerBettings = InputView.inputBettings(playerNames);
        List<Player> players = generatePlayers(playerNames, playerBettings);
        return players;
    }

    private static List<Player> generatePlayers(List<String> playerNames,
        List<Double> playerBettings) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < playerNames.size(); i++) {
            players.add(new Player(playerNames.get(i), playerBettings.get(i)));
        }
        return players;
    }
}
