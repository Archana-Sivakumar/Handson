SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `library_schema` ;
CREATE SCHEMA IF NOT EXISTS `library_schema` DEFAULT CHARACTER SET latin1 ;
USE `library_schema` ;

-- -----------------------------------------------------
-- Table `library_schema`.`book`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `library_schema`.`book` ;

CREATE  TABLE IF NOT EXISTS `library_schema`.`book` (
  `bo_id` INT NOT NULL ,
  `bo_title` VARCHAR(45) NOT NULL ,
  `bo_author_name` VARCHAR(45) NOT NULL ,
  `bo_price` INT NOT NULL ,
  `bo_publisher` VARCHAR(45) NOT NULL ,
  `bo_isbn` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`bo_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_schema`.`subscriber`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `library_schema`.`subscriber` ;

CREATE  TABLE IF NOT EXISTS `library_schema`.`subscriber` (
  `su_id` INT NOT NULL ,
  `su_name` VARCHAR(45) NOT NULL ,
  `su_address` VARCHAR(45) NOT NULL ,
  `su_contact_number` INT NOT NULL ,
  PRIMARY KEY (`su_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_schema`.`book_has_subscriber`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `library_schema`.`book_has_subscriber` ;

CREATE  TABLE IF NOT EXISTS `library_schema`.`book_has_subscriber` (
  `book_bo_id` INT NOT NULL ,
  `subscriber_su_id` INT NOT NULL ,
  PRIMARY KEY (`book_bo_id`, `subscriber_su_id`) ,
  INDEX `fk_book_has_subscriber_subscriber1` (`subscriber_su_id` ASC) ,
  INDEX `fk_book_has_subscriber_book` (`book_bo_id` ASC) ,
  CONSTRAINT `fk_book_has_subscriber_book`
    FOREIGN KEY (`book_bo_id` )
    REFERENCES `library_schema`.`book` (`bo_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_has_subscriber_subscriber1`
    FOREIGN KEY (`subscriber_su_id` )
    REFERENCES `library_schema`.`subscriber` (`su_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_schema`.`book_lending`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `library_schema`.`book_lending` ;

CREATE  TABLE IF NOT EXISTS `library_schema`.`book_lending` (
  `bo_le_id` INT NOT NULL ,
  `bo_le_date` DATE NOT NULL ,
  PRIMARY KEY (`bo_le_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_schema`.`subscriber_has_book_lending`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `library_schema`.`subscriber_has_book_lending` ;

CREATE  TABLE IF NOT EXISTS `library_schema`.`subscriber_has_book_lending` (
  `subscriber_su_id` INT NOT NULL ,
  `book_lending_bo_le_id` INT NOT NULL ,
  PRIMARY KEY (`subscriber_su_id`, `book_lending_bo_le_id`) ,
  INDEX `fk_subscriber_has_book_lending_book_lending1` (`book_lending_bo_le_id` ASC) ,
  INDEX `fk_subscriber_has_book_lending_subscriber1` (`subscriber_su_id` ASC) ,
  CONSTRAINT `fk_subscriber_has_book_lending_subscriber1`
    FOREIGN KEY (`subscriber_su_id` )
    REFERENCES `library_schema`.`subscriber` (`su_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_subscriber_has_book_lending_book_lending1`
    FOREIGN KEY (`book_lending_bo_le_id` )
    REFERENCES `library_schema`.`book_lending` (`bo_le_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
