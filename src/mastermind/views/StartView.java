package mastermind.views;

import utils.Console;

public class StartView {

    public void write() {
        new Console().writeln(Message.TITLE.getMessage());
    }

}
