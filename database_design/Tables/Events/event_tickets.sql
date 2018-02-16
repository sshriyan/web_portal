CREATE TABLE `events_db`.`event_tickets` (
 `event_ticket_id` INT NOT NULL,
 `event_id` INT NOT NULL,
 `ticket_type` varchar(10) DEFAULT NULL,
 `ticket_amount` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`event_ticket_id`)
);
