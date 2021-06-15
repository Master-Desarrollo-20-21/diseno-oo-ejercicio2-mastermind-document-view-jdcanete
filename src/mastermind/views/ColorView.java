package mastermind.views;

import mastermind.models.Color;
import utils.Console;

public class ColorView {

    private Color color;

    public ColorView(Color color) {
        this.color = color;
    }

    public static Color valueOf(char keyword) {
        for(Color color: Color.values()) {
            if(color.name().charAt(0) == keyword) {
                return color;
            }
        }
        return Color.NULL;
    }

    public void write() {
        new Console().write(color.name().toLowerCase().charAt(0));
    }

}
