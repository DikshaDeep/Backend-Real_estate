create database real_estate;
create table contact(
id int not null auto_increment,
fullname varchar(45) not null,
email varchar(45) not null,
subject varchar(100) not null,
phone bigint(10) not null unsigned,
message varchar(1000) not null,
PRIMARY KEY (id)
);

create table personaldetails(
id int not null auto_increment,
email varchar(255),
fullname varchar(255),
password varchar(255),
phone bigint,
stat varchar(255),
username varchar(255),
userStatus varchar(45),
PRIMARY KEY (id)
);

create table propertydetails(
propid int not null,
address varchar(255),
area int,
bathroom int,
email varchar(255),
info varchar(255),
name varchar(255),
phone bigint,
postalcode int,
price bigint(20),
propStatus varchar(255),
rooms int(11),
title varchar(255),
type varchar(255),
userid int(11),
parking tinyint(1),
ac tinyint(1),
balcony tinyint(1),
pool tinyint(1),
laundry tinyint(1),
storage tinyint(1),
gaspipe tinyint(1),
alarm tinyint(1),
city varchar(40),
state varchar(40),
buildingage varchar(40),
floor varchar(40),
noofparking varchar(40),
furnished varchar(40),
view varchar(40),
pooja tinyint(1),
location varchar(40),
image varchar(100000),
propertyStat varchar(40),
imageName varchar(1000),
imageType varchar(40),
primary key(propid)
);
