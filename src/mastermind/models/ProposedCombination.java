package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class ProposedCombination extends Combination {

    public List<Color> getColors() {
        return new ArrayList<>(colors);
    }

    public boolean contains(Color color) {
        return colors.contains(color);
    }

    public void add(Color color) {
        colors.add(color);
    }

    public void clear() {
        colors.clear();
    }

}
