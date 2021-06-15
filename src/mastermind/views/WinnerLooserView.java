package mastermind.views;

import mastermind.models.Game;
import utils.Console;

public class WinnerLooserView {

    private Game game;

    public WinnerLooserView(Game game) {
        this.game = game;
    }

    public void write() {
        Console console = new Console();
        if(game.isWinner()) {
            console.writeln(Message.WINNER.getMessage());
        } else {
            console.writeln(Message.LOOSER.getMessage());
        }
    }

}
