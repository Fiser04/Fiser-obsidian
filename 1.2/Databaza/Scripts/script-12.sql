USE WotBattleDatabaseV2;
--use master;
INSERT INTO Result_value (result_value_value) VALUES (704), (998), (873), (1171), (898), (1403), (1436), (1597), (1592), (1483), (1076), (1257), (1407), (902), (1248), (1237), (1412), (1164), (1585), (1527), (1954), (1692), (2072), (1765), (1903), (1241), (1345), (1368), (1607), (1870), (1344), (1894), (1403), (1986), (2019), (2127), (1817), (1987), (1946), (2102), (1735), (1606), (2095), (1659), (1851), (2080), (1929), (1932), (2119), (1980), (2814), (2307), (2640), (2897), (3051), (2459), (2669), (2267), (2216), (1956)


INSERT INTO Player (player_name) VALUES
('franta_lala'),
('tankista_007'),
('panzer_maniak'),
('sniper_ace');
INSERT INTO Version (version_name, version_date_create) VALUES
('1.27.0', '2024-01-15'),
('1.28.0', '2024-04-10'),
('1.29.0', '2024-07-05');
INSERT INTO Maps (maps_name) VALUES
('Himmelsdorf'),
('Prokhorovka'),
('Murovanka'),
('Ensk'),
('Malinovka'),
('Paris');
INSERT INTO Tank (tank_name, tank_nation, tank_type, tank_tier) VALUES
('IS-7', 'USSR', 'Heavy', 10),
('Obj. 140', 'USSR', 'Medium', 10),
('T57 Heavy', 'USA', 'Heavy', 10),
('AMX 50 B', 'France', 'Heavy', 10);
INSERT INTO Equipment (equipment_name, equipment_effect) VALUES
('Improved Hardening', 'Increased durability and suspension performance'),
('Gun Rammer', 'Increased rate of fire'),
('Vertical Stabilizer', 'Improved aiming stability'),
('Turbocharger', 'Increased engine power and top speed'),
('Improved Ventilation', 'Enhanced crew performance'),
('Coated Optics', 'Extended view range');


-- Verze 1.27.0
INSERT INTO Battle (battle_mode, battle_date, battle_lenght, battle_map_id, battle_version_id) VALUES
('Standard', '2024-01-20 15:30:00', 600, 1, 1),
('Standard', '2024-01-22 16:00:00', 580, 2, 1),
('Standard', '2024-01-25 17:15:00', 610, 3, 1),
('Standard', '2024-01-28 14:45:00', 590, 4, 1),
('Standard', '2024-01-30 18:00:00', 605, 5, 1);

-- Verze 1.28.0
INSERT INTO Battle (battle_mode, battle_date, battle_lenght, battle_map_id, battle_version_id) VALUES
('Standard', '2024-04-15 15:30:00', 600, 2, 2),
('Standard', '2024-04-17 16:00:00', 580, 3, 2),
('Standard', '2024-04-20 17:15:00', 610, 4, 2),
('Standard', '2024-04-23 14:45:00', 590, 5, 2),
('Standard', '2024-04-25 18:00:00', 605, 6, 2);

-- Verze 1.29.0
INSERT INTO Battle (battle_mode, battle_date, battle_lenght, battle_map_id, battle_version_id) VALUES
('Standard', '2024-07-10 15:30:00', 600, 1, 3),
('Standard', '2024-07-12 16:00:00', 580, 2, 3),
('Standard', '2024-07-15 17:15:00', 610, 3, 3),
('Standard', '2024-07-18 14:45:00', 590, 4, 3),
('Standard', '2024-07-20 18:00:00', 605, 5, 3);


