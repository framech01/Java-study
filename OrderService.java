package com.helloshop.order;

import com.helloshop.user.User;
import com.helloshop.product.Product;

public class OrderService {

    //실제로 주문하는 서비스
    public void order(){
        User user=new User();
        Product product=new Product();
        Order order=new Order(user,product);

    }
}
