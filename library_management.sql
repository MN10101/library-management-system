CREATE DATABASE IF NOT EXISTS `library_management`;
USE `library_management`;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `isbn` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `book`
--

INSERT INTO `book` (`title`, `author`, `isbn`) VALUES 
    ('Clean Code: A Handbook of Agile Software Craftsmanship', 'Robert C. Martin', '9780132350884'),
    ('Head First Java', 'Kathy Sierra & Bert Bates', '9780596009205'),
    ('Effective Java', 'Joshua Bloch', '9780134685991'),
    ('C# in Depth', 'Jon Skeet', '9781617291340'),
    ('Spring in Action', 'Craig Walls', '9781617291203');

