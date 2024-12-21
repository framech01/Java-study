package Exercise1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        ProductOrder item1 = new ProductOrder();
        item1.productName="두부";
        item1.price=2000;
        item1.quantity=2;
        productOrders[0]=item1;

        ProductOrder item2 = new ProductOrder();
        item2.productName="김치";
        item2.price=5000;
        item2.quantity=1;
        productOrders[1]=item2;

        ProductOrder item3= new ProductOrder();
        item3.productName="콜라";
        item3.price=1500;
        item3.quantity=2;
        productOrders[2]=item3;

        int tot_price=0;

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: "+productOrder.productName+" 가격: "+productOrder.price+" 수량: "+productOrder.quantity);
            tot_price+=productOrder.price*productOrder.quantity;
        }

        System.out.println("총 결제 금액: "+tot_price);

    }

}
