-- THI KẾT THÚC DATABASE
-- 1.Lấy thông tin các bộ phim gồm: tiêu đề, mô tả, tên đạo diễn, tên biên kịch (bảng writers - trả về dạng array), độ dài, rating, của các bộ phim thuộc loại ‘Movie’.
SELECT a.title , a.description AS description , d.full_name AS author ,
	   JSON_ARRAYAGG(c.full_name) AS writer , a.`length` AS length , a.rating 
FROM movie a INNER JOIN movie_writers b  
ON a.id = b.id_movie  
INNER JOIN writers c ON c.id = b.id_writer 
INNER JOIN director d ON d.id = a.id_director 
INNER JOIN title_type e ON a.id_title_type = e.id 
WHERE e.name = 'Movie'
GROUP BY a.id
-- 2.Liệt kê các hãng phim (Bảng manufacturer) và số lượng phim thuộc hãng đó.
SELECT a.name AS Manufacturer , COUNT(c.id) AS 'Count film'
FROM manufacturer a
LEFT JOIN movie_manufacturer b 
ON a.id = b.id_manufacturer 
INNER JOIN movie c 
ON c.id = b.id_movie  
GROUP BY a.id 
-- 3.Liệt kê các phim thuộc loại TV Series đã hoàn thành (current_episode = episode)
SELECT a.title , a.episode , a.current_episode 
FROM movie a 
INNER JOIN title_type b 
ON a.id_title_type = b.id 
WHERE b.name = 'TV Series' 
AND a.current_episode = a.episode
-- 4. Liệt kê tên phim và trailer có trạng thái active của phim đó
SELECT a.title, b.status 
FROM movie a 
INNER JOIN movie_trailer b 
ON a.id = b.id_movie 
INNER JOIN trailer c 
ON c.id = b.id_trailer 
WHERE b.status = 'active' 
-- 5.Liệt kê tiêu đê, mô tả, poster, độ dài và điểm imdb của các phim thuộc loại Movie và sắp xếp theo điểm imdb giảm dần
SELECT a.title , a.description AS Description , a.poster AS Poster , a.`length` , a.imdb  
FROM movie a 
INNER JOIN title_type b 
ON a.id_title_type = b.id 
WHERE b.name = 'Movie'
ORDER BY a.imdb DESC 
-- 6.Liệt kê tiêu đề, mô tả, poster, độ dài, thể loại (bảng genres - trả về dữ liệu dạng array), số tập và số tập đã công chiếu, của các phim thuộc loại TV mini Series, sắp xếp theo ngày công chiếu mới nhất
SELECT a.title, a.description AS Description , a.release_date , a.poster AS Poster , a.`length` , 
	   JSON_ARRAYAGG(d.name) AS Genres , a.episode , a.current_episode 
FROM movie a INNER JOIN movie_genres b 
ON a.id = b.id_movie 
INNER JOIN genres c ON c.id = b.id_genres  
INNER JOIN title_type d ON a.id_title_type = d.id
WHERE d.name = 'TV mini Series'
GROUP BY a.id
ORDER BY release_date DESC 
-- 7.Liệt kê tiêu đề, mô tả, đạo diễn, biên kịch (array), poster, độ dài, thể loại (bảng genres - trả về dữ liệu dạng array), tên diễn viên (array) của các phim thuộc loại Movie của 10 bộ phim có điểm imdb cao nhất
SELECT a.title , a.description AS Description , a.poster AS Poster , JSON_ARRAYAGG(g.name) AS Genres,JSON_ARRAYAGG(e.full_name) AS Actors , a.imdb AS Imdb 
FROM movie a 
INNER JOIN movie_writers b 
ON a.id = b.id_movie 
INNER JOIN writers c ON c.id = b.id_writer 
INNER JOIN movie_actor d ON a.id = d.id_movie 
INNER JOIN actor e ON e.id = d.id_actor 
INNER JOIN movie_genres f ON a.id = f.id_movie
INNER JOIN genres g ON g.id = f.id_genres 
INNER JOIN title_type i ON a.id_title_type = i.id
WHERE i.name = 'Movie'
GROUP BY a.id 
ORDER BY a.imdb DESC 
LIMIT 10 
