package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {

    public static final int SIZE = 4;

    protected List<Color> colors;
    
    protected Combination() {
        colors = new ArrayList<>();
    }

}
