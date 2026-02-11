-- Insert Players
INSERT INTO Player (id, name, date_of_creation) VALUES (1, 'franta_lala', '2023-02-01');
INSERT INTO Player (id, name, date_of_creation) VALUES (2, 'tankosaur', '2023-01-25');
INSERT INTO Player (id, name, date_of_creation) VALUES (3, 'noobkiller69', '2023-04-15');

-- Insert Versions
INSERT INTO Version (id, name, date_create) VALUES (1, '1.24', '2024-01-10');
INSERT INTO Version (id, name, date_create) VALUES (2, '1.25', '2024-03-15');
INSERT INTO Version (id, name, date_create) VALUES (3, '1.26', '2024-06-20');
INSERT INTO Version (id, name, date_create) VALUES (4, '1.27', '2024-09-05');

-- Insert Tank Types
INSERT INTO Tank_Type (id, name, description) VALUES (1, 'Standard', 'Regular tech tree tank');

-- Insert Tank Classes
INSERT INTO Tank_Class (id, name, description) VALUES (1, 'Medium', 'Medium tank'), (2, 'Heavy', 'Heavy tank');

-- Insert Tank Statuses
INSERT INTO Tank_Status (id, name, description) VALUES (1, 'Live', 'Available in game');

-- Insert Tanks
INSERT INTO Tank (id, name, nation, tier, description, tank_type_id, tank_class_id, tank_status_id)
VALUES (1, 'Obj. 430 II', 'RU', 9, 'Auto-generated tank', 
        1, 1, 1);
INSERT INTO Tank (id, name, nation, tier, description, tank_type_id, tank_class_id, tank_status_id)
VALUES (2, 'Skoda T 50', 'CZ', 9, 'Auto-generated tank', 
        1, 1, 1);
INSERT INTO Tank (id, name, nation, tier, description, tank_type_id, tank_class_id, tank_status_id)
VALUES (3, 'T-44', 'RU', 8, 'Auto-generated tank', 
        1, 1, 1);
INSERT INTO Tank (id, name, nation, tier, description, tank_type_id, tank_class_id, tank_status_id)
VALUES (4, 'T-32', 'USA', 8, 'Auto-generated tank', 
        1, 2, 1);
INSERT INTO Tank (id, name, nation, tier, description, tank_type_id, tank_class_id, tank_status_id)
VALUES (5, 'Obj. 277', 'RU', 10, 'Auto-generated tank', 
        1, 2, 1);

-- Insert Stat Categories
INSERT INTO Stat_Category (id, name) VALUES (1, 'Firepower');
INSERT INTO Stat_Category (id, name) VALUES (2, 'Survivability');
INSERT INTO Stat_Category (id, name) VALUES (3, 'Mobility');

-- Insert Stat Values and Stat Rows
INSERT INTO Stat_Value (id, value) VALUES (1, '3000');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (1, 'DPM', 1, 1);
INSERT INTO Stat_Value (id, value) VALUES (2, '2900');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (2, 'DPM', 1, 2);
INSERT INTO Stat_Value (id, value) VALUES (3, '2800');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (3, 'DPM', 1, 3);
INSERT INTO Stat_Value (id, value) VALUES (4, '2700');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (4, 'DPM', 1, 4);
INSERT INTO Stat_Value (id, value) VALUES (5, '60');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (5, 'Armor', 1, 5);
INSERT INTO Stat_Value (id, value) VALUES (6, '65');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (6, 'Armor', 1, 6);
INSERT INTO Stat_Value (id, value) VALUES (7, '70');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (7, 'Armor', 1, 7);
INSERT INTO Stat_Value (id, value) VALUES (8, '75');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (8, 'Armor', 1, 8);
INSERT INTO Stat_Value (id, value) VALUES (9, '55 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (9, 'Top speed', 1, 9);
INSERT INTO Stat_Value (id, value) VALUES (10, '60 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (10, 'Top speed', 1, 10);
INSERT INTO Stat_Value (id, value) VALUES (11, '65 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (11, 'Top speed', 1, 11);
INSERT INTO Stat_Value (id, value) VALUES (12, '70 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (12, 'Top speed', 1, 12);
INSERT INTO Stat_Value (id, value) VALUES (13, '3000');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (13, 'DPM', 2, 13);
INSERT INTO Stat_Value (id, value) VALUES (14, '2900');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (14, 'DPM', 2, 14);
INSERT INTO Stat_Value (id, value) VALUES (15, '2800');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (15, 'DPM', 2, 15);
INSERT INTO Stat_Value (id, value) VALUES (16, '2700');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (16, 'DPM', 2, 16);
INSERT INTO Stat_Value (id, value) VALUES (17, '60');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (17, 'Armor', 2, 17);
INSERT INTO Stat_Value (id, value) VALUES (18, '65');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (18, 'Armor', 2, 18);
INSERT INTO Stat_Value (id, value) VALUES (19, '70');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (19, 'Armor', 2, 19);
INSERT INTO Stat_Value (id, value) VALUES (20, '75');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (20, 'Armor', 2, 20);
INSERT INTO Stat_Value (id, value) VALUES (21, '55 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (21, 'Top speed', 2, 21);
INSERT INTO Stat_Value (id, value) VALUES (22, '60 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (22, 'Top speed', 2, 22);
INSERT INTO Stat_Value (id, value) VALUES (23, '65 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (23, 'Top speed', 2, 23);
INSERT INTO Stat_Value (id, value) VALUES (24, '70 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (24, 'Top speed', 2, 24);
INSERT INTO Stat_Value (id, value) VALUES (25, '3000');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (25, 'DPM', 3, 25);
INSERT INTO Stat_Value (id, value) VALUES (26, '2900');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (26, 'DPM', 3, 26);
INSERT INTO Stat_Value (id, value) VALUES (27, '2800');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (27, 'DPM', 3, 27);
INSERT INTO Stat_Value (id, value) VALUES (28, '2700');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (28, 'DPM', 3, 28);
INSERT INTO Stat_Value (id, value) VALUES (29, '60');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (29, 'Armor', 3, 29);
INSERT INTO Stat_Value (id, value) VALUES (30, '65');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (30, 'Armor', 3, 30);
INSERT INTO Stat_Value (id, value) VALUES (31, '70');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (31, 'Armor', 3, 31);
INSERT INTO Stat_Value (id, value) VALUES (32, '75');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (32, 'Armor', 3, 32);
INSERT INTO Stat_Value (id, value) VALUES (33, '55 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (33, 'Top speed', 3, 33);
INSERT INTO Stat_Value (id, value) VALUES (34, '60 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (34, 'Top speed', 3, 34);
INSERT INTO Stat_Value (id, value) VALUES (35, '65 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (35, 'Top speed', 3, 35);
INSERT INTO Stat_Value (id, value) VALUES (36, '70 km/h');
INSERT INTO Stat_Row (id, name, stat_category_id, stat_value_id) VALUES (36, 'Top speed', 3, 36);

-- Insert Tank_Stat
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 1, 1);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 1, 5);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 1, 9);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 1, 13);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 1, 17);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 1, 21);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 1, 25);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 1, 29);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 1, 33);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 2, 2);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 2, 6);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 2, 10);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 2, 14);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 2, 18);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 2, 22);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 2, 26);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 2, 30);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 2, 34);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 3, 3);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 3, 7);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 3, 11);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 3, 15);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 3, 19);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 3, 23);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 3, 27);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 3, 31);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 3, 35);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 4, 4);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 4, 8);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 4, 12);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 4, 16);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 4, 20);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 4, 24);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 4, 28);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 4, 32);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (1, 4, 36);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 1, 1);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 1, 5);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 1, 9);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 1, 13);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 1, 17);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 1, 21);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 1, 25);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 1, 29);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 1, 33);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 2, 2);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 2, 6);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 2, 10);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 2, 14);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 2, 18);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 2, 22);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 2, 26);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 2, 30);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 2, 34);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 3, 3);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 3, 7);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 3, 11);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 3, 15);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 3, 19);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 3, 23);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 3, 27);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 3, 31);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 3, 35);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 4, 4);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 4, 8);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 4, 12);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 4, 16);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 4, 20);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 4, 24);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 4, 28);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 4, 32);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (2, 4, 36);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 1, 1);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 1, 5);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 1, 9);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 1, 13);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 1, 17);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 1, 21);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 1, 25);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 1, 29);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 1, 33);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 2, 2);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 2, 6);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 2, 10);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 2, 14);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 2, 18);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 2, 22);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 2, 26);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 2, 30);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 2, 34);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 3, 3);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 3, 7);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 3, 11);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 3, 15);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 3, 19);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 3, 23);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 3, 27);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 3, 31);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 3, 35);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 4, 4);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 4, 8);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 4, 12);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 4, 16);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 4, 20);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 4, 24);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 4, 28);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 4, 32);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (3, 4, 36);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 1, 1);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 1, 5);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 1, 9);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 1, 13);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 1, 17);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 1, 21);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 1, 25);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 1, 29);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 1, 33);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 2, 2);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 2, 6);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 2, 10);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 2, 14);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 2, 18);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 2, 22);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 2, 26);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 2, 30);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 2, 34);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 3, 3);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 3, 7);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 3, 11);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 3, 15);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 3, 19);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 3, 23);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 3, 27);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 3, 31);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 3, 35);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 4, 4);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 4, 8);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 4, 12);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 4, 16);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 4, 20);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 4, 24);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 4, 28);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 4, 32);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (4, 4, 36);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 1, 1);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 1, 5);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 1, 9);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 1, 13);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 1, 17);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 1, 21);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 1, 25);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 1, 29);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 1, 33);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 2, 2);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 2, 6);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 2, 10);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 2, 14);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 2, 18);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 2, 22);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 2, 26);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 2, 30);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 2, 34);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 3, 3);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 3, 7);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 3, 11);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 3, 15);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 3, 19);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 3, 23);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 3, 27);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 3, 31);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 3, 35);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 4, 4);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 4, 8);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 4, 12);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 4, 16);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 4, 20);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 4, 24);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 4, 28);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 4, 32);
INSERT INTO Tank_Stat (tank_id, version_id, stat_row_id) VALUES (5, 4, 36);

