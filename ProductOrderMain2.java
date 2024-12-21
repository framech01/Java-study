package Exercise1;
import java.util.Scanner;
public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine();
        ProductOrder[] items = new ProductOrder[i];

        for (int j=0; j< items.length; j++) {
            System.out.println("상품명:");
            String name = sc.nextLine();

            System.out.println("가격:");
            int price = sc.nextInt();

            System.out.println("수량:");
            int quantity = sc.nextInt();
            sc.nextLine();

          items[j]=createOrder(name,price,quantity);

        }

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
            sum += order.price * order.quantity;
        }

        return sum;
    }

}







