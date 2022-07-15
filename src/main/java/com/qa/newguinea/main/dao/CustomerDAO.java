package com.qa.newguinea.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.qa.newguinea.main.persistance.Customers;
import com.qa.newguinea.utils.DBUtils;

public class CustomerDAO implements DAO<Customers> {

	@Override
	public Customers read(int id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM customers WHERE customer_id = ?;");) {
			statement.setInt(1, id);
			try (ResultSet resultSet = statement.executeQuery();) {
				resultSet.next();
				return modelFromResult(resultSet);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public Customers readByUserId(int id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM customers WHERE user_id = ?;");) {
			statement.setInt(1, id);
			try (ResultSet resultSet = statement.executeQuery();) {
				resultSet.next();
				return modelFromResult(resultSet);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public Customers readLatest() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM customers WHERE ORDER BY customer_id DESC LIMIT 1;");) {
			try (ResultSet resultSet = statement.executeQuery();) {
				resultSet.next();
				return modelFromResult(resultSet);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	@Override
	public Customers create(Customers c) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("INSERT INTO customers(customer_name, user_id, customer_address) VALUES (?, ?, ?);");) {
			statement.setString(1, c.getCustName());
			statement.setInt(2, c.getUserID());
			statement.setString(3, c.getCustAdress());
			statement.executeUpdate();
			return readLatest();
		} catch (Exception e) {
			System.out.println(e);
		}

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
