package mastermind.views;

import mastermind.models.Result;
import utils.Console;

public class ResultView {

    private Result result;

    public ResultView(Result result) {
        this.result = result;
    }

    public void write() {
        new Console().writeln(Message.RESULTS.getMessage()
            .replace("#blacks", result.getBlacks() + "")
            .replace("#whites", result.getWhites() + ""));
    }

}
