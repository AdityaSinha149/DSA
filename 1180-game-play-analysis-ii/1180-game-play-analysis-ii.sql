SELECT
  A.player_id,
  A.device_id
FROM
  Activity A
WHERE
  (A.player_id, A.event_date) IN (
    SELECT
      B.player_id,
      MIN(B.event_date)
    FROM
      Activity B
    GROUP BY
      B.player_id
  )
GROUP BY
  A.player_id, A.device_id;
