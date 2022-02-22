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
	phone_number VARCHAR(10) NULL,
	birthday DATE NOT NULL,
	wants_emails BOOLEAN NOT NULL

);

CREATE TABLE interest_group (
	group_number SERIAL NOT NULL PRIMARY KEY,
	group_name VARCHAR(64) NOT NULL UNIQUE
);

CREATE TABLE event (
	event_number SERIAL NOT NULL PRIMARY KEY,
	event_name VARCHAR(64) NOT NULL,
	description VARCHAR(200) NOT NULL,
	duration_length_minutes INT NOT NULL CHECK(duration_length_minutes >= 30) ,
	group_number INT NOT NULL CONSTRAINT fk_group REFERENCES interest_group(group_number)
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

BEGIN TRANSACTION;
INSERT INTO member(lastname, firstname,email_address,birthday,wants_emails)
VALUES('Paul', 'Peter', 'ppeter@yahoo.com', '19960108', true);

INSERT INTO member(lastname,firstname,email_address, birthday,wants_emails)
VALUES('Peter', 'Taft', 'ptaft@yahoo.com', '19990215', false);

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday,wants_emails)
VALUES('John', 'Smith', 'jonsmith@yahoo.com', '5135634032', '19960108', true);

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday,wants_emails)
VALUES('James', 'Smith', 'jamessmith@yahoo.com', '5135634033', '19941107', true);

INSERT INTO member(lastname,firstname,email_address, birthday,wants_emails)
VALUES('Adam', 'Jones', 'Ajones@yahoo.com', '19781104', false);

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday, wants_emails)
VALUES('Rebeca', 'Smith', 'RebecaSmith@yahoo.com', '5136544032','19840426', false);

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday, wants_emails)
VALUES('Andrew', 'Sowder', 'AndrewSowder@yahoo.com', '5139720927','19951004', true);

INSERT INTO member(lastname,firstname,email_address, phone_number, birthday, wants_emails)
VALUES('Arnold', 'Steelflex', 'ASTEEL@yahoo.com', '5136544032','20050904', true);

INSERT INTO interest_group(group_name)
VALUES ('JavaManiacs');

INSERT INTO interest_group(group_name)
VALUES ('PythonPipers');

INSERT INTO interest_group(group_name)
VALUES ('SQLUnited');

INSERT INTO event(event_name, description, duration_length_minutes, group_number)
VALUES ('Code and Coffee', 'Enjoy your cup of coffee as we learn more code!',45,1);

INSERT INTO event(event_name, description, duration_length_minutes, group_number)
VALUES ('HackermaticConvention', 'Plug in with us!',120,2);

INSERT INTO event(event_name, description, duration_length_minutes, group_number)
VALUES ('Data Collection Con 2022', 'STOP, DROP, AND ROLLBACK',30,3);

INSERT INTO event_member(event_number, member_number)
VALUES(1,2);

INSERT INTO event_member(event_number, member_number)
VALUES(2,4);

INSERT INTO event_member(event_number, member_number)
VALUES(3,3);



INSERT INTO group_member(group_number, member_number)
VALUES(1,1),(1,5);

INSERT INTO group_member(group_number, member_number)
VALUES(2,4),(2,7);

INSERT INTO group_member(group_number, member_number)
VALUES(3,8),(3,3);


COMMIT





