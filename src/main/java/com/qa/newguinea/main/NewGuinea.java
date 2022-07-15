package com.qa.newguinea.main;
import java.util.Scanner;

import com.qa.newguinea.main.controllers.DeliveryController;
import com.qa.newguinea.main.controllers.DriverController;
import com.qa.newguinea.main.dao.DeliveryDAO;
import com.qa.newguinea.main.dao.DriverDAO;
import com.qa.newguinea.main.dao.ManagerDAO;
import com.qa.newguinea.main.dao.UserDAO;
import com.qa.newguinea.main.persistance.Driver;
import com.qa.newguinea.main.persistance.Manager;
import com.qa.newguinea.utils.DBUtils;

public class NewGuinea {
	Scanner scan = new Scanner(System.in);
	private final DriverController driverController = new DriverController();
	private final DeliveryController deliveryController = new DeliveryController();
	final DriverDAO driverDAO = new DriverDAO();
	final DeliveryDAO deliveryDAO = new DeliveryDAO();
	final UserDAO userDAO = new UserDAO();
	final ManagerDAO managerDAO = new ManagerDAO();
	
	
	
	public void loginSystem() {
		DBUtils.connect();
		System.out.println("Would you like to login as a manager or driver?");
		String userType = scan.nextLine();
	
		
	
		System.out.println("What is your username");
		String name = scan.nextLine();
		
		System.out.println("What is your password");
		String pass = scan.nextLine();
		
		int userid = userDAO.logIn(name, pass);
		
		switch(userType.toLowerCase().trim()) {
		case "driver":
			Driver driver = driverDAO.readByUserId(userid);
			giveDriverOptions(driver);
			break;
		case "manager":
			Manager manager = managerDAO.readByUserId(userid);
			giveManagerOptions(manager);
			break;
		default:
			System.out.println("This is invalid");
			break;
		}		
	}
	
	public void giveDriverOptions(Driver driver) {
		//viewing all deliveries in zone
		System.out.println("press 1 to view all deliveries by zone, press 2 to assign a delivery, press 3 to change the status of a delivery, press 4 to log out");
		int options = scan.nextInt();
		switch(options) {
			case 1:
				String zone = driver.getDriverZone();
				deliveryController.readAllByZone(zone);
				break;
			case 2:
				System.out.println("Enter the id of the delivery you want to take on:");
				int deliveryId = scan.nextInt();
				deliveryController.assignDriver(driver.getDriverID(), deliveryId);
				break;
				
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				break;
		}
		
		//choosing to assign themselves a delivery
		//changing the status of a delivery
	}
	
	public void giveManagerOptions(Manager manager) {
		
	}
	
	
}
