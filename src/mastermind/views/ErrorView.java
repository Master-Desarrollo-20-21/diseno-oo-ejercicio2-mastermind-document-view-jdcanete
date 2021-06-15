package mastermind.views;

import utils.Console;

public class ErrorView {

    private Error error;

    public ErrorView(Error error) {
        this.error = error;
    }

    public void write() {
        new Console().writeln(error.getMessage());
    }

}
