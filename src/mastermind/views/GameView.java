package mastermind.views;

import mastermind.models.Game;
import utils.Console;

public class GameView {

    private Game game;

    public GameView(Game game) {
        this.game = game;
    }

    public void write() {
        new Console().writeln(Message.ATTEMPTS.getMessage().replace("#attempts", game.getAttemps() + ""));
        new SecretCombinationView().write();
        for(int i = 0; i < game.getAttemps(); i++) {
            new ProposedCombinationView(game.getProposedCombination(i)).write();
            new ResultView(game.getResult(i)).write();
        }
    }

}
