package mastermind.views;

import mastermind.models.ProposedCombination;
import utils.Console;
import mastermind.models.Color;
import mastermind.models.Combination;

public class ProposedCombinationView {

    private ProposedCombination proposedCombination;

    public ProposedCombinationView() {
        proposedCombination = new ProposedCombination();
    }

    public ProposedCombinationView(ProposedCombination proposedCombination) {
        this.proposedCombination = proposedCombination;
    }

    public ProposedCombination read() {
        Error error;
        do {
            String combination = new Console().readString(Message.PROPOSED_COMBINATION.getMessage()).toUpperCase();
            error = Error.NULL;
            if(combination.length() != Combination.SIZE) {
                error = Error.WRONG_LENGTH;
            }
            else {
                for(int i = 0; i < Combination.SIZE; i++) {
                    char keyword = combination.charAt(i);
                    Color color = ColorView.valueOf(keyword);
                    if(color.isNull()) {
                        error = Error.WRONG_CHARACTERS;
                    } 
                    else {
                        if(proposedCombination.contains(color)) {
                            error = Error.DUPLICATED;
                        } else {
                            proposedCombination.add(color);
                        }
                    }
                }
            }
            
            if(!error.isNull()) {
                new ErrorView(error).write();
                proposedCombination.clear();
            }
        } while(!error.isNull());
        return proposedCombination;
    }

    public void write() {
        for(Color color: proposedCombination.getColors()) {
            new ColorView(color).write();
        }
    }

}
