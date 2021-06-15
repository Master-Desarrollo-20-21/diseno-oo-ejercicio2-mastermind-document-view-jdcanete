package mastermind;

import mastermind.models.Game;
import mastermind.views.View;

class Mastermind {

    private Game game;

    private View view;

    public Mastermind() {
        game = new Game();
        view = new View(game);
    }

    public void play() {
        view.interact();
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}