-- Insert Battle Maps
INSERT INTO Battle_Map (id, name, description) VALUES (1, 'Himmelsdorf', 'City');
INSERT INTO Battle_Map (id, name, description) VALUES (2, 'Prokhorovka', 'Open area');
INSERT INTO Battle_Map (id, name, description) VALUES (3, 'Mines', 'Hills');

-- Insert Battle Types
INSERT INTO Battle_Type (id, name, description) VALUES (1, 'Standard', 'Standard battle type');
INSERT INTO Battle_Type (id, name, description) VALUES (2, 'Assult', 'Standard battle type');

-- Insert Battles
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (1, '2024-01-14', 0, 2826, 523, 871, 2, 1, 1, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (2, '2024-01-24', 0, 2862, 223, 622, 3, 1, 2, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (3, '2024-01-12', 0, 2991, 421, 324, 2, 1, 1, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (4, '2024-01-21', 0, 2956, 186, 288, 2, 1, 3, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (5, '2024-01-28', 0, 3096, 334, 152, 5, 1, 3, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (6, '2024-01-13', 1, 3069, 155, 943, 3, 1, 2, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (7, '2024-01-18', 0, 3062, 198, 338, 5, 1, 2, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (8, '2024-01-13', 1, 2919, 275, 156, 1, 1, 3, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (9, '2024-01-27', 1, 2852, 495, 974, 1, 1, 2, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (10, '2024-01-24', 1, 2907, 560, 510, 0, 1, 3, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (11, '2024-03-25', 1, 2829, 528, 647, 0, 1, 3, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (12, '2024-03-19', 1, 2559, 555, 395, 0, 1, 1, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (13, '2024-04-02', 0, 2906, 249, 725, 0, 1, 3, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (14, '2024-03-17', 1, 2835, 127, 93, 4, 1, 2, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (15, '2024-03-19', 1, 2559, 406, 970, 3, 1, 2, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (16, '2024-03-20', 1, 2582, 242, 66, 4, 1, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (17, '2024-03-19', 1, 2557, 423, 997, 5, 1, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (18, '2024-03-15', 0, 2825, 528, 489, 1, 1, 1, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (19, '2024-03-26', 1, 2612, 183, 743, 5, 1, 1, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (20, '2024-04-04', 1, 2943, 284, 779, 2, 1, 3, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (21, '2024-07-06', 0, 2729, 377, 188, 1, 1, 1, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (22, '2024-07-01', 0, 2563, 350, 427, 1, 1, 2, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (23, '2024-07-03', 1, 2429, 350, 530, 2, 1, 1, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (24, '2024-06-29', 0, 2584, 525, 773, 2, 1, 3, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (25, '2024-06-20', 1, 2709, 294, 201, 5, 1, 1, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (26, '2024-06-20', 0, 2767, 409, 843, 4, 1, 2, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (27, '2024-06-29', 1, 2564, 600, 240, 0, 1, 2, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (28, '2024-06-21', 1, 2418, 534, 308, 2, 1, 2, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (29, '2024-06-20', 1, 2624, 314, 841, 3, 1, 1, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (30, '2024-06-28', 0, 2413, 333, 660, 1, 1, 2, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (31, '2024-09-25', 1, 2318, 350, 922, 5, 1, 2, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (32, '2024-09-16', 1, 2522, 259, 436, 0, 1, 1, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (33, '2024-09-16', 0, 2287, 386, 144, 4, 1, 3, 1, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (34, '2024-09-07', 1, 2350, 420, 135, 0, 1, 2, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (35, '2024-09-08', 1, 2311, 214, 452, 3, 1, 1, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (36, '2024-09-10', 0, 2501, 423, 203, 3, 1, 3, 1, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (37, '2024-09-19', 1, 2629, 104, 497, 1, 1, 1, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (38, '2024-09-12', 0, 2599, 587, 534, 5, 1, 3, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (39, '2024-09-12', 1, 2472, 589, 137, 4, 1, 1, 1, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (40, '2024-09-14', 0, 2434, 519, 625, 5, 1, 1, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (41, '2024-01-11', 0, 2893, 407, 534, 2, 1, 1, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (42, '2024-01-28', 1, 2957, 300, 491, 0, 1, 3, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (43, '2024-01-23', 0, 2753, 545, 16, 4, 1, 2, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (44, '2024-01-12', 0, 3024, 216, 465, 1, 1, 3, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (45, '2024-01-17', 0, 2807, 393, 649, 5, 1, 3, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (46, '2024-01-10', 1, 2881, 273, 653, 5, 1, 3, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (47, '2024-01-17', 1, 2888, 439, 853, 3, 1, 2, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (48, '2024-01-13', 1, 2851, 231, 662, 2, 1, 3, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (49, '2024-01-22', 0, 2981, 468, 6, 2, 1, 3, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (50, '2024-01-16', 0, 3093, 451, 305, 3, 1, 2, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (51, '2024-03-22', 1, 2868, 303, 262, 1, 1, 1, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (52, '2024-04-01', 1, 2721, 294, 792, 4, 1, 2, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (53, '2024-03-31', 0, 2642, 406, 92, 0, 1, 1, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (54, '2024-03-20', 1, 2795, 401, 894, 4, 1, 3, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (55, '2024-03-15', 0, 2758, 286, 390, 5, 1, 3, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (56, '2024-03-20', 1, 2669, 551, 380, 2, 1, 3, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (57, '2024-04-03', 0, 2831, 279, 139, 4, 1, 2, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (58, '2024-03-19', 0, 2692, 262, 669, 0, 1, 2, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (59, '2024-04-01', 0, 2636, 526, 726, 0, 1, 1, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (60, '2024-03-30', 1, 2912, 323, 771, 0, 1, 3, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (61, '2024-07-03', 0, 2695, 123, 984, 3, 1, 3, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (62, '2024-06-20', 1, 2741, 591, 229, 2, 1, 3, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (63, '2024-06-29', 1, 2507, 172, 996, 5, 1, 2, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (64, '2024-06-26', 0, 2698, 361, 248, 0, 1, 1, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (65, '2024-07-09', 0, 2419, 288, 409, 3, 1, 3, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (66, '2024-07-10', 0, 2408, 415, 943, 5, 1, 2, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (67, '2024-07-05', 1, 2445, 309, 747, 4, 1, 1, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (68, '2024-06-21', 1, 2499, 505, 718, 2, 1, 2, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (69, '2024-06-28', 1, 2402, 476, 541, 5, 1, 3, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (70, '2024-07-08', 1, 2535, 436, 855, 3, 1, 2, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (71, '2024-09-24', 1, 2391, 355, 415, 0, 1, 2, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (72, '2024-09-20', 1, 2561, 595, 763, 2, 1, 3, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (73, '2024-09-18', 1, 2515, 138, 270, 5, 1, 3, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (74, '2024-09-06', 1, 2286, 474, 875, 5, 1, 2, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (75, '2024-09-25', 0, 2569, 142, 158, 4, 1, 1, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (76, '2024-09-10', 1, 2577, 519, 226, 4, 1, 1, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (77, '2024-09-07', 0, 2283, 365, 121, 0, 1, 1, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (78, '2024-09-25', 0, 2317, 375, 508, 4, 1, 2, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (79, '2024-09-08', 1, 2551, 485, 822, 4, 1, 2, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (80, '2024-09-05', 1, 2298, 137, 516, 3, 1, 2, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (81, '2024-01-11', 1, 2978, 166, 652, 0, 1, 2, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (82, '2024-01-13', 1, 2706, 595, 880, 5, 1, 2, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (83, '2024-01-25', 1, 2902, 500, 831, 2, 1, 3, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (84, '2024-01-26', 1, 2975, 545, 593, 5, 1, 1, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (85, '2024-01-21', 0, 2803, 167, 839, 5, 1, 2, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (86, '2024-01-22', 1, 2658, 579, 765, 3, 1, 1, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (87, '2024-01-25', 1, 2687, 392, 942, 3, 1, 2, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (88, '2024-01-26', 0, 2618, 500, 670, 0, 1, 1, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (89, '2024-01-16', 1, 2731, 392, 146, 5, 1, 2, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (90, '2024-01-12', 0, 2882, 232, 900, 3, 1, 3, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (91, '2024-03-30', 0, 2834, 325, 335, 2, 1, 2, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (92, '2024-03-27', 1, 2794, 477, 216, 4, 1, 1, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (93, '2024-03-15', 0, 2564, 301, 71, 5, 1, 3, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (94, '2024-04-01', 1, 2541, 278, 538, 5, 1, 2, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (95, '2024-03-26', 1, 2640, 108, 583, 4, 1, 1, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (96, '2024-03-18', 0, 2520, 129, 936, 3, 1, 1, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (97, '2024-03-21', 0, 2476, 351, 609, 2, 1, 1, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (98, '2024-03-25', 0, 2625, 307, 881, 1, 1, 1, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (99, '2024-03-15', 1, 2611, 171, 426, 4, 1, 1, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (100, '2024-03-26', 1, 2561, 478, 46, 4, 1, 1, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (101, '2024-07-07', 1, 2347, 252, 170, 1, 1, 3, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (102, '2024-06-29', 1, 2677, 449, 12, 5, 1, 2, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (103, '2024-07-09', 1, 2637, 374, 763, 0, 1, 3, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (104, '2024-07-06', 1, 2565, 334, 50, 4, 1, 3, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (105, '2024-06-28', 0, 2700, 314, 776, 1, 1, 2, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (106, '2024-07-03', 1, 2685, 320, 985, 3, 1, 1, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (107, '2024-06-25', 0, 2623, 195, 324, 2, 1, 3, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (108, '2024-06-24', 0, 2637, 530, 374, 1, 1, 3, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (109, '2024-06-30', 1, 2450, 518, 825, 1, 1, 2, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (110, '2024-07-06', 0, 2332, 386, 326, 1, 1, 1, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (111, '2024-09-10', 0, 2264, 102, 924, 5, 1, 2, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (112, '2024-09-19', 0, 2307, 346, 165, 5, 1, 3, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (113, '2024-09-16', 1, 2221, 525, 323, 0, 1, 1, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (114, '2024-09-16', 0, 2233, 498, 183, 3, 1, 1, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (115, '2024-09-25', 1, 2541, 358, 560, 3, 1, 3, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (116, '2024-09-24', 1, 2481, 407, 985, 4, 1, 3, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (117, '2024-09-10', 1, 2355, 536, 81, 2, 1, 1, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (118, '2024-09-14', 1, 2439, 309, 825, 5, 1, 3, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (119, '2024-09-10', 1, 2421, 188, 345, 2, 1, 2, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (120, '2024-09-25', 0, 2443, 209, 732, 4, 1, 1, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (121, '2024-01-11', 0, 2755, 117, 792, 2, 1, 2, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (122, '2024-01-27', 1, 2684, 585, 935, 2, 1, 3, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (123, '2024-01-12', 1, 2952, 568, 105, 1, 1, 1, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (124, '2024-01-30', 1, 2905, 133, 948, 4, 1, 1, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (125, '2024-01-16', 1, 2971, 459, 204, 3, 1, 2, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (126, '2024-01-21', 0, 2967, 395, 85, 5, 1, 1, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (127, '2024-01-18', 1, 2819, 482, 559, 0, 1, 3, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (128, '2024-01-26', 1, 2993, 545, 359, 1, 1, 2, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (129, '2024-01-19', 1, 2706, 592, 338, 4, 1, 2, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (130, '2024-01-23', 1, 2733, 502, 48, 3, 1, 3, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (131, '2024-03-28', 0, 2699, 324, 33, 3, 1, 2, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (132, '2024-03-22', 0, 2557, 587, 207, 3, 1, 2, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (133, '2024-04-02', 0, 2719, 252, 241, 0, 1, 2, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (134, '2024-04-03', 0, 2817, 134, 586, 0, 1, 3, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (135, '2024-03-31', 1, 2718, 551, 544, 3, 1, 1, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (136, '2024-03-18', 0, 2774, 309, 630, 2, 1, 3, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (137, '2024-04-03', 0, 2595, 566, 20, 3, 1, 3, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (138, '2024-03-25', 0, 2674, 234, 505, 2, 1, 1, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (139, '2024-04-03', 0, 2763, 267, 664, 2, 1, 1, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (140, '2024-03-15', 0, 2773, 117, 525, 5, 1, 1, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (141, '2024-06-21', 1, 2316, 472, 440, 5, 1, 3, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (142, '2024-07-01', 1, 2437, 448, 738, 3, 1, 1, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (143, '2024-07-08', 1, 2349, 348, 610, 4, 1, 1, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (144, '2024-06-26', 0, 2618, 475, 880, 5, 1, 2, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (145, '2024-07-05', 1, 2410, 313, 259, 0, 1, 2, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (146, '2024-06-30', 0, 2630, 191, 208, 1, 1, 3, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (147, '2024-07-05', 1, 2506, 385, 764, 0, 1, 3, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (148, '2024-07-04', 0, 2613, 473, 5, 3, 1, 2, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (149, '2024-07-05', 1, 2476, 104, 698, 1, 1, 1, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (150, '2024-06-23', 1, 2495, 138, 930, 5, 1, 3, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (151, '2024-09-11', 1, 2514, 246, 972, 1, 1, 2, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (152, '2024-09-18', 1, 2462, 485, 667, 1, 1, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (153, '2024-09-12', 0, 2479, 106, 784, 4, 1, 3, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (154, '2024-09-14', 0, 2348, 181, 990, 0, 1, 3, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (155, '2024-09-12', 0, 2177, 264, 96, 3, 1, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (156, '2024-09-07', 0, 2163, 481, 547, 5, 1, 3, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (157, '2024-09-12', 0, 2250, 268, 622, 1, 1, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (158, '2024-09-15', 0, 2167, 387, 380, 4, 1, 1, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (159, '2024-09-09', 0, 2223, 201, 268, 3, 1, 3, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (160, '2024-09-15', 0, 2460, 591, 216, 0, 1, 1, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (161, '2024-01-13', 1, 2922, 323, 54, 1, 1, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (162, '2024-01-20', 1, 2817, 273, 104, 4, 1, 3, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (163, '2024-01-11', 1, 3169, 597, 846, 4, 1, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (164, '2024-01-11', 0, 2920, 230, 423, 0, 1, 2, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (165, '2024-01-12', 0, 2975, 385, 941, 0, 1, 3, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (166, '2024-01-16', 0, 2963, 204, 203, 2, 1, 2, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (167, '2024-01-22', 0, 2982, 524, 97, 2, 1, 3, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (168, '2024-01-12', 0, 3124, 411, 144, 1, 1, 2, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (169, '2024-01-17', 1, 2911, 268, 534, 1, 1, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (170, '2024-01-19', 0, 2945, 125, 358, 5, 1, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (171, '2024-03-15', 1, 2871, 414, 697, 4, 1, 2, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (172, '2024-03-30', 0, 3032, 462, 179, 5, 1, 1, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (173, '2024-03-24', 1, 2872, 162, 45, 1, 1, 3, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (174, '2024-03-20', 0, 2713, 507, 604, 0, 1, 2, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (175, '2024-03-26', 1, 2749, 543, 214, 1, 1, 3, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (176, '2024-04-04', 1, 3048, 188, 915, 5, 1, 1, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (177, '2024-03-24', 1, 2793, 543, 540, 3, 1, 2, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (178, '2024-03-22', 1, 2859, 103, 295, 5, 1, 3, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (179, '2024-03-15', 0, 2758, 390, 720, 5, 1, 3, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (180, '2024-03-28', 0, 2840, 534, 564, 4, 1, 1, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (181, '2024-06-29', 0, 2738, 304, 92, 2, 1, 1, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (182, '2024-06-20', 1, 2801, 343, 994, 2, 1, 3, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (183, '2024-07-03', 1, 2849, 581, 538, 4, 1, 1, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (184, '2024-06-26', 1, 2779, 325, 652, 1, 1, 1, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (185, '2024-07-09', 1, 2742, 499, 669, 1, 1, 3, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (186, '2024-06-25', 1, 2653, 165, 663, 0, 1, 3, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (187, '2024-06-22', 1, 2768, 576, 422, 0, 1, 2, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (188, '2024-06-26', 1, 2759, 422, 595, 4, 1, 3, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (189, '2024-07-05', 0, 2708, 529, 174, 3, 1, 2, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (190, '2024-06-28', 1, 2764, 101, 144, 3, 1, 1, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (191, '2024-09-07', 0, 2411, 279, 443, 0, 1, 2, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (192, '2024-09-15', 1, 2403, 518, 980, 1, 1, 3, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (193, '2024-09-08', 0, 2613, 500, 551, 3, 1, 1, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (194, '2024-09-22', 0, 2726, 119, 243, 3, 1, 1, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (195, '2024-09-21', 1, 2512, 285, 688, 0, 1, 3, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (196, '2024-09-24', 0, 2705, 292, 617, 1, 1, 2, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (197, '2024-09-05', 1, 2728, 393, 411, 1, 1, 1, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (198, '2024-09-19', 0, 2613, 169, 272, 5, 1, 3, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (199, '2024-09-16', 1, 2418, 101, 459, 1, 1, 1, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (200, '2024-09-10', 1, 2517, 580, 4, 2, 1, 2, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (201, '2024-01-18', 1, 2873, 514, 121, 5, 2, 2, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (202, '2024-01-12', 1, 2892, 286, 61, 2, 2, 2, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (203, '2024-01-10', 0, 2947, 593, 877, 4, 2, 3, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (204, '2024-01-20', 0, 2797, 478, 815, 5, 2, 1, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (205, '2024-01-27', 1, 2828, 444, 597, 1, 2, 3, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (206, '2024-01-22', 0, 2785, 276, 432, 3, 2, 1, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (207, '2024-01-15', 0, 3004, 402, 624, 5, 2, 3, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (208, '2024-01-27', 1, 3083, 376, 516, 4, 2, 2, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (209, '2024-01-17', 1, 2931, 210, 755, 4, 2, 3, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (210, '2024-01-29', 0, 2890, 555, 713, 0, 2, 3, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (211, '2024-03-19', 1, 2785, 441, 974, 0, 2, 1, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (212, '2024-03-17', 1, 2656, 450, 629, 5, 2, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (213, '2024-03-28', 0, 2858, 396, 859, 3, 2, 1, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (214, '2024-04-01', 1, 2557, 372, 453, 1, 2, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (215, '2024-04-01', 0, 2773, 387, 987, 3, 2, 1, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (216, '2024-03-19', 0, 2950, 104, 385, 2, 2, 2, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (217, '2024-03-24', 0, 2922, 240, 315, 1, 2, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (218, '2024-03-28', 0, 2802, 364, 221, 5, 2, 3, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (219, '2024-03-29', 0, 2941, 173, 572, 4, 2, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (220, '2024-04-04', 1, 2611, 326, 866, 2, 2, 3, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (221, '2024-07-07', 1, 2777, 104, 228, 3, 2, 3, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (222, '2024-06-30', 0, 2715, 336, 2, 1, 2, 1, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (223, '2024-06-28', 0, 2640, 576, 242, 0, 2, 2, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (224, '2024-06-22', 0, 2758, 308, 907, 4, 2, 2, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (225, '2024-06-22', 0, 2721, 464, 819, 1, 2, 1, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (226, '2024-07-09', 1, 2518, 193, 153, 2, 2, 3, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (227, '2024-06-29', 0, 2433, 545, 284, 4, 2, 3, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (228, '2024-07-09', 1, 2748, 272, 649, 1, 2, 3, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (229, '2024-07-01', 0, 2775, 426, 310, 1, 2, 3, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (230, '2024-06-27', 1, 2630, 275, 65, 0, 2, 1, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (231, '2024-09-20', 1, 2283, 499, 187, 3, 2, 2, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (232, '2024-09-08', 0, 2325, 327, 650, 4, 2, 2, 1, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (233, '2024-09-21', 0, 2504, 204, 120, 1, 2, 1, 1, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (234, '2024-09-08', 1, 2570, 214, 209, 4, 2, 3, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (235, '2024-09-24', 1, 2353, 311, 132, 2, 2, 3, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (236, '2024-09-24', 0, 2423, 326, 732, 0, 2, 1, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (237, '2024-09-05', 1, 2425, 166, 203, 1, 2, 1, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (238, '2024-09-12', 1, 2631, 187, 151, 5, 2, 2, 1, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (239, '2024-09-16', 0, 2496, 401, 829, 3, 2, 3, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (240, '2024-09-18', 1, 2533, 523, 844, 2, 2, 3, 1, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (241, '2024-01-10', 1, 2895, 213, 373, 2, 2, 3, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (242, '2024-01-17', 1, 2845, 142, 358, 3, 2, 2, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (243, '2024-01-26', 0, 3084, 448, 946, 0, 2, 3, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (244, '2024-01-20', 1, 3065, 246, 940, 5, 2, 2, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (245, '2024-01-26', 1, 3018, 477, 195, 5, 2, 2, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (246, '2024-01-12', 0, 2836, 189, 896, 1, 2, 1, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (247, '2024-01-20', 1, 2963, 478, 976, 4, 2, 2, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (248, '2024-01-21', 1, 2876, 409, 954, 5, 2, 2, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (249, '2024-01-27', 0, 2717, 250, 986, 0, 2, 3, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (250, '2024-01-12', 0, 2728, 556, 572, 5, 2, 1, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (251, '2024-03-17', 1, 2701, 147, 195, 4, 2, 1, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (252, '2024-03-20', 0, 2808, 457, 184, 3, 2, 3, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (253, '2024-03-21', 1, 2888, 447, 467, 5, 2, 1, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (254, '2024-04-02', 1, 2880, 491, 466, 5, 2, 2, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (255, '2024-04-02', 1, 2818, 443, 117, 2, 2, 2, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (256, '2024-04-03', 0, 2860, 509, 320, 4, 2, 1, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (257, '2024-04-02', 1, 2609, 420, 46, 2, 2, 1, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (258, '2024-03-15', 1, 2603, 321, 294, 4, 2, 2, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (259, '2024-03-29', 1, 2631, 427, 904, 3, 2, 1, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (260, '2024-03-23', 1, 2681, 501, 121, 1, 2, 1, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (261, '2024-07-03', 1, 2630, 361, 339, 5, 2, 3, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (262, '2024-06-23', 0, 2508, 467, 179, 3, 2, 3, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (263, '2024-06-27', 1, 2597, 514, 11, 1, 2, 1, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (264, '2024-06-24', 0, 2784, 515, 764, 1, 2, 2, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (265, '2024-07-07', 0, 2755, 513, 935, 2, 2, 1, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (266, '2024-07-08', 0, 2719, 116, 97, 1, 2, 1, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (267, '2024-07-01', 1, 2425, 373, 254, 3, 2, 1, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (268, '2024-06-27', 1, 2602, 231, 687, 2, 2, 2, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (269, '2024-07-02', 1, 2705, 424, 328, 5, 2, 2, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (270, '2024-06-24', 1, 2441, 450, 436, 1, 2, 3, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (271, '2024-09-19', 1, 2346, 589, 84, 2, 2, 1, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (272, '2024-09-21', 0, 2621, 406, 723, 1, 2, 3, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (273, '2024-09-23', 1, 2422, 142, 702, 5, 2, 1, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (274, '2024-09-14', 0, 2544, 452, 890, 3, 2, 1, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (275, '2024-09-18', 0, 2594, 553, 218, 4, 2, 3, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (276, '2024-09-06', 0, 2605, 119, 993, 2, 2, 1, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (277, '2024-09-24', 1, 2615, 169, 664, 4, 2, 1, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (278, '2024-09-17', 1, 2289, 238, 457, 4, 2, 1, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (279, '2024-09-18', 1, 2387, 587, 263, 1, 2, 3, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (280, '2024-09-12', 1, 2524, 331, 795, 5, 2, 1, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (281, '2024-01-20', 0, 2733, 351, 550, 3, 2, 1, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (282, '2024-01-17', 0, 2733, 102, 549, 5, 2, 3, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (283, '2024-01-20', 0, 2992, 565, 457, 2, 2, 3, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (284, '2024-01-11', 1, 2712, 373, 96, 5, 2, 3, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (285, '2024-01-29', 1, 2809, 296, 830, 2, 2, 2, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (286, '2024-01-16', 1, 2811, 375, 35, 0, 2, 1, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (287, '2024-01-10', 1, 2685, 470, 159, 0, 2, 3, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (288, '2024-01-21', 1, 2685, 331, 758, 3, 2, 2, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (289, '2024-01-13', 0, 2617, 533, 349, 2, 2, 2, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (290, '2024-01-25', 0, 2642, 405, 669, 3, 2, 2, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (291, '2024-03-25', 0, 2545, 544, 306, 0, 2, 2, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (292, '2024-04-01', 0, 2454, 403, 557, 3, 2, 1, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (293, '2024-03-22', 1, 2515, 558, 647, 5, 2, 1, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (294, '2024-04-01', 0, 2840, 540, 83, 1, 2, 3, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (295, '2024-03-29', 0, 2463, 548, 74, 1, 2, 3, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (296, '2024-03-27', 1, 2515, 262, 777, 2, 2, 2, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (297, '2024-03-18', 1, 2494, 560, 767, 3, 2, 3, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (298, '2024-03-25', 0, 2648, 150, 366, 2, 2, 3, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (299, '2024-03-26', 1, 2740, 335, 440, 5, 2, 2, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (300, '2024-03-24', 0, 2494, 541, 931, 2, 2, 3, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (301, '2024-06-29', 1, 2464, 323, 112, 4, 2, 2, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (302, '2024-06-25', 0, 2536, 464, 898, 0, 2, 2, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (303, '2024-06-26', 1, 2437, 371, 490, 2, 2, 3, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (304, '2024-06-24', 0, 2654, 303, 537, 2, 2, 1, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (305, '2024-07-06', 1, 2565, 483, 973, 3, 2, 3, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (306, '2024-07-06', 1, 2483, 325, 558, 2, 2, 2, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (307, '2024-06-20', 0, 2681, 557, 655, 1, 2, 3, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (308, '2024-06-26', 1, 2551, 307, 275, 1, 2, 1, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (309, '2024-07-02', 0, 2675, 301, 210, 3, 2, 3, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (310, '2024-06-28', 1, 2639, 470, 457, 3, 2, 3, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (311, '2024-09-13', 1, 2518, 367, 461, 5, 2, 3, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (312, '2024-09-10', 0, 2538, 421, 32, 3, 2, 1, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (313, '2024-09-14', 1, 2457, 170, 785, 1, 2, 1, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (314, '2024-09-15', 0, 2216, 100, 478, 0, 2, 1, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (315, '2024-09-24', 1, 2410, 444, 16, 2, 2, 3, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (316, '2024-09-07', 1, 2232, 473, 987, 2, 2, 1, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (317, '2024-09-12', 1, 2224, 467, 934, 2, 2, 2, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (318, '2024-09-11', 1, 2214, 552, 608, 5, 2, 1, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (319, '2024-09-08', 0, 2251, 458, 666, 1, 2, 3, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (320, '2024-09-13', 1, 2322, 445, 28, 2, 2, 1, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (321, '2024-01-12', 0, 2858, 390, 579, 2, 2, 2, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (322, '2024-01-21', 0, 2726, 148, 667, 2, 2, 1, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (323, '2024-01-29', 1, 2781, 178, 60, 5, 2, 3, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (324, '2024-01-11', 1, 2992, 469, 708, 1, 2, 2, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (325, '2024-01-19', 0, 2718, 462, 193, 4, 2, 3, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (326, '2024-01-29', 1, 2784, 237, 501, 3, 2, 2, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (327, '2024-01-29', 0, 2737, 461, 861, 5, 2, 3, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (328, '2024-01-23', 1, 2867, 552, 55, 5, 2, 1, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (329, '2024-01-30', 1, 2755, 297, 961, 3, 2, 1, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (330, '2024-01-16', 1, 2734, 417, 534, 1, 2, 3, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (331, '2024-03-22', 0, 2487, 403, 638, 0, 2, 3, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (332, '2024-03-24', 0, 2723, 509, 241, 1, 2, 3, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (333, '2024-03-25', 1, 2583, 134, 507, 0, 2, 3, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (334, '2024-04-04', 0, 2621, 576, 415, 4, 2, 1, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (335, '2024-03-16', 0, 2453, 291, 283, 4, 2, 1, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (336, '2024-03-15', 0, 2457, 399, 162, 5, 2, 2, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (337, '2024-03-17', 0, 2616, 362, 306, 5, 2, 1, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (338, '2024-03-18', 0, 2774, 497, 454, 5, 2, 1, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (339, '2024-03-26', 1, 2480, 586, 818, 0, 2, 3, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (340, '2024-03-16', 0, 2552, 568, 296, 1, 2, 1, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (341, '2024-06-30', 1, 2579, 452, 249, 3, 2, 2, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (342, '2024-07-04', 1, 2494, 404, 823, 1, 2, 2, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (343, '2024-06-26', 1, 2437, 465, 741, 5, 2, 1, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (344, '2024-07-03', 0, 2537, 348, 467, 3, 2, 3, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (345, '2024-06-28', 1, 2337, 418, 236, 4, 2, 3, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (346, '2024-06-27', 0, 2444, 389, 882, 0, 2, 2, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (347, '2024-06-20', 1, 2372, 227, 935, 0, 2, 3, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (348, '2024-06-22', 0, 2609, 113, 66, 5, 2, 2, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (349, '2024-07-10', 0, 2442, 557, 985, 2, 2, 1, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (350, '2024-07-08', 1, 2589, 178, 984, 3, 2, 2, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (351, '2024-09-07', 1, 2378, 287, 184, 0, 2, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (352, '2024-09-23', 1, 2367, 483, 400, 2, 2, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (353, '2024-09-16', 1, 2165, 365, 958, 4, 2, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (354, '2024-09-16', 1, 2544, 315, 618, 2, 2, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (355, '2024-09-19', 1, 2267, 247, 604, 2, 2, 3, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (356, '2024-09-08', 1, 2245, 368, 451, 3, 2, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (357, '2024-09-15', 0, 2500, 304, 911, 5, 2, 1, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (358, '2024-09-08', 0, 2504, 302, 685, 4, 2, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (359, '2024-09-08', 1, 2349, 312, 859, 4, 2, 2, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (360, '2024-09-24', 0, 2332, 436, 425, 5, 2, 2, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (361, '2024-01-28', 1, 3139, 317, 561, 3, 2, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (362, '2024-01-26', 1, 2995, 567, 963, 2, 2, 3, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (363, '2024-01-17', 1, 3121, 212, 633, 0, 2, 2, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (364, '2024-01-18', 1, 3001, 364, 600, 5, 2, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (365, '2024-01-16', 0, 3071, 216, 781, 1, 2, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (366, '2024-01-10', 1, 2805, 251, 710, 0, 2, 3, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (367, '2024-01-12', 0, 3022, 583, 766, 2, 2, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (368, '2024-01-17', 1, 3067, 275, 756, 3, 2, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (369, '2024-01-27', 1, 2801, 454, 80, 2, 2, 1, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (370, '2024-01-29', 1, 3084, 302, 168, 3, 2, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (371, '2024-04-02', 1, 2939, 157, 594, 5, 2, 1, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (372, '2024-04-01', 0, 2769, 519, 915, 2, 2, 3, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (373, '2024-03-21', 1, 2743, 525, 220, 2, 2, 1, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (374, '2024-03-28', 1, 3038, 281, 540, 5, 2, 1, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (375, '2024-04-04', 0, 2679, 185, 720, 5, 2, 1, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (376, '2024-04-01', 1, 2885, 455, 610, 2, 2, 2, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (377, '2024-03-20', 1, 2836, 396, 431, 0, 2, 2, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (378, '2024-04-02', 1, 2771, 590, 790, 3, 2, 2, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (379, '2024-04-03', 0, 2793, 581, 234, 0, 2, 2, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (380, '2024-03-31', 0, 2950, 402, 553, 3, 2, 1, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (381, '2024-07-08', 0, 2705, 217, 346, 2, 2, 1, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (382, '2024-07-05', 0, 2657, 258, 201, 3, 2, 1, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (383, '2024-07-10', 1, 2671, 513, 871, 0, 2, 2, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (384, '2024-07-08', 0, 2667, 185, 651, 2, 2, 1, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (385, '2024-06-26', 0, 2645, 104, 615, 5, 2, 1, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (386, '2024-07-01', 0, 2845, 353, 916, 4, 2, 1, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (387, '2024-07-02', 1, 2532, 598, 375, 0, 2, 3, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (388, '2024-07-07', 1, 2754, 490, 856, 1, 2, 2, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (389, '2024-07-09', 1, 2802, 169, 747, 1, 2, 3, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (390, '2024-07-08', 1, 2653, 473, 318, 0, 2, 3, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (391, '2024-09-17', 0, 2411, 120, 913, 5, 2, 2, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (392, '2024-09-08', 0, 2730, 160, 227, 4, 2, 1, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (393, '2024-09-19', 0, 2679, 226, 340, 2, 2, 1, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (394, '2024-09-24', 0, 2423, 121, 779, 2, 2, 3, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (395, '2024-09-22', 0, 2743, 108, 453, 3, 2, 1, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (396, '2024-09-09', 0, 2565, 338, 376, 1, 2, 3, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (397, '2024-09-09', 0, 2399, 225, 514, 5, 2, 2, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (398, '2024-09-15', 1, 2724, 399, 499, 1, 2, 3, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (399, '2024-09-18', 0, 2416, 332, 506, 4, 2, 1, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (400, '2024-09-05', 1, 2431, 554, 904, 0, 2, 2, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (401, '2024-01-12', 0, 2861, 469, 222, 0, 3, 2, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (402, '2024-01-30', 0, 2952, 370, 533, 1, 3, 1, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (403, '2024-01-26', 1, 2700, 488, 147, 2, 3, 1, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (404, '2024-01-27', 0, 3055, 284, 650, 0, 3, 1, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (405, '2024-01-10', 1, 3092, 334, 978, 5, 3, 1, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (406, '2024-01-29', 0, 2706, 467, 665, 2, 3, 1, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (407, '2024-01-25', 0, 2776, 513, 225, 5, 3, 3, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (408, '2024-01-16', 0, 2995, 220, 701, 2, 3, 2, 2, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (409, '2024-01-10', 1, 3075, 464, 867, 3, 3, 3, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (410, '2024-01-22', 1, 2966, 154, 17, 4, 3, 3, 1, 1, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (411, '2024-03-19', 0, 2724, 213, 981, 2, 3, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (412, '2024-03-21', 0, 2857, 159, 268, 5, 3, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (413, '2024-03-27', 1, 2643, 500, 731, 1, 3, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (414, '2024-03-30', 0, 2733, 323, 137, 0, 3, 3, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (415, '2024-03-29', 0, 2854, 560, 853, 5, 3, 2, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (416, '2024-03-22', 1, 2856, 485, 972, 4, 3, 3, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (417, '2024-03-15', 1, 2692, 392, 583, 4, 3, 2, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (418, '2024-03-30', 1, 2742, 237, 641, 0, 3, 1, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (419, '2024-03-28', 1, 2693, 248, 388, 5, 3, 2, 1, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (420, '2024-03-24', 1, 2852, 272, 9, 4, 3, 2, 2, 2, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (421, '2024-07-08', 1, 2592, 124, 675, 1, 3, 3, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (422, '2024-07-06', 0, 2685, 494, 540, 5, 3, 2, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (423, '2024-07-02', 0, 2541, 577, 538, 5, 3, 1, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (424, '2024-06-21', 0, 2642, 555, 255, 2, 3, 1, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (425, '2024-07-03', 1, 2471, 112, 402, 3, 3, 1, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (426, '2024-07-05', 1, 2404, 586, 487, 4, 3, 2, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (427, '2024-07-10', 0, 2536, 500, 741, 3, 3, 1, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (428, '2024-07-02', 0, 2792, 556, 303, 0, 3, 1, 2, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (429, '2024-06-23', 0, 2610, 413, 235, 0, 3, 3, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (430, '2024-06-26', 1, 2517, 480, 615, 3, 3, 3, 1, 3, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (431, '2024-09-11', 1, 2420, 388, 975, 0, 3, 3, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (432, '2024-09-24', 1, 2358, 350, 502, 2, 3, 3, 1, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (433, '2024-09-24', 1, 2564, 417, 498, 2, 3, 1, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (434, '2024-09-12', 0, 2628, 331, 618, 0, 3, 2, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (435, '2024-09-14', 1, 2610, 282, 908, 4, 3, 3, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (436, '2024-09-10', 1, 2592, 314, 757, 4, 3, 2, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (437, '2024-09-22', 1, 2259, 490, 861, 0, 3, 3, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (438, '2024-09-12', 1, 2620, 540, 567, 4, 3, 3, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (439, '2024-09-13', 1, 2475, 541, 764, 4, 3, 2, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (440, '2024-09-20', 0, 2523, 204, 861, 4, 3, 1, 2, 4, 1);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (441, '2024-01-27', 0, 2946, 402, 870, 1, 3, 3, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (442, '2024-01-27', 1, 3078, 170, 531, 2, 3, 3, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (443, '2024-01-29', 1, 2885, 567, 154, 3, 3, 2, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (444, '2024-01-15', 1, 2981, 129, 308, 1, 3, 2, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (445, '2024-01-13', 1, 2953, 592, 670, 1, 3, 3, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (446, '2024-01-10', 0, 3050, 369, 16, 3, 3, 1, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (447, '2024-01-27', 0, 3088, 327, 472, 0, 3, 3, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (448, '2024-01-16', 0, 3086, 350, 546, 3, 3, 1, 1, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (449, '2024-01-11', 1, 2911, 165, 368, 5, 3, 1, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (450, '2024-01-26', 1, 3011, 574, 562, 5, 3, 3, 2, 1, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (451, '2024-03-18', 0, 2701, 114, 558, 5, 3, 2, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (452, '2024-03-28', 1, 2770, 494, 608, 3, 3, 1, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (453, '2024-03-26', 0, 2731, 486, 909, 5, 3, 1, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (454, '2024-03-18', 1, 2798, 334, 469, 5, 3, 1, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (455, '2024-03-19', 1, 2902, 109, 551, 3, 3, 1, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (456, '2024-03-17', 0, 2814, 343, 941, 3, 3, 3, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (457, '2024-04-03', 1, 2804, 571, 545, 5, 3, 1, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (458, '2024-03-16', 0, 2898, 343, 521, 1, 3, 1, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (459, '2024-04-01', 0, 2599, 126, 393, 0, 3, 1, 2, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (460, '2024-03-23', 0, 2839, 536, 642, 2, 3, 2, 1, 2, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (461, '2024-06-28', 0, 2452, 424, 487, 4, 3, 2, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (462, '2024-07-06', 0, 2639, 390, 803, 5, 3, 2, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (463, '2024-06-26', 1, 2420, 382, 297, 4, 3, 1, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (464, '2024-07-10', 0, 2532, 198, 526, 2, 3, 1, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (465, '2024-07-06', 0, 2785, 370, 898, 0, 3, 2, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (466, '2024-06-23', 1, 2643, 133, 434, 5, 3, 3, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (467, '2024-07-10', 0, 2706, 499, 380, 4, 3, 3, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (468, '2024-06-30', 1, 2421, 550, 248, 5, 3, 2, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (469, '2024-06-22', 1, 2716, 380, 936, 5, 3, 2, 1, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (470, '2024-06-21', 1, 2777, 227, 115, 1, 3, 3, 2, 3, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (471, '2024-09-11', 1, 2547, 125, 591, 5, 3, 2, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (472, '2024-09-20', 1, 2483, 545, 270, 2, 3, 3, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (473, '2024-09-14', 0, 2579, 134, 818, 4, 3, 2, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (474, '2024-09-23', 1, 2536, 369, 276, 0, 3, 1, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (475, '2024-09-22', 1, 2447, 569, 559, 2, 3, 2, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (476, '2024-09-15', 1, 2525, 580, 134, 2, 3, 2, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (477, '2024-09-16', 0, 2270, 294, 453, 1, 3, 2, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (478, '2024-09-15', 0, 2643, 430, 355, 2, 3, 3, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (479, '2024-09-06', 1, 2275, 156, 570, 4, 3, 1, 1, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (480, '2024-09-11', 1, 2301, 345, 614, 4, 3, 3, 2, 4, 2);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (481, '2024-01-30', 1, 2835, 402, 33, 2, 3, 3, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (482, '2024-01-22', 1, 2890, 335, 16, 2, 3, 1, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (483, '2024-01-23', 0, 2928, 436, 531, 3, 3, 3, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (484, '2024-01-19', 1, 2905, 206, 609, 0, 3, 3, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (485, '2024-01-13', 1, 2635, 318, 347, 5, 3, 2, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (486, '2024-01-27', 1, 2675, 397, 629, 3, 3, 2, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (487, '2024-01-15', 0, 2662, 537, 486, 4, 3, 2, 1, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (488, '2024-01-30', 0, 2602, 598, 228, 5, 3, 1, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (489, '2024-01-10', 0, 2622, 378, 540, 2, 3, 1, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (490, '2024-01-25', 1, 2983, 374, 509, 3, 3, 3, 2, 1, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (491, '2024-03-28', 0, 2459, 545, 751, 2, 3, 2, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (492, '2024-03-18', 0, 2676, 453, 780, 5, 3, 1, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (493, '2024-03-27', 0, 2519, 504, 343, 1, 3, 2, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (494, '2024-03-22', 0, 2815, 524, 196, 5, 3, 1, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (495, '2024-03-20', 1, 2732, 438, 939, 4, 3, 2, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (496, '2024-03-20', 1, 2744, 146, 934, 1, 3, 2, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (497, '2024-03-15', 1, 2694, 397, 874, 5, 3, 3, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (498, '2024-03-18', 0, 2604, 158, 724, 5, 3, 1, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (499, '2024-03-31', 0, 2474, 227, 558, 1, 3, 2, 2, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (500, '2024-03-17', 0, 2552, 260, 861, 3, 3, 2, 1, 2, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (501, '2024-06-26', 1, 2688, 118, 903, 1, 3, 2, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (502, '2024-07-02', 1, 2433, 499, 525, 4, 3, 3, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (503, '2024-06-22', 1, 2536, 333, 717, 3, 3, 1, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (504, '2024-07-08', 0, 2449, 175, 212, 4, 3, 1, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (505, '2024-06-21', 1, 2434, 502, 294, 1, 3, 2, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (506, '2024-07-05', 1, 2667, 415, 600, 1, 3, 2, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (507, '2024-07-10', 1, 2464, 322, 931, 1, 3, 2, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (508, '2024-06-21', 1, 2493, 446, 565, 5, 3, 1, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (509, '2024-06-22', 0, 2671, 312, 825, 0, 3, 2, 1, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (510, '2024-06-28', 0, 2699, 428, 577, 3, 3, 2, 2, 3, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (511, '2024-09-21', 0, 2478, 371, 369, 1, 3, 1, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (512, '2024-09-15', 0, 2160, 535, 847, 5, 3, 3, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (513, '2024-09-08', 1, 2384, 131, 714, 3, 3, 1, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (514, '2024-09-24', 1, 2163, 244, 547, 2, 3, 1, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (515, '2024-09-10', 1, 2259, 500, 83, 1, 3, 1, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (516, '2024-09-20', 1, 2164, 551, 55, 0, 3, 2, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (517, '2024-09-17', 1, 2363, 546, 441, 4, 3, 2, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (518, '2024-09-17', 0, 2283, 362, 116, 0, 3, 1, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (519, '2024-09-08', 1, 2260, 588, 106, 4, 3, 1, 1, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (520, '2024-09-10', 1, 2172, 530, 655, 4, 3, 2, 2, 4, 3);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (521, '2024-01-26', 1, 2866, 253, 493, 2, 3, 3, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (522, '2024-01-26', 0, 2656, 119, 612, 3, 3, 3, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (523, '2024-01-10', 1, 2868, 375, 150, 1, 3, 1, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (524, '2024-01-21', 0, 2682, 566, 172, 1, 3, 3, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (525, '2024-01-29', 0, 2868, 343, 453, 1, 3, 3, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (526, '2024-01-29', 0, 2678, 176, 898, 2, 3, 2, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (527, '2024-01-21', 1, 2682, 535, 63, 0, 3, 3, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (528, '2024-01-10', 0, 2704, 181, 137, 2, 3, 1, 1, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (529, '2024-01-20', 0, 2758, 363, 518, 3, 3, 1, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (530, '2024-01-10', 1, 2755, 591, 65, 3, 3, 2, 2, 1, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (531, '2024-04-03', 0, 2538, 211, 741, 3, 3, 1, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (532, '2024-03-29', 0, 2597, 242, 331, 0, 3, 1, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (533, '2024-03-24', 0, 2849, 193, 826, 3, 3, 2, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (534, '2024-04-02', 1, 2727, 541, 46, 3, 3, 3, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (535, '2024-04-04', 0, 2697, 489, 952, 5, 3, 3, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (536, '2024-03-29', 1, 2455, 290, 722, 2, 3, 3, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (537, '2024-03-26', 0, 2559, 532, 625, 2, 3, 3, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (538, '2024-03-29', 0, 2515, 140, 249, 1, 3, 2, 2, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (539, '2024-03-25', 0, 2834, 336, 434, 2, 3, 1, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (540, '2024-03-31', 1, 2455, 454, 383, 0, 3, 1, 1, 2, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (541, '2024-07-01', 0, 2420, 154, 609, 1, 3, 2, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (542, '2024-06-25', 1, 2393, 513, 913, 2, 3, 3, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (543, '2024-06-22', 0, 2640, 366, 898, 5, 3, 1, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (544, '2024-06-21', 1, 2333, 423, 290, 2, 3, 2, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (545, '2024-06-24', 0, 2641, 310, 68, 4, 3, 3, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (546, '2024-06-28', 1, 2451, 372, 530, 3, 3, 2, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (547, '2024-07-04', 1, 2474, 342, 560, 5, 3, 3, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (548, '2024-07-04', 1, 2584, 323, 999, 1, 3, 1, 2, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (549, '2024-07-05', 0, 2314, 453, 272, 3, 3, 1, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (550, '2024-07-10', 0, 2503, 573, 971, 4, 3, 2, 1, 3, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (551, '2024-09-10', 0, 2233, 176, 867, 2, 3, 3, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (552, '2024-09-13', 0, 2187, 451, 620, 0, 3, 1, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (553, '2024-09-24', 0, 2384, 377, 970, 0, 3, 1, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (554, '2024-09-19', 0, 2539, 579, 171, 5, 3, 3, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (555, '2024-09-06', 1, 2303, 250, 915, 4, 3, 3, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (556, '2024-09-14', 0, 2391, 348, 812, 5, 3, 1, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (557, '2024-09-07', 1, 2197, 353, 773, 0, 3, 1, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (558, '2024-09-15', 1, 2355, 280, 38, 4, 3, 2, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (559, '2024-09-11', 1, 2524, 389, 222, 0, 3, 2, 2, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (560, '2024-09-16', 1, 2492, 521, 333, 4, 3, 2, 1, 4, 4);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (561, '2024-01-27', 1, 2852, 134, 22, 3, 3, 2, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (562, '2024-01-30', 0, 2881, 268, 145, 0, 3, 3, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (563, '2024-01-17', 1, 2902, 351, 371, 2, 3, 3, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (564, '2024-01-18', 1, 2970, 212, 890, 3, 3, 3, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (565, '2024-01-14', 1, 2832, 460, 38, 1, 3, 2, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (566, '2024-01-18', 1, 3089, 295, 727, 4, 3, 2, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (567, '2024-01-30', 0, 3083, 446, 309, 1, 3, 3, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (568, '2024-01-14', 0, 3069, 150, 362, 5, 3, 1, 2, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (569, '2024-01-27', 1, 2838, 195, 404, 5, 3, 1, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (570, '2024-01-18', 1, 2867, 585, 397, 3, 3, 2, 1, 1, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (571, '2024-03-24', 0, 2937, 179, 228, 1, 3, 1, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (572, '2024-03-31', 1, 3034, 553, 559, 2, 3, 3, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (573, '2024-03-21', 0, 2675, 461, 425, 0, 3, 1, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (574, '2024-03-26', 1, 2764, 165, 553, 0, 3, 1, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (575, '2024-04-03', 1, 2802, 423, 623, 3, 3, 3, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (576, '2024-03-18', 1, 2787, 200, 603, 4, 3, 1, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (577, '2024-03-21', 0, 2914, 414, 837, 3, 3, 3, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (578, '2024-04-01', 0, 3044, 116, 458, 0, 3, 1, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (579, '2024-03-15', 1, 3011, 526, 523, 4, 3, 1, 1, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (580, '2024-03-24', 0, 2992, 574, 337, 1, 3, 3, 2, 2, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (581, '2024-07-07', 1, 2601, 449, 328, 2, 3, 2, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (582, '2024-06-22', 0, 2554, 192, 61, 4, 3, 3, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (583, '2024-07-08', 0, 2531, 106, 306, 0, 3, 3, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (584, '2024-07-10', 0, 2525, 587, 935, 3, 3, 2, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (585, '2024-06-25', 1, 2603, 344, 143, 0, 3, 3, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (586, '2024-07-01', 0, 2549, 455, 855, 2, 3, 3, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (587, '2024-07-10', 1, 2782, 216, 665, 1, 3, 1, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (588, '2024-06-20', 1, 2802, 262, 640, 1, 3, 2, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (589, '2024-06-21', 0, 2825, 455, 379, 2, 3, 1, 2, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (590, '2024-06-22', 1, 2541, 318, 363, 2, 3, 2, 1, 3, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (591, '2024-09-06', 1, 2717, 196, 972, 2, 3, 3, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (592, '2024-09-14', 1, 2557, 256, 106, 4, 3, 1, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (593, '2024-09-06', 0, 2411, 506, 243, 2, 3, 2, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (594, '2024-09-09', 0, 2681, 485, 279, 0, 3, 1, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (595, '2024-09-15', 1, 2353, 588, 346, 0, 3, 1, 2, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (596, '2024-09-22', 0, 2638, 302, 170, 5, 3, 3, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (597, '2024-09-12', 1, 2634, 378, 196, 5, 3, 2, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (598, '2024-09-07', 1, 2398, 569, 293, 3, 3, 3, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (599, '2024-09-09', 1, 2437, 570, 656, 2, 3, 1, 1, 4, 5);
INSERT INTO Battle (id, date_of_battle, win, dmg, assist, blocked, kils, player_id, map_id, battle_type_id, version_id, tank_id)
VALUES (600, '2024-09-09', 0, 2709, 103, 498, 5, 3, 1, 1, 4, 5);
