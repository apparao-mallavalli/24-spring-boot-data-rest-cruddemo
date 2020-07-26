DROP SCHEMA IF EXISTS `employee_directory`;
CREATE SCHEMA `employee_directory`;
USE `employee_directory` ;

-- -----------------------------------------------------
-- 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_directory`.`supplier` (
  `supplier_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `supplier_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`supplier_id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;



-- -----------------------------------------------------
-- Table `assignment`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_directory`.`catalogue` (
  `sku_code` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `sku_name` VARCHAR(255) DEFAULT NULL,
  
  `sku_description` VARCHAR(255) DEFAULT NULL,
  `brand_name` VARCHAR(25) DEFAULT NULL,
  `brand_description` VARCHAR(255) DEFAULT NULL,
  
  `supplier_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`sku_code`),
  KEY `fk_category` (`supplier_id`),
  CONSTRAINT `fk_category` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`supplier_id`)
) 
ENGINE=InnoDB
AUTO_INCREMENT = 1;

insert into supplier(supplier_name)values("vijaya");

insert into catalogue(sku_name,sku_description,brand_name,brand_description,supplier_id)values("chicken","nonveg","andhra","andhra meals",1);

select * from supplier;

select * from catalogue;