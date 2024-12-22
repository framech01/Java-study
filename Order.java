package com.helloshop.order;
//다른 package에서 product, user 정보 import 해오기
import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    //생성자
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
