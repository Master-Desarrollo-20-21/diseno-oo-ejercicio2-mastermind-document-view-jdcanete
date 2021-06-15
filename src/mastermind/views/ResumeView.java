package mastermind.views;

import mastermind.models.Game;
import utils.YesNoDialog;

public class ResumeView {

    private Game game;

    private boolean isResumed;

    public ResumeView(Game game) {
        this.game = game;
    }

    public void interact() {
        isResumed = new YesNoDialog().read(Message.RESUME.getMessage());
        if(isResumed) {
            game.reset();
        }
    }

    public boolean isResumed() {
        return isResumed;
    }

}
