package com.qa.newguinea.main.dao;

import java.sql.ResultSet;

import com.qa.newguinea.main.persistance.Customers;

public class CustomerDAO implements DAO<Customers> {

	@Override
	public Customers read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customers create(Customers t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customers update(Customers t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customers modelFromResult(ResultSet result) {
		try {
			int customerId = result.getInt("customer_id");
			String name = result.getString("customer_name");
			int userId = result.getInt("user_id");
			String address = result.getString("customer_address");
			return new Customers(customerId, name, userId, address);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
