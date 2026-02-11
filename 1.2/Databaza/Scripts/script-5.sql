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
