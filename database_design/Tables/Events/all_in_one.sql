
DROP TABLE `events_db`.`audit`;
DROP TABLE `events_db`.`event_coordinators`;
DROP TABLE `events_db`.`event_sponsors`;
DROP TABLE `events_db`.`event_tickets`;
DROP TABLE `events_db`.`event_types_rel`;
DROP TABLE `events_db`.`event_types`;
DROP TABLE `events_db`.`event_venues`;
DROP TABLE `events_db`.`events`;


CREATE TABLE `events_db`.`audit` (
 `audit_id` INT NOT NULL AUTO_INCREMENT,
 `user` varchar(100) NOT NULL,
 `action_type` varchar(100) NOT NULL,
 `action_ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (`audit_id`)
);

CREATE TABLE `events_db`.`event_coordinators` (
 `event_coordinator_id` INT NOT NULL AUTO_INCREMENT,
 `event_id` INT NOT NULL,
 `firstname` varchar(20) DEFAULT NULL,
 `lastname` varchar(20) DEFAULT NULL,
 `primary_phone` varchar(15),
 `secondary_phone` varchar(15),
 `email` varchar(100),
  PRIMARY KEY (`event_coordinator_id`)
);

CREATE TABLE `events_db`.`event_sponsors` (
 `event_sponsor_id` INT NOT NULL AUTO_INCREMENT,
 `event_id` INT NOT NULL,
 `entity_id` INT NOT NULL,
  PRIMARY KEY (`event_sponsor_id`)
);

CREATE TABLE `events_db`.`event_tickets` (
 `event_ticket_id` INT NOT NULL,
 `event_id` INT NOT NULL,
 `ticket_type` varchar(10) DEFAULT NULL,
 `ticket_amount` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`event_ticket_id`)
);

CREATE TABLE `events_db`.`event_types_rel` (
 `event_id` INT NOT NULL,
 `event_type_id` INT NOT NULL,
   PRIMARY KEY (`event_id`, `event_type_id`)
);

CREATE TABLE `events_db`.`event_types` (
 `event_type_id` INT NOT NULL,
 `event_type` varchar(128) DEFAULT NULL,
 `status` varchar(10) DEFAULT NULL,
   PRIMARY KEY (`event_type_id`)
);

CREATE TABLE `events_db`.`event_venues` (
 `event_venue_id` INT NOT NULL AUTO_INCREMENT,
 `name` varchar(128) DEFAULT NULL,
 `address` varchar(200) DEFAULT NULL,
 `city` varchar(60) NOT NULL,
 `state` varchar(2) ,
 `region` varchar(50),
 `zip` varchar(5) ,
 `country` varchar(50) NOT NULL,
 `status` varchar(10) DEFAULT NULL,
 `contact` varchar(50) NOT NULL,
 `business_hours` varchar(50) NOT NULL,
 `primary_phone` varchar(15),
 `secondary_phone` varchar(15),
 `fax` varchar(15) ,
 `email` varchar(100),
 `url` varchar(100),
 `instagram` varchar(100),
 `facebook` varchar(100),
 `twitter` varchar(100),
   PRIMARY KEY (`event_venue_id`)
);

CREATE TABLE `events_db`.`events` (
 `event_id` INT NOT NULL AUTO_INCREMENT,
 `name` varchar(128) DEFAULT NULL,
 `detail` varchar(300) DEFAULT NULL,
 `start_date` timestamp DEFAULT NULL,
 `end_date` timestamp DEFAULT NULL,
 `status` varchar(10) DEFAULT NULL,
   PRIMARY KEY (`event_id`)
);