INSERT INTO Result_Row (result_row_name, result_row_value_id) VALUES ('Damage Dealt', 1), ('Damage Dealt', 2), ('Damage Dealt', 3), ('Damage Dealt', 4), 
('Damage Dealt', 5), ('Damage Dealt', 6), ('Damage Dealt', 7), ('Damage Dealt', 8), ('Damage Dealt', 9), 
('Damage Dealt', 10), ('Damage Dealt', 11), ('Damage Dealt', 12), ('Damage Dealt', 13), ('Damage Dealt', 14), 
('Damage Dealt', 15), ('Damage Dealt', 16), ('Damage Dealt', 17), ('Damage Dealt', 18), ('Damage Dealt', 19), 
('Damage Dealt', 20), ('Damage Dealt', 21), ('Damage Dealt', 22), ('Damage Dealt', 23), ('Damage Dealt', 24), 
('Damage Dealt', 25), ('Damage Dealt', 26), ('Damage Dealt', 27), ('Damage Dealt', 28), ('Damage Dealt', 29), 
('Damage Dealt', 30), ('Damage Dealt', 31), ('Damage Dealt', 32), ('Damage Dealt', 33), ('Damage Dealt', 34), 
('Damage Dealt', 35), ('Damage Dealt', 36), ('Damage Dealt', 37), ('Damage Dealt', 38), ('Damage Dealt', 39), 
('Damage Dealt', 40), ('Damage Dealt', 41), ('Damage Dealt', 42), ('Damage Dealt', 43), ('Damage Dealt', 44), 
('Damage Dealt', 45), ('Damage Dealt', 46), ('Damage Dealt', 47), ('Damage Dealt', 48), ('Damage Dealt', 49), 
('Damage Dealt', 50), ('Damage Dealt', 51), ('Damage Dealt', 52), ('Damage Dealt', 53), ('Damage Dealt', 54), 
('Damage Dealt', 55), ('Damage Dealt', 56), ('Damage Dealt', 57), ('Damage Dealt', 58), ('Damage Dealt', 59),
('Damage Dealt', 60)
;

INSERT INTO Participation (participation_team, participation_player_id, participation_tank_id, participation_battle_id) VALUES (1, 1, 2, 1), (1, 2, 1, 1), (2, 3, 1, 1), (2, 4, 1, 1), (1, 1, 4, 2), (1, 2, 2, 2), (2, 3, 1, 2), (2, 4, 1, 2), (1, 1, 4, 3), (1, 2, 1, 3), (2, 3, 1, 3), (2, 4, 4, 3), (1, 1, 4, 4), (1, 2, 1, 4), (2, 3, 3, 4), (2, 4, 3, 4), (1, 1, 1, 5), (1, 2, 1, 5), (2, 3, 1, 5), (2, 4, 3, 5), (1, 1, 4, 6), (1, 2, 3, 6), (2, 3, 2, 6), (2, 4, 2, 6), (1, 1, 1, 7), (1, 2, 4, 7), (2, 3, 2, 7), (2, 4, 2, 7), (1, 1, 1, 8), (1, 2, 1, 8), (2, 3, 4, 8), (2, 4, 3, 8), (1, 1, 4, 9), (1, 2, 1, 9), (2, 3, 1, 9), (2, 4, 3, 9), (1, 1, 1, 10), (1, 2, 3, 10), (2, 3, 4, 10), (2, 4, 2, 10), (1, 1, 4, 11), (1, 2, 1, 11), (2, 3, 3, 11), (2, 4, 2, 11), (1, 1, 3, 12), (1, 2, 4, 12), (2, 3, 3, 12), (2, 4, 4, 12), (1, 1, 2, 13), (1, 2, 3, 13), (2, 3, 2, 13), (2, 4, 4, 13), (1, 1, 4, 14), (1, 2, 4, 14), (2, 3, 3, 14), (2, 4, 2, 14), (1, 1, 1, 15), (1, 2, 3, 15), (2, 3, 2, 15), (2, 4, 4, 15) ;

