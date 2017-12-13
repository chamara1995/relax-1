CREATE TABLE IF NOT EXISTS `dental_db`.`tbl_patient_plaque_control` (
  `ID` CHAR(32) NOT NULL,
  `ITEM` CHAR(128) NULL DEFAULT NULL,
  `OPTION` CHAR(128) NULL DEFAULT NULL,
  `BRUSHING_TOOL` CHAR(128) NULL,
  `BRUSHING_FREQUENCY` CHAR(128) NULL,
  `BRISTLES` CHAR(32) NULL,
  `BRUSHING_DURATION` CHAR(32) NULL,
  `TOOTH_PASTE_TYPE` CHAR(32) NULL,
  `CLEANING_AIDS` CHAR(128) NULL,
  `APPROVED_BY` CHAR(32) NULL DEFAULT NULL,
  `COMMENT` CHAR(128) NULL DEFAULT NULL,
  `STATUS` TINYINT(4) NULL DEFAULT '0',
  `SORT_ORDER` INT(6) NULL DEFAULT '1',
  `INSERT_USER_ID` CHAR(32) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `INSERT_DATETIME` DATETIME NULL DEFAULT NULL,
  `UPDATE_USER_ID` CHAR(32) CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci' NULL DEFAULT NULL,
  `UPDATE_DATETIME` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;
