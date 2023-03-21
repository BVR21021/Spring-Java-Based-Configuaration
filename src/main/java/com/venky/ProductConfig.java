package com.venky;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
	@Bean("pb")
	public ProductBean printProduct() {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enetr the Product Details");
		  int id=sc.nextInt();
		  String name=sc.next();
		  int quantity=sc.nextInt();
		  double price=sc.nextDouble();
		ProductBean p=new ProductBean();
		p.setProId(id);
		p.setProName(name);
		p.setProQuantity(quantity);
		p.setProPrice(price);
		return p;
	}
}
