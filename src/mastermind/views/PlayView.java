package mastermind.views;

import mastermind.models.Game;
import mastermind.models.ProposedCombination;

public class PlayView {

    private GameView gameView;

    private Game game;

    public PlayView(Game game) {
        this.game = game;
        gameView = new GameView(this.game);
    }

    public void interact() {
        do {
            ProposedCombination proposedCombination = new ProposedCombinationView().read();
            game.addProposedCombination(proposedCombination);
            gameView.write();
        } while(!game.isOver());
        new WinnerLooserView(game).write();
    }

}
