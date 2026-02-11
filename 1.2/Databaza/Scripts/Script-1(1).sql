--CREATE DATABASE WotD

USE WotD


--listy
CREATE TABLE Version(
	id INT PRIMARY KEY IDENTITY(1,1),
	name NVARCHAR(20) NOT NULL,
	date_create DATE NOT NULL
)	
	
CREATE TABLE Stat_Category(
	id INT PRIMARY KEY IDENTITY(1,1),
	name NVARCHAR(MAX) NOT NULL
)	
	
CREATE TABLE Stat_Value(
	id INT PRIMARY KEY IDENTITY(1,1),
	value NVARCHAR(MAX) NOT NULL
)

CREATE TABLE Tank_Type(
	id INT PRIMARY KEY IDENTITY(1,1),,
	name NVARCHAR(MAX) NOT NULL,
	description NVARCHAR(MAX)
)

CREATE TABLE Tank_Class(
	id INT PRIMARY KEY IDENTITY(1,1),
	name NVARCHAR(MAX) NOT NULL,
	description NVARCHAR(MAX) NOT NULL
)

CREATE TABLE Tank_Status(
	id INT PRIMARY KEY IDENTITY(1,1),
	name NVARCHAR(MAX) NOT NULL,
	description NVARCHAR(MAX)
)

CREATE TABLE Player(
	id INT PRIMARY KEY IDENTITY(1,1),
	name NVARCHAR(MAX) NOT NULL,
	date_of_creation DATE NOT NULL
)

CREATE TABLE Battle_Map(
	id INT PRIMARY KEY IDENTITY(1,1),
	name NVARCHAR(MAX) NOT NULL,
	description NVARCHAR(MAX)
)

CREATE TABLE Battle_Type(
	id INT PRIMARY KEY IDENTITY(1,1),
	name NVARCHAR(MAX) NOT NULL,
	description NVARCHAR(MAX)
)


--klacky
CREATE TABLE Stat_Row(
	id INT PRIMARY KEY IDENTITY(1,1),
	name NVARCHAR(MAX) NOT NULL,
	stat_category_id INT NOT NULL,
	stat_value_id INT NOT NULL,
	FOREIGN KEY (stat_category_id) REFERENCES Stat_Category(id),
	FOREIGN KEY (stat_value_id) REFERENCES Stat_Value(id)
)

CREATE TABLE Tank(
	id INT PRIMARY KEY IDENTITY(1,1),
	name NVARCHAR(MAX) NOT NULL,
	nation NVARCHAR(MAX) NOT NULL,
	tier INT NOT NULL,
	description NVARCHAR(MAX),
	tank_type_id INT NOT NULL,
	tank_class_id INT NOT NULL,
	tank_status_id INT NOT NULL,
	FOREIGN KEY (tank_type_id) REFERENCES Tank_Type(id),
	FOREIGN KEY (tank_class_id) REFERENCES Tank_Class(id),
	FOREIGN KEY (tank_status_id) REFERENCES Tank_Status(id)
)

CREATE TABLE Tank_Stat(
	tank_id INT PRIMARY KEY,
	version_id INT PRIMARY KEY,
	stat_row_id INT PRIMARY KEY,
	FOREIGN KEY (tank_id) REFERENCES Tank(id),
	FOREIGN KEY (version_id) REFERENCES Version(id) PRIMARY KEY,
	FOREIGN KEY (stat_row_id) REFERENCES Stat_Row(id) PRIMARY KEY
)

CREATE TABLE Battle(
	id INT PRIMARY KEY IDENTITY(1,1),
	date_of_battle DATE NOT NULL,
	win BIT NOT NULL,
	dmg INT NOT NULL,
	assist INT NOT NULL,
	blocked INT NOT NULL,
	kils INT NOT NULL,
	player_id INT NOT NULL,
	map_id INT NOT NULL,
	battle_type_id INT NOT NULL,
	version_id INT NOT NULL,
	tank_id INT NOT NULL,
	FOREIGN KEY (player_id) REFERENCES Player(id),,
	FOREIGN KEY (map_id) REFERENCES Battle_Map(id)
	FOREIGN KEY (battle_type_id) REFERENCES Battle_Type(id),
	FOREIGN KEY (version_id) REFERENCES Version(id),
	FOREIGN KEY (tank_id) REFERENCES Tank(id)
)
	