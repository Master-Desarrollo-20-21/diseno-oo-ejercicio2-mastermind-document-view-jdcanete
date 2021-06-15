package mastermind.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecretCombination extends Combination {

    public SecretCombination() {
        super();
        List<Color> colors = Arrays.asList(Color.values());
        Collections.shuffle(colors);
        for(int i = 0; i < Combination.SIZE; i++) {
            this.colors.add(colors.get(i));
        }
    }

    public Result getResult(ProposedCombination proposedCombination) {
        int blacks = 0;
        int whites = 0;
        for(int i = 0; i < Combination.SIZE; i++) {
            if(proposedCombination.colors.get(i) == colors.get(i)) {
                blacks++;
            }
        }
        for(int i = 0; i < Combination.SIZE; i++) {
            int j = 0;
            while(j < Combination.SIZE && proposedCombination.colors.get(i) != colors.get(j)) {
                j++;
            }
            if(j < Combination.SIZE) {
                whites++;
            }
        }
        return new Result(blacks, whites - blacks);
    }

}
