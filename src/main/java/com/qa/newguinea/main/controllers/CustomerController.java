/*
package com.qa.newguinea.main.controllers;

import java.util.List;

import com.qa.newguinea.main.dao.CustomerDAO;
import com.qa.newguinea.main.persistance.Customers;
import java.util.Scanner;


public class CustomerController implements CrudController<Customers>{
	
	Scanner scan = new Scanner(System.in);

	/*@Override
	public List<Customers> readAll() {
		List<Customers> customers = CustomerDAO.readAll();
		for (Customers customer : customers);
			System.out.println(customers);
		return customers;
<<<<<<< HEAD
	}*/

=======
	}
 
>>>>>>> 92ea8ec2fcb92d277c1419a8e64ba817d9d8d1c3
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
		Customers customers = CustomerDAO.create(new Customers(name, userID, address));
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
		Customers customers = CustomerDAO.create(new Customers(name, userID, address));
		return customers;
	}

	@Override
	public int delete() {
		System.out.println("please enter the id of the customer you want to delete");
		int id = scan.nextInt();
		return CustomerDAO.delete(id);
	}

}*/
