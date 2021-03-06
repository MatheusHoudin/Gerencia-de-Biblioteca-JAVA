-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: biblioteca
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `author` varchar(80) DEFAULT NULL,
  `theme` varchar(30) DEFAULT NULL,
  `publishingCompany` varchar(40) DEFAULT NULL,
  `edition` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'PS eu te amo','matheus','romance','abril',1),(2,'A cabana','João','Religioso','Veja',2),(3,'Game of Thrones','Popo','Sei la','Abril',2),(5,'The walking dead a caminho de woodbury','Maria','Terror','Abril',1),(6,'The walking dead a queda do governador','Maria','Terror','Abril',1);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exemplary`
--

DROP TABLE IF EXISTS `exemplary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exemplary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `avaliable` tinyint(4) DEFAULT NULL,
  `book` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `book` (`book`),
  CONSTRAINT `exemplary_ibfk_1` FOREIGN KEY (`book`) REFERENCES `book` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exemplary`
--

LOCK TABLES `exemplary` WRITE;
/*!40000 ALTER TABLE `exemplary` DISABLE KEYS */;
INSERT INTO `exemplary` VALUES (7,1,5);
/*!40000 ALTER TABLE `exemplary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lending`
--

DROP TABLE IF EXISTS `lending`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lending` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `penality` float(5,2) DEFAULT NULL,
  `lendingDate` date DEFAULT NULL,
  `devolutionDate` date DEFAULT NULL,
  `exemplary` int(11) DEFAULT NULL,
  `user` int(11) DEFAULT NULL,
  `lendingLibrarian` int(11) DEFAULT NULL,
  `devolutionLibrarian` int(11) DEFAULT NULL,
    `status` TINYINT(1),
  PRIMARY KEY (`id`),
  KEY `exemplary` (`exemplary`),
  KEY `user` (`user`),
  KEY `lendingLibrarian` (`lendingLibrarian`),
  KEY `devolutionLibrarian` (`devolutionLibrarian`),
  CONSTRAINT `lending_ibfk_1` FOREIGN KEY (`exemplary`) REFERENCES `exemplary` (`id`),
  CONSTRAINT `lending_ibfk_2` FOREIGN KEY (`user`) REFERENCES `user` (`id`),
  CONSTRAINT `lending_ibfk_3` FOREIGN KEY (`lendingLibrarian`) REFERENCES `librarian` (`id`),
  CONSTRAINT `lending_ibfk_4` FOREIGN KEY (`devolutionLibrarian`) REFERENCES `librarian` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lending`
--

LOCK TABLES `lending` WRITE;
/*!40000 ALTER TABLE `lending` DISABLE KEYS */;
/*!40000 ALTER TABLE `lending` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `librarian`
--

DROP TABLE IF EXISTS `librarian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `librarian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_UNIQUE` (`user`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `librarian`
--

LOCK TABLES `librarian` WRITE;
/*!40000 ALTER TABLE `librarian` DISABLE KEYS */;
INSERT INTO `librarian` VALUES (1,'Matheus','user1','pass1');
/*!40000 ALTER TABLE `librarian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_UNIQUE` (`user`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (7,'Matheus','matheusloldin','matheus15');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-26 22:39:53
