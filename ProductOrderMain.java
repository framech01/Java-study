package Exercise1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] items = new ProductOrder[3];
        items[0] = createOrder("두부", 2000, 2);
        items[1] = createOrder("김치", 5000, 1);
        items[2] = createOrder("콜라", 1500, 2);
        pointOrder(items);
        int totalAmount = getTotalAmount(items);
        System.out.println(totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void pointOrder(ProductOrder orders[]) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price*order.quantity;
        }

        return sum;
    }
}
