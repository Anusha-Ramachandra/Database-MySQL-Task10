-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: company
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `empl`
--

DROP TABLE IF EXISTS `empl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empl` (
  `empno` int NOT NULL,
  `ename` varchar(50) DEFAULT NULL,
  `job` varchar(50) DEFAULT NULL,
  `mgr` int DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `sal` decimal(10,2) DEFAULT NULL,
  `comm` decimal(10,2) DEFAULT NULL,
  `deptno` int DEFAULT NULL,
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empl`
--

LOCK TABLES `empl` WRITE;
/*!40000 ALTER TABLE `empl` DISABLE KEYS */;
INSERT INTO `empl` VALUES (8369,'SMITH','CLERK',8902,'1990-12-18',800.00,0.00,20),(8499,'ANYA','SALESMAN',8698,'1991-02-20',1600.00,300.00,30),(8521,'SETH','SALESMAN',8698,'1991-02-22',1250.00,500.00,30),(8566,'MAHADEVAN','MANAGER',8839,'1991-04-02',2985.00,NULL,20),(8654,'MOMIN','SALESMAN',8696,'1991-09-28',1250.00,1400.00,30),(8698,'BINA','MANAGER',8839,'1991-05-01',2850.00,NULL,30),(8839,'AMIR','PRESIDENT',NULL,'1991-11-18',5000.00,NULL,10),(8844,'KULDEEP','SALESMAN',8696,'1991-09-08',1500.00,0.00,30),(8882,'SHIVANSH','MANAGER',8839,'1991-06-09',2450.00,NULL,10),(8888,'SCOTT','ANALYST',8566,'1992-12-09',3000.00,NULL,20);
/*!40000 ALTER TABLE `empl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeedetails`
--

DROP TABLE IF EXISTS `employeedetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeedetails` (
  `empcode` int NOT NULL,
  `empname` varchar(50) DEFAULT NULL,
  `empage` int DEFAULT NULL,
  `esalary` double DEFAULT NULL,
  PRIMARY KEY (`empcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeedetails`
--

LOCK TABLES `employeedetails` WRITE;
/*!40000 ALTER TABLE `employeedetails` DISABLE KEYS */;
INSERT INTO `employeedetails` VALUES (101,'Jenny',25,10000),(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000),(105,'Shammer',25,90000);
/*!40000 ALTER TABLE `employeedetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-03-28 10:12:36
