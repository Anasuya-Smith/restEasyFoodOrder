DROP TABLE IF EXISTS USERS CASCADE;
create table users (id integer not null auto_increment, customer bit, password varchar(255), username varchar(255), vendor bit, primary key (id)) engine=InnoDB;

DROP TABLE IF EXISTS DISHES CASCADE;
create table dishes (dish_name varchar(255) not null, dish_cal float not null, dishid integer, primary key (dish_name)) engine=InnoDB;

DROP TABLE IF EXISTS VENDOR CASCADE;
create table vendor (vendorid integer not null, dish_name varchar(255), vendor_dish_price float not null, vendor_name varchar(255), primary key (vendorid), foreign key (dish_name) references dishes(dish_name)) engine=InnoDB;

DROP TABLE IF EXISTS ORDERS CASCADE;
create table orders (order_id integer not null auto_increment, order_date date not null, dishid integer, customer_id integer not null, vendor_name varchar(255), dish_name varchar(255), dish_price float not null, cust_order_quantity integer, order_amount float not null, primary key (order_id), foreign key (dish_name) references dishes (dish_name), foreign key (customer_id) references users(id)) engine=InnoDB;
