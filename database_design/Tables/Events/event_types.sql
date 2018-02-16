CREATE TABLE `events_db`.`event_types` (
 `event_type_id` INT NOT NULL,
 `event_type` varchar(128) DEFAULT NULL,
 `status` varchar(10) DEFAULT NULL,
   PRIMARY KEY (`event_type_id`)
);
