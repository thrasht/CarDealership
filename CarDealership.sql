create database CarDealership;

create table vehicle_types(
	id int not null auto_increment primary key,
    type varchar(100) not null

);

create table vehicles(
	id int not null auto_increment primary key,
    type_id int not null,
    brand varchar(100) not null,
    model varchar(100) not null,
    color varchar(100) not null,
    value float not null,
    image varchar(100),
    
    foreign key(type_id) references vehicle_types(id)

);


create table users(
	id int not null auto_increment primary key,
    type enum('admin', 'client', 'seller') not null,
    email varchar(100) not null,
    password varchar(100) not null,
    address varchar(100),
    DNI varchar(50),
    image varchar(100)
    
);

create table appointments(
	id int not null auto_increment primary key,
    user_id int not null,
    vehicle_id int not null,
    created_at datetime default CURRENT_TIMESTAMP,
    appointment_date datetime not null,
    
    foreign key(user_id) references users(id),
    foreign key(vehicle_id) references vehicles(id)

);

create table sales(
	id int not null auto_increment primary key,
    user_id int not null,
    seller_id int not null,
    total float,
    
    foreign key(user_id) references users(id),
    foreign key(seller_id) references users(id)

);

create table sales_det(
	id int not null auto_increment primary key,
    sale_id int not null,
    vehicle_id int not null,
    amount int not null,
    sub_total float,
    
    foreign key(sale_id) references sales(id),
    foreign key(vehicle_id) references vehicles(id)

);

insert into vehicle_types(type) values("Automóvil");

insert into vehicles(type_id, brand, model, color, value, image)
			values(1, "Ford", "GT", "Azul", "700000", "ford_gt.jpg");



