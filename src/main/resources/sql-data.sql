INSERT INTO users(username, user_password) VALUES 
	("Tasdiq", "fuzz"),
    ("Naym", "pass"),
    ("Daniel", "root");
    
INSERT INTO customers (customer_name, customer_address, user_id) VALUES ("Tasdiq Dewan", "9 Trescoe Gardens, Harrow, HA2 9TB", 1);
INSERT INTO drivers (driver_name, driver_zone, user_id) VALUES ("Naym Rahman", "London", 2);
INSERT INTO managers (manager_name, user_id) VALUES ("Daniel Maton-Walker", 3);

INSERT INTO orders(customer_id, order_date, order_address) VALUES (1, "2022-07-16", "9 Trescoe Gardens, Harrow, HA2 9TB");

INSERT INTO deliveries(order_id, driver_id, delivery_date, delivery_address, delivery_zone, delivery_status) VALUES (1, 1, "2022-07-16", "9 Trescoe Gardens, Harrow, HA2 9TB", "London", "Ready to Deliver");
INSERT INTO deliveries(order_id, driver_id, delivery_date, delivery_address, delivery_zone, delivery_status) VALUES (1, null, "2022-07-20", "9 Trescoe Gardens, Harrow, HA2 9TB", "London", "Awaiting Driver");

-- SELECT * FROM users;
-- SELECT * FROM customers;
-- SELECT * FROM drivers;
-- SELECT * FROM managers;
-- SELECT * FROM orders;
-- SELECT * FROM deliveries;