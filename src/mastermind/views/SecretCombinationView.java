package mastermind.views;

import mastermind.models.Combination;
import utils.Console;

public class SecretCombinationView {

    public void write() {
        Console console = new Console();
        for(int i = 0; i < Combination.SIZE; i++) {
            console.write(Message.SECRET_COMBINATION.getMessage());
        }
        console.writeln();
    }

}
