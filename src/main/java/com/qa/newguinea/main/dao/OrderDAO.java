package com.qa.newguinea.main.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.qa.newguinea.main.persistance.Order;
import com.qa.newguinea.utils.DBUtils;

public class OrderDAO implements DAO<Order> {

	@Override
	public Order read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order create(Order t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order update(Order t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order modelFromResult(ResultSet result) {
		try {
			int orderId = result.getInt("order_id");
			int customerId = result.getInt("customer_id");
			Date orderDate = result.getDate("order_date");
			String orderAddress = result.getString("order_address");
			return new Order(orderId, customerId, orderDate, orderAddress);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
