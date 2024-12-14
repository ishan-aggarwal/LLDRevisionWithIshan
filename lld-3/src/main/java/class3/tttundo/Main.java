package class3.tttundo;

import class3.tttundo.controllers.GameController;
import class3.tttundo.models.Game;
import class3.tttundo.models.GameState;
import class3.tttundo.models.Player;
import class3.tttundo.models.Symbol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {

//        SpringApplication.run(Main.class, args);

        Player player = new Player("Ishan", new Symbol('X'));
        Player player1 = new Player("Mohit", new Symbol('O'));
        List<Player> playerList = new ArrayList<>();
        playerList.add(player);
        playerList.add(player1);

        GameController controller = new GameController();
        Game game = controller.startGame(3, playerList);

        while (controller.getGameState(game) == GameState.IN_PROGRESS) {
            controller.makeMove(game);
        }

    }

}
