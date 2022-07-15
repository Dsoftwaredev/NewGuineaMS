package com.qa.newguinea.main;
import java.util.Scanner;
import com.qa.newguinea.main.controllers.DeliveryController;
import com.qa.newguinea.main.controllers.DriverController;
import com.qa.newguinea.main.dao.DeliveryDAO;
import com.qa.newguinea.main.dao.DriverDAO;
import com.qa.newguinea.main.dao.UserDAO;
import com.qa.newguinea.utils.DBUtils;

public class NewGuinea {
	Scanner scan = new Scanner(System.in);
	private final DriverController drivers;
	private final DeliveryController deliveries;
	final DriverDAO driverDAO = DriverDAO();
	final DeliveryDAO delivery = DeliveryDAO();
	final UserDAO userDAO = UserDAO();
	
	public NewGuinea() {
		final DriverDAO driverDAO = DriverDAO();
		final DeliveryDAO delivery = DeliveryDAO();
		final UserDAO userDAO = UserDAO();
	}
	
	public void loginSystem() {
		System.out.println("Would you like to login as a manager or driver?");
		DBUtils.connect();
		
		int userid = userDAO.logIn();
		//if driver driverdao.readbyID
	}
}
