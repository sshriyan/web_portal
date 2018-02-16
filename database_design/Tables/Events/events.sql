CREATE TABLE `events_db`.`events` (
 `event_id` INT NOT NULL AUTO_INCREMENT,
 `name` varchar(128) DEFAULT NULL,
 `detail` varchar(300) DEFAULT NULL,
 `start_date` timestamp DEFAULT NULL,
 `end_date` timestamp DEFAULT NULL,
 `status` varchar(10) DEFAULT NULL,
   PRIMARY KEY (`event_id`)
);
