SELECT t.tank_name Tank, p.player_name,
    AVG(CASE WHEN m.maps_name = 'Himmelsdorf' THEN rv.result_value_value END) [Himmelsdorf],
    AVG(CASE WHEN m.maps_name = 'Prokhorovka' THEN rv.result_value_value END) [Prokhorovka],
    AVG(CASE WHEN m.maps_name = 'Murovanka' THEN rv.result_value_value END) [Murovanka],
    AVG(CASE WHEN m.maps_name = 'Ensk' THEN rv.result_value_value END) [Ensk],
    AVG(CASE WHEN m.maps_name = 'Malinovka' THEN rv.result_value_value END) [Malinovka],
    AVG(CASE WHEN m.maps_name = 'Paris' THEN rv.result_value_value END) [Paris]
    FROM Player p 
        LEFT JOIN Participation pa ON p.player_id = pa.participation_player_id 
        LEFT JOIN Battle b ON pa.participation_battle_id = b.battle_id 
        LEFT JOIN Maps m ON b.battle_map_id = m.maps_id 
        LEFT JOIN Version v ON b.battle_version_id = v.version_id 
        LEFT JOIN Tank t ON pa.participation_tank_id = t.tank_id 
        LEFT JOIN [Result] r ON pa.participation_id = r.result_participation_id 
        LEFT JOIN Result_Row rr ON r.result_result_row_id = rr.result_row_id 
        LEFT JOIN Result_Value rv ON rr.result_row_value_id = rv.result_value_id
    GROUP BY t.tank_name,  p.player_name
