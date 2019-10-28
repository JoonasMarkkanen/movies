DROP TABLE movie; 
DROP TABLE genre; 

CREATE TABLE genre
(id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY
,name VARCHAR(50) NOT NULL);


CREATE TABLE movie (
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(50) NOT NULL,
director VARCHAR(50) NOT NULL,
role VARCHAR(50) NOT NULL,
year BIGINT,
runtime BIGINT,
genreid BIGINT);


INSERT INTO genre (name) VALUES ('Action'), ('Adventure'), ('Biography'), ('Comedy'), ('Crime'), ('Documentary'), ('Drama'), ('History'),
('Horror'), ('Mystery'), ('Romance'), ('Sci-Fi'), ('Sport'), ('Thriller'), ('War'), ('Western');

INSERT INTO movie (title, director, role, year, runtime, genreid)
VALUES ('Girl on the Run', 'Arthur J. Beckhard, Joseph Lee', 'Uncredited', 1953, 64, 5),
('Somebody Up There Likes Me', 'Robert Wise', 'Fidel', 1956, 114, 3),
('Never Love a Stranger', 'Robert Stevens', 'Martin Cabell', 1958, 91, 5),
('The Blob', 'Irvin Yeaworth', 'Steve Andrews', 1958, 86, 9),
('The Great St. Louis Bank Robbery', 'Charles Guggenheim, John Stix', 'George Fowler', 1959, 89, 5),
('Never So Few', 'John Sturges', 'Bill Ringa', 1959, 124, 15),
('The Magnificent Seven', 'John Sturges', 'Vin Tanner', 1960, 128, 16),
('The Honeymoon Machine', 'Richard Thorpe', 'Ferguson Howard', 1961, 84, 11),
('Hell Is for Heroes', 'Don Siegel', 'John Reese', 1962, 90, 15),
('The War Lover', 'Philip Leacock', 'Buzz Rickson', 1962, 105, 2),
('The Great Escape', 'John Sturges', 'Virgil Hilts (The Cooler King)', 1963, 172, 8),
('Soldier in the Rain', 'Ralph Nelson', 'Eustis Clay', 1963, 96, 4),
('Love with the Proper Stranger', 'Robert Mulligan', 'Rocky Papasano', 1963, 102, 11),
('Baby the Rain Must Fall', 'Robert Mulligan', 'Henry Thomas', 1965, 100, 7),
('The Cincinnati Kid', 'Norman Jewison', 'Eric Stoner (The Cincinnati Kid)', 1965, 102, 7),
('Nevada Smith', 'Henry Hathaway', 'Max Sand (Nevada Smith)', 1966, 128, 16),
('The Sand Pebbles', 'Robert Wise', 'Jake Holman', 1966, 182, 15),
('The Thomas Crown Affair', 'Norman Jewison', 'Thomas Crown', 1968, 102, 14),
('Bullitt', 'Peter Yates', 'Frank Bullitt', 1968, 113, 1),
('The Reivers', 'Mark Rydell', 'Boon Hogganbeck', 1969, 107, 7),
('Le Mans', 'Lee H. Katzin', 'Michael Delaney', 1971, 106, 13),
('On Any Sunday', 'Bruce Brown', 'Himself', 1971, 96, 6),
('Junior Bonner', 'Sam Peckinpah', 'Junior JR Bonner', 1972, 100, 16),
('The Getaway', 'Sam Peckinpah', 'Carter Doc McCoy', 1972, 122, 5),
('Papillon', 'Franklin J. Schaffner', 'Henri Charrière', 1973, 150, 3),
('The Towering Inferno', 'John Guillermin', 'Michael OHallorhan', 1974, 165, 14),
('An Enemy of the People', 'George Schaefer', 'Thomas Stockmann', 1978, 103, 7),
('Tom Horn', 'William Wiard', 'Tom Horn', 1980, 98, 16),
('The Hunter', 'Buzz Kulik', 'Ralph Papa Thorson', 1980, 97, 3);

SELECT * FROM movie;
SELECT * FROM genre;