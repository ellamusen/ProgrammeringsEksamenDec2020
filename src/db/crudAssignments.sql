/* INSERT INTO queries, som gemmer 3 nye opskrifter i databasen */
INSERT INTO recipes (name, approach, servings, timesInMinutes) VALUES
('Burger','Assemble all ingredients',2,30),
('Pizza','Assemble all ingredients',2,30),
('Pita bread','Heat bread and add salad and falafles',2,30);

/* INSERT INTO queries, som gemmer 5 nye ingredienser i databasen */
INSERT INTO ingredients (name, kcal) VALUES
('burger buns',250),
('lettuce',10),
('cucumber',10),
('ketchup',120),
('pizza dough',250);

/* 1 SELECT query, som viser indholdet af ingrediens-tabellen i ABC-rækkefølge */
SELECT * FROM ingredients ORDER BY name ASC;

/* 1 UPDATE query, som opdaterer navnet af en opskrift */
/* Converting first letter from lower case to upper case */
UPDATE ingredients SET name = UPPER(substr(name,1,1)) || SUBSTR(name, 2);

/* 1 DELETE query, som sletter en opskrift */
DELETE FROM ingredients WHERE id = 10;

/* 1 SELECT query, som viser indholdet af opskrifts-tabellen i ABC-rækkefølge */
SELECT * FROM recipes ORDER BY name ASC;

/* 1 SELECT query, som viser indholdet af ingrediens-tabellen i faldende næringsindholds rækkefølge */
SELECT * FROM ingredients ORDER BY kcal DESC;