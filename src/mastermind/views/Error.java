package mastermind.views;

public enum Error {
    WRONG_LENGTH("Wrong proposed combination length"),
    WRONG_CHARACTERS("Wrong colors, they must be: rgybmc"),
    DUPLICATED("Wrong colors, they must be not duplicated"),
    NULL(null);

    private String message;

    private Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public boolean isNull() {
        return this == Error.NULL;
    }
}
