package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final int MAX_ATTEMPTS = 10;

    private SecretCombination secretCombination;

    private List<ProposedCombination> proposedCombinations;

    private List<Result> results;

    private int counterAttempt;

    public Game() {
        secretCombination = new SecretCombination();
        proposedCombinations = new ArrayList<>();
        results = new ArrayList<>();
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        proposedCombinations.add(proposedCombination);
        results.add(secretCombination.getResult(proposedCombination));
        counterAttempt++;
    }

    public boolean isOver() {
        return counterAttempt == MAX_ATTEMPTS || this.isWinner();
    }

    public boolean isWinner() {
        return results.get(counterAttempt - 1).isWinner();
    }

    public void reset() {
        this.secretCombination = new SecretCombination();
        proposedCombinations.clear();
        results.clear();
        counterAttempt = 0;
    }

    public int getAttemps() {
        return counterAttempt;
    }

    public ProposedCombination getProposedCombination(int index) {
        return proposedCombinations.get(index);
    }

    public Result getResult(int index) {
        return results.get(index);
    }

}
