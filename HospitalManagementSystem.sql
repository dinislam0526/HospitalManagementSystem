-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.73-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema hms
--

CREATE DATABASE IF NOT EXISTS hms;
USE hms;

--
-- Definition of table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
CREATE TABLE `adminlogin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

/*!40000 ALTER TABLE `adminlogin` DISABLE KEYS */;
INSERT INTO `adminlogin` (`id`,`name`,`user_name`,`password`) VALUES 
 (1,'DinIslam','a','123');
/*!40000 ALTER TABLE `adminlogin` ENABLE KEYS */;


--
-- Definition of table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
  `appoint_id` varchar(45) NOT NULL,
  `doctor_code` varchar(45) DEFAULT NULL,
  `patient_code` varchar(45) DEFAULT NULL,
  `appoint_date` varchar(45) DEFAULT NULL,
  `appoint_time` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`appoint_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
INSERT INTO `appointment` (`appoint_id`,`doctor_code`,`patient_code`,`appoint_date`,`appoint_time`,`status`,`phone`) VALUES 
 ('ap_001','DC_1001','Pt_001','02/10/2022','9pm','Pending','01999065423'),
 ('ap_002','DC_1002','Pt_002','02/10/2022','3pm','Pending','01521353150'),
 ('ap_003','Select or Write ID','Pt_003','','','Pending',''),
 ('Select or Write ID','Select or Write ID','Select or Write ID','','','Pending','');
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;


--
-- Definition of table `departments`
--

