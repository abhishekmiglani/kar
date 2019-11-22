-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2019 at 05:45 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.2.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `car_rental`
--

-- --------------------------------------------------------

--
-- Table structure for table `wallet_transaction`
--

CREATE TABLE `wallet_transaction` (
  `transaction_id` int(11) NOT NULL,
  `transaction_amount` double DEFAULT NULL,
  `transaction_date` date DEFAULT current_timestamp(),
  `transaction_detail` varchar(255) DEFAULT NULL,
  `transaction_type` varchar(255) DEFAULT NULL,
  `wallet_wallet_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `wallet_transaction`
--

INSERT INTO `wallet_transaction` (`transaction_id`, `transaction_amount`, `transaction_date`, `transaction_detail`, `transaction_type`, `wallet_wallet_id`) VALUES
(0, 10, '2019-11-21', 'deduction', 'debit', 1),
(1, 23, '2019-11-20', 'bonus credits', 'credit', 1),
(2, 12, '2019-11-20', 'deduction anonymous', 'debit', 1),
(3, 12, '2019-11-20', 'bonus', 'credit', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `wallet_transaction`
--
ALTER TABLE `wallet_transaction`
  ADD PRIMARY KEY (`transaction_id`),
  ADD KEY `FK5sh8pulu297ps2vqoa1w8ess1` (`wallet_wallet_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `wallet_transaction`
--
ALTER TABLE `wallet_transaction`
  ADD CONSTRAINT `FK5sh8pulu297ps2vqoa1w8ess1` FOREIGN KEY (`wallet_wallet_id`) REFERENCES `wallet` (`wallet_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
