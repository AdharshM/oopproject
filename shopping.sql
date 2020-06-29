-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 29, 2020 at 07:10 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shopping`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `product` varchar(25) NOT NULL,
  `discprice` float NOT NULL,
  `actprice` float NOT NULL,
  `proid` int(6) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`product`, `discprice`, `actprice`, `proid`) VALUES
('Sunflower Oil(1 ltr)', 70, 100, 121),
('Salt(1 kg)', 50, 60, 169),
('Soap(Washing)', 70, 100, 137);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `Name` text NOT NULL,
  `Username` varchar(24) NOT NULL,
  `Password` varchar(24) DEFAULT NULL,
  `Email` varchar(50) NOT NULL,
  `Address` varchar(60) NOT NULL,
  `Phone` bigint(20) NOT NULL,
  PRIMARY KEY (`Username`,`Email`,`Phone`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Name`, `Username`, `Password`, `Email`, `Address`, `Phone`) VALUES
('Adharsh M', 'samurai1729', 'tianchenglou', '1231@qq.cn', 'Kim Chaek District, North Korea', 797798677),
('Gennady', 'djflame123', 'dreamoon123', 'kimhansol@gg.co', 'Kochi, Kerala,India', 98979652),
('Gennady', 'tourist343', 'thetopcoder@123', 'gennady@yandex.ru', 'ITMO University, St. petersburg, Russia', 989898989);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
