CREATE TABLE `events_db`.`audit` (
 `audit_id` INT NOT NULL AUTO_INCREMENT,
 `user` varchar(100) NOT NULL,
 `action_type` varchar(100) NOT NULL,
 `action_ts` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (`audit_id`)
);