DROP TABLE IF EXISTS `departments`;
CREATE TABLE `departments` (
  `dept_code` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `head` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dept_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departments`
--

/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` (`dept_code`,`name`,`head`,`location`) VALUES 
 ('dp_001','Cardology','Din Islam','A block'),
 ('dp_002','Emergency','Rakib','B block');
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;


--
-- Definition of table `doctor_payment`
--

DROP TABLE IF EXISTS `doctor_payment`;
CREATE TABLE `doctor_payment` (
  `payment_code` varchar(45) NOT NULL,
  `doctor_code` varchar(45) DEFAULT NULL,
  `doctor_name` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `amount_pay` varchar(45) DEFAULT NULL,
  `pay_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`payment_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor_payment`
--

/*!40000 ALTER TABLE `doctor_payment` DISABLE KEYS */;
INSERT INTO `doctor_payment` (`payment_code`,`doctor_code`,`doctor_name`,`department`,`amount_pay`,`pay_date`) VALUES 
 ('pc_101','DC_1002','Rakib','Cardology','10000','03/10/2022'),
 ('Select or Write ID','Select or Write ID','','','','');
/*!40000 ALTER TABLE `doctor_payment` ENABLE KEYS */;


--
-- Definition of table `doctors`
--

DROP TABLE IF EXISTS `doctors`;
CREATE TABLE `doctors` (
  `doctor_code` varchar(45) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `marital_status` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `join_date` varchar(45) DEFAULT NULL,
  `leaving_date` varchar(45) DEFAULT NULL,
  `visit_timing` varchar(45) DEFAULT NULL,
  `days` varchar(45) DEFAULT NULL,
  `cnic` varchar(45) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`doctor_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctors`
--

/*!40000 ALTER TABLE `doctors` DISABLE KEYS */;
INSERT INTO `doctors` (`doctor_code`,`fname`,`lname`,`age`,`marital_status`,`gender`,`address`,`department`,`join_date`,`leaving_date`,`visit_timing`,`days`,`cnic`,`user_name`,`password`,`phone`) VALUES 
 ('DC_1001','Din ','Islam','25','Married','Male','Munshiganj','Select or Write ID','2022-02-04','','4pm','sun,mon,tue','1025-100-25','d','123','01521353150'),
 ('DC_1002','Rakib','Mazarul','27','Unmarried','Male','Dinajpur','Cardology','2022-02-04','','10am','sat,sum,mon','2002','r','123','01999065423'),
 ('DC_1003','Mahabur','Rahaman','27','Unmarried','Male','Mymanshing','Cardology','2022-02-04','','10am','sat,sum,mon','2003','m','123','01999065423'),
 ('DC_1004','Sayem','Sikder','27','Married','Male','Munshiganj','Cardology','28/09/2022','','1pm','sun, thu,fry','2004-102','s','123','01523654485');
/*!40000 ALTER TABLE `doctors` ENABLE KEYS */;


--
-- Definition of table `patient_payment`
--

DROP TABLE IF EXISTS `patient_payment`;
CREATE TABLE `patient_payment` (
  `payment_code` varchar(45) NOT NULL,
  `patient_code` varchar(45) DEFAULT NULL,
  `patient_name` varchar(45) DEFAULT NULL,
  `problem` varchar(45) DEFAULT NULL,
  `amount_pay` varchar(45) DEFAULT NULL,
  `pay_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`payment_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient_payment`
--

/*!40000 ALTER TABLE `patient_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_payment` ENABLE KEYS */;


--
-- Definition of table `patients`
--

DROP TABLE IF EXISTS `patients`;
CREATE TABLE `patients` (
  `patient_code` varchar(45) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `marital_status` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `admit_date` varchar(45) DEFAULT NULL,
  `word_no` varchar(45) DEFAULT NULL,
  `bed_no` varchar(45) DEFAULT NULL,
  `cnic` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`patient_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patients`
--

/*!40000 ALTER TABLE `patients` DISABLE KEYS */;
INSERT INTO `patients` (`patient_code`,`fname`,`lname`,`age`,`gender`,`marital_status`,`address`,`phone`,`admit_date`,`word_no`,`bed_no`,`cnic`) VALUES 
 ('Pt_001','Mahabur','Ahmed','27','Male','UnMarried','Rayerbag','015321456','2022-09-28','03','07','5000-200-03'),
 ('Pt_002','Nokib','Ahmed','27','Male','UnMarried','Rayerbag','015321456','2022-09-28','03','07','5000-200-03'),
 ('Pt_003','Zibon','Ahmed','27','Male','UnMarried','Rayerbag','015321456','2022-09-28','03','07','5000-200-03'),
 ('Pt_004','fatema','aktar','18','Female','Married','','','','','','');
/*!40000 ALTER TABLE `patients` ENABLE KEYS */;


--
-- Definition of table `pharmacists`
--

DROP TABLE IF EXISTS `pharmacists`;
CREATE TABLE `pharmacists` (
  `ph_code` varchar(45) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `marital_status` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `qualification` varchar(45) DEFAULT NULL,
  `join_date` varchar(45) DEFAULT NULL,
  `leaving_date` varchar(45) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ph_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pharmacists`
--

/*!40000 ALTER TABLE `pharmacists` DISABLE KEYS */;
INSERT INTO `pharmacists` (`ph_code`,`fname`,`lname`,`age`,`marital_status`,`gender`,`address`,`qualification`,`join_date`,`leaving_date`,`user_name`,`password`,`phone`) VALUES 
 ('Ph_001','Mamun','Ahmed','26','Unmarrie','Male','Maymanshig','Graduated','','','f','123','254546+6+9'),
 ('Ph_002','Rabiul','','','<select>','<select>','','<select>','','','','','');
/*!40000 ALTER TABLE `pharmacists` ENABLE KEYS */;


--
-- Definition of table `prescription`
--

DROP TABLE IF EXISTS `prescription`;
CREATE TABLE `prescription` (
  `prescription_code` varchar(45) NOT NULL,
  `patient_code` varchar(45) DEFAULT NULL,
  `doctor_code` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`prescription_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prescription`
--

/*!40000 ALTER TABLE `prescription` DISABLE KEYS */;
INSERT INTO `prescription` (`prescription_code`,`patient_code`,`doctor_code`,`date`) VALUES 
 ('Item 1','Item 1','Item 1',''),
 ('p_1000','Pt_001','DC_1002','cdc'),
 ('Select or Write ID','Select or Write ID','Select or Write ID','');
/*!40000 ALTER TABLE `prescription` ENABLE KEYS */;


--
-- Definition of table `prescription_details`
--

DROP TABLE IF EXISTS `prescription_details`;
CREATE TABLE `prescription_details` (
  `prescription_details_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `prescription_code` varchar(45) DEFAULT NULL,
  `medicine_name` varchar(45) DEFAULT NULL,
  `instruction` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`prescription_details_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prescription_details`
--

/*!40000 ALTER TABLE `prescription_details` DISABLE KEYS */;
INSERT INTO `prescription_details` (`prescription_details_id`,`prescription_code`,`medicine_name`,`instruction`) VALUES 
 (0000000001,'p_1000','Napa','101'),
 (0000000002,'p_1000','Napa extra','101'),
 (0000000003,'p_1000','Napa extra Cold','101'),
 (0000000004,'Select or Write ID','',''),
 (0000000005,'Select or Write ID','','');
/*!40000 ALTER TABLE `prescription_details` ENABLE KEYS */;


--
-- Definition of table `receptionists`
--

DROP TABLE IF EXISTS `receptionists`;
CREATE TABLE `receptionists` (
  `recept_code` varchar(45) NOT NULL,
  `fname` varchar(45) DEFAULT NULL,
  `lname` varchar(45) DEFAULT NULL,
  `age` varchar(45) DEFAULT NULL,
  `marital_status` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `qualification` varchar(45) DEFAULT NULL,
  `join_date` varchar(45) DEFAULT NULL,
  `leaving_date` varchar(45) DEFAULT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`recept_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `receptionists`
--

/*!40000 ALTER TABLE `receptionists` DISABLE KEYS */;
INSERT INTO `receptionists` (`recept_code`,`fname`,`lname`,`age`,`marital_status`,`gender`,`address`,`qualification`,`join_date`,`leaving_date`,`user_name`,`password`,`phone`) VALUES 
 ('R_001','DinIslam','Rahaman','25','Unmarrie','Male','Mymanshing','Graduated','2022-02-04','','r','123','01234654'),
 ('R_002','Nokib','Ahmed','27','Unmarrie','Male','Tangail','Graduated','2022-04-25','','nokib','123','01999065423');
/*!40000 ALTER TABLE `receptionists` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
