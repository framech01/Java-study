package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count = 0;

    public void addItem(Item item) {
        if (count >= items.length) {
            System.out.println("FULL");
            return;
        }

        items[count] = item;
        count++;

    }

    public void displayItems() {
        for (int i = 0; i < count; i++) {

            Item item = items[i];
            System.out.println("상품명: " + item.getName() + "  총가격: " + item.getTotalPrice());

        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            Item item = items[i];
            total += items[i].getTotalPrice();

        }
        return total;
    }
}