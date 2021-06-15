package mastermind.views;

public enum Message {
    TITLE("----- MASTERMIND -----"),
    RESUME("Do you want to continue? (y/n): "),
    ATTEMPTS("#attempts attempt(s): "),  
    SECRET_COMBINATION("*"), 
    PROPOSED_COMBINATION("Propose a combination: "), 
    WINNER("You've won!!! ;-)"),
    LOOSER("You've lost!!! :-("), 
    RESULTS(" --> #blacks blacks and #whites whites");
    
    private String message;

    private Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
