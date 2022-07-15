package com.qa.newguinea.main.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qa.newguinea.main.dao.DeliveryDAO;
import com.qa.newguinea.main.persistance.Delivery;

public class DeliveryController implements CrudController<Delivery> {

	Scanner scan = new Scanner(System.in);
	
	DeliveryDAO dao = new DeliveryDAO();
	
	@Override
	public List<Delivery> readAll() {
		List<Delivery> list = new ArrayList<Delivery>();
		list = dao.readAll();
		System.out.println(list);
		return null;
	}

	@Override
	public Delivery read() {
		System.out.println("Please input delivery ID:");
		int deliveryid = scan.nextInt();
		Delivery d = dao.read(deliveryid);
		System.out.println(d);
		return null;
	}

	@Override
	public Delivery readLatest() {
		Delivery d = dao.readLatest();
		System.out.println(d);
		return null;
	}

	@Override
	public Delivery create() {
		System.out.println("Please input order ID:");
		int orderId = scan.nextInt();
		//get order info
		//create delivery using dao
		return null;
	}

	@Override
	public Delivery update() {
		System.out.println("Please input delivery ID:");
		int deliveryid = scan.nextInt();
		System.out.println("Select option:\nAssign Driver\nUpdate Status");
		String option = scan.nextLine();
		switch(option.toLowerCase()) {
			case "assign driver" :
				//assign driver id to delivery
				break;
			case "update status":
				System.out.println("Awaiting driver\nDispatched\nDelivered\nRescheduled\nCancelled");
				break;
			default:
				break;
		}
		return null;
	}

	@Override
	public int delete() {
		System.out.println("Please input delivery ID:");
		int id = scan.nextInt();
		//dao delivery
		System.out.println("Delviery cancelled.");
		return 0;
	}

}
