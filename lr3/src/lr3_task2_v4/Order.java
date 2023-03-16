package lr3_task2_v4;

public class Order {
    private String descriptionOfOrder;
    private int cost;
    public Order(int cost, String descriptionOfOrder){
        this.cost = cost;
        this.descriptionOfOrder = descriptionOfOrder;
    }

    public int getCost() {
        return cost;
    }

    public String getDescriptionOfOrder() {
        return descriptionOfOrder;
    }

    @Override
    public String toString() {
        return "Description: " + descriptionOfOrder + ", Cost: " + cost;
    }
}
