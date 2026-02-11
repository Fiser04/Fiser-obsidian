--CREATE DATABASE WotBattleDatabase
--DROP DATABASE WotBattleDatabase
USE master;
--DROP DATABASE WotBattleDatabaseV2;
--CREATE DATABASE WotBattleDatabaseV2;
USE WotBattleDatabaseV2;

CREATE TABLE Player(
    player_id BIGINT PRIMARY KEY IDENTITY(1,1),
    player_name NVARCHAR(MAX) NOT NULL,
);

CREATE TABLE Equipment(
    equipment_id INT PRIMARY KEY IDENTITY(1,1),
    equipment_name NVARCHAR(MAX) NOT NULL,
    equipment_effect NVARCHAR(MAX) NOT NULL,
);

CREATE TABLE Maps(
    maps_id INT PRIMARY KEY IDENTITY(1,1),
    maps_name NVARCHAR(MAX) NOT NULL,
);

CREATE TABLE Version(
    version_id INT PRIMARY KEY IDENTITY(1,1),
    version_name NVARCHAR(20) NOT NULL,
    version_date_create DATE NOT NULL
);

CREATE TABLE Tank(
    tank_id INT PRIMARY KEY IDENTITY(1,1),
    tank_name NVARCHAR(MAX) NOT NULL,
    tank_nation NVARCHAR(MAX) NOT NULL,
    tank_type NVARCHAR(MAX) NOT NULL,
    tank_tier INT NOT NULL,
    tank_version_id INT NOT NULL,
    FOREIGN KEY (tank_version_id) REFERENCES Version(version_id),
);

CREATE TABLE Battle(
    battle_id BIGINT PRIMARY KEY IDENTITY(1,1),
    battle_mode NVARCHAR NOT NULL,
    battle_date DATETIME NOT NULL,
    battle_lenght INT NOT NULL,
    battle_map_id INT NOT NULL,
    battle_version_id INT NOT NULL,
    FOREIGN KEY (battle_map_id) REFERENCES Maps(maps_id),
    FOREIGN KEY (battle_version_id) REFERENCES Version(version_id),
);

CREATE TABLE Result_Value(
    result_value_id INT PRIMARY KEY IDENTITY(1,1),
    result_value_value INT NOT NULL,
);

CREATE TABLE Result_Row(
    result_row_id INT PRIMARY KEY IDENTITY(1,1),
    result_row_name NVARCHAR(MAX) NOT NULL,
    result_row_value_id INT NOT NULL,
    FOREIGN KEY (result_row_value_id) REFERENCES Result_Value(result_value_id),
);

CREATE TABLE Participation(
    participation_id BIGINT PRIMARY KEY IDENTITY(1,1),
    participation_team TINYINT NOT NULL,
    participation_player_id BIGINT NOT NULL,
    participation_tank_id INT NOT NULL,
    participation_battle_id BIGINT NOT NULL,
    FOREIGN KEY (participation_player_id) REFERENCES Player(player_id),
    FOREIGN KEY (participation_tank_id) REFERENCES Tank(tank_id),
    FOREIGN KEY (participation_battle_id) REFERENCES Battle(battle_id),
);

CREATE TABLE Equipment_Usage(
--    equipment_usage_id BIGINT IDENTITY(1,1),
    equipment_usage_equipment_id INT,
    equipment_usage_participation_id BIGINT,
    equipment_usage_slot TINYINT NOT NULL,
    PRIMARY KEY(equipment_usage_equipment_id, equipment_usage_participation_id),
    FOREIGN KEY (equipment_usage_equipment_id) REFERENCES Equipment(equipment_id),
    FOREIGN KEY (equipment_usage_participation_id) REFERENCES Participation(participation_id),
);

CREATE TABLE Participation_Result_Row(
--    participation_result_row_id BIGINT NOT NULL,
    participation_result_row_participation_id BIGINT NOT NULL,
    participation_result_row_result_row_id INT NOT NULL,
    PRIMARY KEY(participation_result_row_participation_id, participation_result_row_result_row_id),
    FOREIGN KEY (participation_result_row_participation_id) REFERENCES Participation(participation_id),
    FOREIGN KEY (participation_result_row_result_row_id) REFERENCES Result_Row(result_row_id),
);
