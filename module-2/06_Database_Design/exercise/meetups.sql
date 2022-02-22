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
	group_name VARCHAR(64) NOT NULL UNIQUE,
	group_members INT NOT NULL

);

CREATE TABLE event (
	event_number SERIAL NOT NULL PRIMARY KEY,
	event_name VARCHAR(64) NOT NULL,
	description VARCHAR(200) NOT NULL,
	duration_length_minutes INT NOT NULL CHECK(duration_length_minutes >= 30) ,
	group_number INT NOT NULL CONSTRAINT fk_group REFERENCES interest_group(group_number),
	event_members INT NOT NULL

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

INSERT INTO member()
