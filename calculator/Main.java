package calculator;

public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[] {
            new Item("Bubblegum", 202),
            new Item("Toffee", 118),
            new Item("Ice cream", 2250),
            new Item("Milk chocolate", 1680),
            new Item("Doughnut", 1075),
            new Item("Pancake", 80)
        };
        Shop shop = new Shop(items);
        shop.printItemsEarnedAmount();
        System.out.println();
        int sumOfItemsEarnedAmount = shop.getSumOfItemsEarnedAmount();
        System.out.printf("Income: $%d%n", sumOfItemsEarnedAmount);
        int staffExpenses = UserInterface.askForExpenses("Staff expenses:");
        int otherExpenses = UserInterface.askForExpenses("Other expenses:");
        System.out.printf("Net income: $%d", sumOfItemsEarnedAmount - staffExpenses - otherExpenses);
    }
}