INSERT INTO Equipment_Usage (equipment_usage_equipment_id, equipment_usage_participation_id, equipment_usage_slot) VALUES
(3, 1, 1), (6, 1, 2), (3, 1, 3), (3, 2, 1), (2, 2, 2), (1, 2, 3), (5, 3, 1), (6, 3, 2), (4, 3, 3), (4, 4, 1), (2, 4, 2), (5, 4, 3), (4, 5, 1), (1, 5, 2), (5, 5, 3), (4, 6, 1), (5, 6, 2), (5, 6, 3), (1, 7, 1), (6, 7, 2), (2, 7, 3), (3, 8, 1), (3, 8, 2), (4, 8, 3), (2, 9, 1), (5, 9, 2), (3, 9, 3), (3, 10, 1), (5, 10, 2), (5, 10, 3), (6, 11, 1), (2, 11, 2), (4, 11, 3), (2, 12, 1), (2, 12, 2), (3, 12, 3), (3, 13, 1), (4, 13, 2), (4, 13, 3), (4, 14, 1), (5, 14, 2), (3, 14, 3), (4, 15, 1), (6, 15, 2), (4, 15, 3), (4, 16, 1), (5, 16, 2), (2, 16, 3), (1, 17, 1), (6, 17, 2), (3, 17, 3), (5, 18, 1), (3, 18, 2), (5, 18, 3), (6, 19, 1), (2, 19, 2), (1, 19, 3), (2, 20, 1), (4, 20, 2), (1, 20, 3), (3, 21, 1), (1, 21, 2), (3, 21, 3), (4, 22, 1), (1, 22, 2), (4, 22, 3), (3, 23, 1), (4, 23, 2), (6, 23, 3), (4, 24, 1), (5, 24, 2), (4, 24, 3), (5, 25, 1), (3, 25, 2), (6, 25, 3), (3, 26, 1), (3, 26, 2), (4, 26, 3), (6, 27, 1), (6, 27, 2), (4, 27, 3), (1, 28, 1), (5, 28, 2), (5, 28, 3), (5, 29, 1), (4, 29, 2), (2, 29, 3), (5, 30, 1), (3, 30, 2), (6, 30, 3), (6, 31, 1), (2, 31, 2), (6, 31, 3), (6, 32, 1), (5, 32, 2), (5, 32, 3), (2, 33, 1), (1, 33, 2), (2, 33, 3), (6, 34, 1), (3, 34, 2), (5, 34, 3), (2, 35, 1), (3, 35, 2), (3, 35, 3), (2, 36, 1), (3, 36, 2), (5, 36, 3), (3, 37, 1), (2, 37, 2), (1, 37, 3), (5, 38, 1), (6, 38, 2), (1, 38, 3), (1, 39, 1), (6, 39, 2), (3, 39, 3), (2, 40, 1), (2, 40, 2), (5, 40, 3), (4, 41, 1), (1, 41, 2), (1, 41, 3), (6, 42, 1), (3, 42, 2), (2, 42, 3), (3, 43, 1), (3, 43, 2), (4, 43, 3), (5, 44, 1), (1, 44, 2), (2, 44, 3), (4, 45, 1), (2, 45, 2), (4, 45, 3), (5, 46, 1), (5, 46, 2), (6, 46, 3), (3, 47, 1), (4, 47, 2), (4, 47, 3), (3, 48, 1), (4, 48, 2), (3, 48, 3), (1, 49, 1), (6, 49, 2), (3, 49, 3), (5, 50, 1), (1, 50, 2), (1, 50, 3), (2, 51, 1), (3, 51, 2), (2, 51, 3), (5, 52, 1), (2, 52, 2), (2, 52, 3), (2, 53, 1), (5, 53, 2), (5, 53, 3), (4, 54, 1), (3, 54, 2), (2, 54, 3), (6, 55, 1), (1, 55, 2), (3, 55, 3), (4, 56, 1), (5, 56, 2), (3, 56, 3), (5, 57, 1), (5, 57, 2), (3, 57, 3), (5, 58, 1), (6, 58, 2), (2, 58, 3), (6, 59, 1), (4, 59, 2), (1, 59, 3), (4, 60, 1), (5, 60, 2), (3, 60, 3);


INSERT INTO Result (result_participation_id, result_result_row_id) VALUES
(1, 1), (5, 2), (9, 3), (13, 4), (17, 5), (21, 6), (25, 7), (29, 8), (33, 9), (37, 10), (41, 11), (45, 12), (49, 13), (53, 14), (57, 15), (2, 16), (6, 17), (10, 18), (14, 19), (18, 20), (22, 21), (26, 22), (30, 23), (34, 24), (38, 25), (42, 26), (46, 27), (50, 28), (54, 29), (58, 30), (3, 31), (7, 32), (11, 33), (15, 34), (19, 35), (23, 36), (27, 37), (31, 38), (35, 39), (39, 40), (43, 41), (47, 42), (51, 43), (55, 44), (59, 45), (4, 46), (8, 47), (12, 48), (16, 49), (20, 50), (24, 51), (28, 52), (32, 53), (36, 54), (40, 55), (44, 56), (48, 57), (52, 58), (56, 59), (60, 60);



