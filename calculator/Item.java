package calculator;

public class Item {
    private final String name;
    private final int earnedAmount;

    public Item(String name, int earnedAmount) {
        this.name = name;
        this.earnedAmount = earnedAmount;
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
