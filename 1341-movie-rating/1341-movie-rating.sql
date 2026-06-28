WITH TopUser AS (
    SELECT TOP 1 u.name AS results
    FROM Users u
    INNER JOIN MovieRating mr ON u.user_id = mr.user_id
    GROUP BY u.name
    ORDER BY COUNT(mr.movie_id) DESC, u.name ASC
),
TopMovie AS (
    SELECT TOP 1 m.title AS results
    FROM Movies m
    INNER JOIN MovieRating mr ON m.movie_id = mr.movie_id
    WHERE mr.created_at >= '2020-02-01' AND mr.created_at < '2020-03-01'
    GROUP BY m.title
    ORDER BY AVG(CAST(mr.rating AS DECIMAL(4,2))) DESC, m.title ASC
)
SELECT results FROM TopUser
UNION ALL
SELECT results FROM TopMovie;
