package calculator;

public class Shop {
    private final Item[] items;

    public Shop(Item[] items) throws IllegalArgumentException {
        if (items != null) {
            this.items = items;
        } else {
            throw new IllegalArgumentException("Error! The items array is null");
        }
    }

    public void printItemsEarnedAmount() {
        System.out.println("Earned amount:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int getSumOfItemsEarnedAmount() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getEarnedAmount();
        }
        return sum;
    }
}
