import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        BlackjackGame blackjackGame = new BlackjackGame();
        blackjackGame.play();
        scanner.close();
    }
}

