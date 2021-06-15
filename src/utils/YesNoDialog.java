package utils;

public class YesNoDialog {

    public boolean read(String message) {
        Console console = new Console();
        String ans;
        do {
            ans = console.readString(message);
        } while(!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
        return ans.equalsIgnoreCase("y");
    }

}
