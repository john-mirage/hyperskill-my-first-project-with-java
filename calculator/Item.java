package calculator;

public class Item {
    private final String name;
    private final int earnedAmount;

    public Item(String name, int earnedAmount) throws IllegalArgumentException {
        this.name = name;
        if (earnedAmount > 0) {
            this.earnedAmount = earnedAmount;
        } else {
            throw new IllegalArgumentException("Error! Earned amount must be greater than 0");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getEarnedAmount() {
        return this.earnedAmount;
    }

    @Override
    public String toString() {
        return String.format("%s: $%d", this.name, this.earnedAmount);
    }
}
