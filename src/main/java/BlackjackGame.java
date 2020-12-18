import domain.user.Dealer;
import domain.user.Player;
import java.util.List;
import java.util.Scanner;
import utils.GameInitializer;

public class BlackjackGame {

    private Dealer dealer;
    private List<Player> players;

    public BlackjackGame() {
        initialize();
    }

    public void play() {
    }

    public void initialize() {
        dealer = GameInitializer.initDealer();
        players = GameInitializer.initPlayers();
    }
}
