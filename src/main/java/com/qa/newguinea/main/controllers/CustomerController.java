package com.qa.newguinea.main.controllers;

import java.util.List;

import com.qa.newguinea.main.persistance.Customers;
import java.util.Scanner;


public class CustomerController implements CrudController<Customers>{
	
	Scanner scan = new Scanner(System.in);

	@Override
	public List<Customers> readAll() {
		List<Customers> customers = customerDAO.readAll();
		for (Customers customer : customers);
			System.out.println(customers);
		return customers;
	}
 
	@Override
	public Customers read() {

		return null;
	}

	@Override
	public Customers readLatest() {
		return null;
	}

	@Override
	public Customers create() {
		System.out.println("Please enter a customer name");
		String name = scan.nextLine();
		System.out.println("Please enter a user id");
		int userID = scan.nextInt();
		System.out.println("Please enter a customer address");
		String address = scan.nextLine();
		Customers customers = customerDAO.create(new Customers(name, userID, address));
		return customers;
	}

	@Override
	public Customers update() {
		System.out.println("What is the ID of the customer you would like to update");
		int id = scan.nextInt();
		System.out.println("Please enter a customer name");
		String name = scan.nextLine();
		System.out.println("Please enter a user id")
		int userID = scan.nextInt();
		System.out.println("Please enter a customer address");
		String address = scan.nextLine();
		Customers customers = customerDAO.create(new Customers(name, userID, address));
		return customers;
	}

	@Override
	public int delete() {
		System.out.println("please enter the id of the customer you want to delete");
		int id = scan.nextInt();
		return customerDAO.delete(id);
	}

}
