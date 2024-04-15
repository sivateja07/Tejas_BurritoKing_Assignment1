import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> itemsOrdered;

    public Order() {
        itemsOrdered = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        itemsOrdered.add(item);
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (FoodItem item : itemsOrdered) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
}
