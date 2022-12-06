package com.desafiocomponentes.desafio;

import com.desafiocomponentes.desafio.entities.Order;

import com.desafiocomponentes.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.desafiocomponentes.desafio"})
public class DesafioApplication  implements CommandLineRunner {

	private Order order;

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 Order order = new Order(1309, 95.90, 0.00);
          System.out.printf("Pedido código: %d\n ", order.getCode());
		  System.out.printf("Valor total: R$%.2f%n", orderService.total(order));
	}
}
