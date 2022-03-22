DROP TABLE IF EXISTS book, author, author_book CASCADE;

CREATE TABLE book (
	book_id serial,
	title varchar(500) NOT NULL,
	subtitle varchar(1000),
	publish_year int,
	CONSTRAINT PK_book PRIMARY KEY (book_id)
);

CREATE TABLE author(
	author_id serial,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL,
	CONSTRAINT PK_author PRIMARY KEY (author_id)
);

CREATE TABLE author_book (
	author_id int NOT NULL,
	book_id int NOT NULL,
	CONSTRAINT PK_author_book PRIMARY KEY (author_id, book_id),
	CONSTRAINT FK_author_book_author_id FOREIGN KEY (author_id) REFERENCES author(author_id),
	CONSTRAINT FK_author_book_book_id FOREIGN KEY (book_id) REFERENCES book(book_id)
);

INSERT INTO book (title, subtitle, publish_year) VALUES ('Eat & Run', 'My unlikely journey to ultramarathon greatness', 2013);
INSERT INTO book (title, subtitle, publish_year) VALUES ('North', 'Finding my way while running the appalachian trail', 2019);
INSERT INTO author (first_name, last_name) VALUES ('Scott', 'Jurek');
INSERT INTO author (first_name, last_name) VALUES ('Jenny', 'Jurek');
INSERT INTO author (first_name, last_name) VALUES ('Steve', 'Friedman');
INSERT INTO author_book VALUES (1, 1);
INSERT INTO author_book VALUES (1, 2);
INSERT INTO author_book VALUES (2, 2);
INSERT INTO author_book VALUES (3, 1);

INSERT INTO book (title, publish_year) VALUES ('Cutting for Stone', 2009);
INSERT INTO author (first_name, last_name) VALUES ('Abraham', 'Verghese');
INSERT INTO author_book VALUES (4, 3);

INSERT INTO book (title, publish_year) VALUES ('The Poisonwood Bible', 1998);
INSERT INTO author (first_name, last_name) VALUES ('Barbara', 'Kingsolver');
INSERT INTO author_book VALUES (5, 4);

INSERT INTO book (title, subtitle, publish_year) VALUES ('Ishmael', 'An adventure of the mind and spirit', 1992);
INSERT INTO author (first_name, last_name) VALUES ('Daniel', 'Quinn');
INSERT INTO author_book VALUES (6, 5);

INSERT INTO book (title, publish_year) VALUES ('A Soldier of the Great War', 1991);
INSERT INTO author (first_name, last_name) VALUES ('Mark', 'Helprin');
INSERT INTO author_book VALUES (7, 6);

INSERT INTO book (title, publish_year) VALUES ('To Kill a Mockingbird', 1960);
INSERT INTO author (first_name, last_name) VALUES ('Harper', 'Lee');
INSERT INTO author_book VALUES (8, 7);

INSERT INTO book (title, publish_year) VALUES ('Man''s Search For Meaning', 1946);
INSERT INTO author (first_name, last_name) VALUES ('Viktor', 'Frankl');
INSERT INTO author_book VALUES (9, 8);

INSERT INTO book (title, subtitle, publish_year) VALUES ('The Rock Warrior''s Way', 'Mental Training for Climbers', 2003);
INSERT INTO author (first_name, last_name) VALUES ('Arno', 'Ilgner');
INSERT INTO author_book VALUES (10, 9);