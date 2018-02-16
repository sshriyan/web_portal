CREATE TABLE `events_db`.`event_sponsors` (
 `event_sponsor_id` INT NOT NULL AUTO_INCREMENT,
 `event_id` INT NOT NULL,
 `entity_id` INT NOT NULL,
  PRIMARY KEY (`event_sponsor_id`)
);
