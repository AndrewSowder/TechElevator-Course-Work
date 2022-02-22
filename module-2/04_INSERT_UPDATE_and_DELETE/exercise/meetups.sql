DROP TABLE IF EXISTS event_member ;
DROP TABLE IF EXISTS group_member ;
DROP TABLE IF EXISTS event; 
DROP TABLE IF EXISTS interest_group; 
DROP TABLE IF EXISTS member;

CREATE TABLE member (
	member_number SERIAL NOT NULL PRIMARY KEY,
	lastname VARCHAR(64) NOT NULL,
	firstname VARCHAR(64) NOT NULL,
	email_address VARCHAR(64) NOT NULL,
	phone_number VARCHAR NULL,
	birthday TIMESTAMP NOT NULL, 
	wants_emails BOOLEAN NOT NULL
		
);

CREATE TABLE interest_group (
	group_number SERIAL NOT NULL PRIMARY KEY,
	group_name VARCHAR(64) NOT NULL UNIQUE
	--group_members INT NULL
	
);

CREATE TABLE event (
	event_number SERIAL NOT NULL PRIMARY KEY,
	event_name VARCHAR(64) NOT NULL,
	description VARCHAR(200) NOT NULL, 
	duration_length_minutes INT NOT NULL CHECK(duration_length_minutes >= 30) ,
	group_number INT NOT NULL CONSTRAINT fk_group REFERENCES interest_group(group_number)
	--event_members SERIAL NULL 
	
);

CREATE TABLE group_member (
	group_number INT NOT NULL CONSTRAINT fk_group REFERENCES interest_group(group_number),
	member_number INT NOT NULL CONSTRAINT fk_member REFERENCES member(member_number),
	CONSTRAINT pk_group_member PRIMARY KEY (group_number, member_number)	
);


CREATE TABLE event_member (
	event_number INT NOT NULL CONSTRAINT fk_event REFERENCES event(event_number),
	member_number INT NOT NULL CONSTRAINT fk_member REFERENCES member(member_number),
	CONSTRAINT pk_event_member PRIMARY KEY (event_number, member_number)	
);

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday,wants_emails)
VALUES('John', 'Smith', 'jonsmith@yahoo.com', '5135634032', '19600101', true)

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday,wants_emails)
VALUES('James', 'Smith', 'jamessmith@yahoo.com', '5135634033', '19600110', false)

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday,wants_emails)
VALUES('Adam', 'Jones', 'Ajones@yahoo.com', '5135634050', '19870101', true)

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday,wants_emails)
VALUES('Rebeca', 'Smith', 'RebecaSmith@yahoo.com', '5136544032', '19901021', false)

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday,wants_emails)
VALUES('Andrew', 'Sowder', 'andrewsowder@yahoo.com', '5139720927', '19951004', true)

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday,wants_emails)
VALUES('Rob', 'Peter', 'rpeter@yahoo.com', '5134334032', '19760108', true)

INSERT INTO member(lastname,firstname,email_address, birthday,wants_emails)
VALUES('Paul', 'Peter', 'ppeter@yahoo.com', '19960108', true)

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday,wants_emails)
VALUES('Arnold', 'Steelflex', 'ASTEEL@yahoo.com', '5132344032', '19950820', false)

INSERT INTO interest_group(group_name)
VALUES ('Java-Maniacs')

INSERT INTO interest_group(group_name)
VALUES ('PythonPipers')

INSERT INTO interest_group(group_name)
VALUES ('C#Elites')

SELECT * 
FROM interest_group







