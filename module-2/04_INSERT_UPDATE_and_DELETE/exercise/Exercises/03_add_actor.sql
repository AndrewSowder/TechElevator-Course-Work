-- 3. Did you know Eric Stoltz was originally cast as Marty McFly in "Back to the Future"? Add Eric Stoltz to the list of actors for "Back to the Future" (1 row)

SELECT *
FROM person
WHERE person_name = 'Eric Stoltz'; 

INSERT INTO movie_actor(movie_id, actor_id) 
VALUES(( SELECT movie_id FROM movie WHERE title = 'Back to the Future'), '7036');

SELECT *
FROM movie_actor
JOIN person ON person_id = movie_actor.actor_id
WHERE person_name = 'Eric Stoltz'; 





