--DROP TABLE IF EXISTS `books`;

CREATE TABLE IF NOT EXISTS `bookdb`.`books` (
  `bookid` INT AUTO_INCREMENT  PRIMARY KEY,
  `bookname` VARCHAR(100) NOT NULL,
  `author` VARCHAR(100) NOT NULL,
  `category` VARCHAR(100) NOT NULL,
  `description` VARCHAR(250) NOT NULL
);

