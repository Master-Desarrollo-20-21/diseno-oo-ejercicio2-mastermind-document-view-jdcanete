package mastermind.models;

public class Result {

    private static final int MAX_BLACKS = 4;

    private int blacks;

    private int whites;

    public Result(int blacks, int whites) {
        this.blacks = blacks;
        this.whites = whites;
    }

    public boolean isWinner() {
        return blacks == MAX_BLACKS;
    }

    public int getBlacks() {
        return blacks;
    }

    public int getWhites() {
        return whites;
    }

}
