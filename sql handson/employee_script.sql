SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `emp_schema` ;
CREATE SCHEMA IF NOT EXISTS `emp_schema` DEFAULT CHARACTER SET latin1 ;
USE `emp_schema` ;

-- -----------------------------------------------------
-- Table `emp_schema`.`department`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `emp_schema`.`department` ;

CREATE  TABLE IF NOT EXISTS `emp_schema`.`department` (
  `dp_id` INT NOT NULL ,
  `dp_name` VARCHAR(45) NOT NULL ,
  `dp_address` VARCHAR(45) NOT NULL ,
  `dp_city` VARCHAR(45) NOT NULL ,
  `dp_pincode` INT NOT NULL ,
  `dp_contact_number` INT NOT NULL ,
  PRIMARY KEY (`dp_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `emp_schema`.`employee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `emp_schema`.`employee` ;

CREATE  TABLE IF NOT EXISTS `emp_schema`.`employee` (
  `em_id` INT NOT NULL ,
  `em_first_name` VARCHAR(45) NOT NULL ,
  `em_last_name` VARCHAR(45) NOT NULL ,
  `em_date_of_birth` INT NOT NULL ,
  `em_salary` INT NOT NULL ,
  `department_dp_id` INT NOT NULL ,
  PRIMARY KEY (`em_id`) ,
  INDEX `fk_employee_department` (`department_dp_id` ASC) ,
  CONSTRAINT `fk_employee_department`
    FOREIGN KEY (`department_dp_id` )
    REFERENCES `emp_schema`.`department` (`dp_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `emp_schema`.`skill`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `emp_schema`.`skill` ;

CREATE  TABLE IF NOT EXISTS `emp_schema`.`skill` (
  `sk_id` INT NOT NULL ,
  `sk_name` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`sk_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `emp_schema`.`employee_has_skill`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `emp_schema`.`employee_has_skill` ;

CREATE  TABLE IF NOT EXISTS `emp_schema`.`employee_has_skill` (
  `employee_em_id` INT NOT NULL ,
  `skill_sk_id` INT NOT NULL ,
  `es_id` INT NOT NULL ,
  PRIMARY KEY (`employee_em_id`, `skill_sk_id`) ,
  INDEX `fk_employee_has_skill_skill1` (`skill_sk_id` ASC) ,
  INDEX `fk_employee_has_skill_employee1` (`employee_em_id` ASC) ,
  CONSTRAINT `fk_employee_has_skill_employee1`
    FOREIGN KEY (`employee_em_id` )
    REFERENCES `emp_schema`.`employee` (`em_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employee_has_skill_skill1`
    FOREIGN KEY (`skill_sk_id` )
    REFERENCES `emp_schema`.`skill` (`sk_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
