DROP DATABASE IF EXISTS new_guinea;

CREATE DATABASE IF NOT EXISTS new_guinea;

USE new_guinea;

CREATE TABLE IF NOT EXISTS users (
	user_id INT AUTO_INCREMENT NOT NULL,
    username VARCHAR(50) UNIQUE NOT NULL,
    user_password VARCHAR(50) UNIQUE NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE IF NOT EXISTS customers(
	customer_id INT AUTO_INCREMENT NOT NULL,
    customer_name VARCHAR(50) NOT NULL,
    customer_address VARCHAR(100) NOT NULL,
    user_id INT NOT NULL,
    PRIMARY KEY(customer_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT EXISTS drivers(
	driver_id INT AUTO_INCREMENT NOT NULL,
    driver_name VARCHAR(50) NOT NULL,
    driver_zone CHAR(10) NOT NULL,
    user_id INT NOT NULL,
    PRIMARY KEY (driver_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT EXISTS managers(
	manager_id INT AUTO_INCREMENT NOT NULL,
    manager_name VARCHAR(50) NOT NULL,
    user_id INT NOT NULL,
    PRIMARY KEY (manager_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT EXISTS orders(
	order_id INT AUTO_INCREMENT NOT NULL,
    customer_id INT NOT NULL,
    order_date DATE NOT NULL,
    order_address VARCHAR(100) NOT NULL,
    PRIMARY KEY (order_id),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

CREATE TABLE IF NOT EXISTS deliveries(
	delivery_id INT AUTO_INCREMENT NOT NULL,
    order_id INT NOT NULL,
    driver_id INT NOT NULL,
    delivery_date DATE NOT NULL,
    delivery_address VARCHAR(100) NOT NULL,
    delivery_zone CHAR(10) NOT NULL,
    delivery_status VARCHAR(25) NOT NULL,
    PRIMARY KEY (delivery_id),
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (driver_id) REFERENCES drivers(driver_id)
);