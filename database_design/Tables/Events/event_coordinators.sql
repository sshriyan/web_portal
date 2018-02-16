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
