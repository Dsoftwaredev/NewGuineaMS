package com.qa.newguinea.main.controllers;

import java.util.List;
import java.util.Scanner;

import com.qa.newguinea.main.dao.OrderDAO;
import com.qa.newguinea.main.persistance.Delivery;
import com.qa.newguinea.main.persistance.Order;

public class OrderController implements CrudController<Order> {

	Scanner scan = new Scanner(System.in);
	
	OrderDAO dao = new OrderDAO();
	
	@Override
	public List<Order> readAll() {
		List<Order> list = dao.readAll();
		System.out.println(list);
		return list;
	}

	@Override
	public Order read() {
		System.out.println("Please input Order ID:");
		int orderid = scan.nextInt();
		Order o = dao.read(orderid);
		System.out.println(o);
		return o;
	}

	@Override
	public Order readLatest() {
		Order o = dao.readLatest();
		System.out.println(o);
		return o;
	}

	@Override
	public Order create() {
		System.out.println("Please input order ID:");
		int orderId = scan.nextInt();
		return null;
	}

	@Override
	public Order update() {
		System.out.println("Please input order ID:");
		return null;
	}

	@Override
	public int delete() {
		System.out.println("Please input order ID:");
		int id = scan.nextInt();
		int result = dao.delete(id);
		
		if(result == 1) {
			System.out.println("Order cancelled.");
		}
		else {
			System.out.println("Error! PLease try again.");
		}
		
		return 0;
	}

}
