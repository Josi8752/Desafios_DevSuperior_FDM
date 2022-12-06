package com.desafiocomponentes.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.desafiocomponentes.desafio.entities.Order;
@Service
public class OrderService {
    @Autowired
    ShippingService shippingService;

    public double total(Order order){

        return order.getBasic() + shippingService.shipment(order) - (order.getBasic() * order.getDiscount() /100);
    }


}
