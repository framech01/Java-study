package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1=new Item("마늘",2000,2);
        Item item2=new Item("상추",3000,4);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();
    }
}


//1. Item 생성자를 통해 초기값 입력하고 참조값 받아옴
//2. 참조값을 ShoppingCart 속 addItem 메서드에 보내줌