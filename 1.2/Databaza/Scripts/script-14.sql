SELECT
  t.tank_name AS Tank,
  p.player_name AS Player,
  AVG(CASE WHEN v.version_name = '1.27.0' THEN rv.result_value_value END) AS [1.27.0],
  AVG(CASE WHEN v.version_name = '1.28.0' THEN rv.result_value_value END) AS [1.28.0],
  AVG(CASE WHEN v.version_name = '1.29.0' THEN rv.result_value_value END) AS [1.29.0]
FROM Player p 
LEFT JOIN Participation pa ON p.player_id = pa.participation_player_id 
LEFT JOIN Battle b ON pa.participation_battle_id = b.battle_id 
LEFT JOIN Version v ON b.battle_version_id = v.version_id 
LEFT JOIN Tank t ON pa.participation_tank_id = t.tank_id 
LEFT JOIN [Result] r ON pa.participation_id = r.result_participation_id 
LEFT JOIN Result_Row rr ON r.result_result_row_id = rr.result_row_id 
LEFT JOIN Result_Value rv ON rr.result_row_value_id = rv.result_value_id 
WHERE rr.result_row_name = 'Damage dealt' AND p.player_name = 'franta_lala'
GROUP BY p.player_name, t.tank_name
