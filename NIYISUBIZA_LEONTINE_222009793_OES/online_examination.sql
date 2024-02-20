-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 20, 2024 at 04:43 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `online_examination`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(12) NOT NULL,
  `first name` varchar(12) NOT NULL,
  `last name` varchar(14) NOT NULL,
  `email` varchar(15) NOT NULL,
  `telephone` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `first name`, `last name`, `email`, `telephone`) VALUES
(2345, 'dfgh', 'dfghnjmk', 'dfvgbhjnmk', 'dfghjm');

-- --------------------------------------------------------

--
-- Table structure for table `assignment`
--

CREATE TABLE `assignment` (
  `id` int(14) NOT NULL,
  `name` varchar(13) NOT NULL,
  `course` varchar(12) NOT NULL,
  `title` varchar(15) NOT NULL,
  `deadline` varchar(17) NOT NULL,
  `maximum score` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `assignment`
--

INSERT INTO `assignment` (`id`, `name`, `course`, `title`, `deadline`, `maximum score`) VALUES
(2345, 'dcfvbn', 'dfcvgbnm', 'dfghnj', 'dfghj', 56);

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` int(15) NOT NULL,
  `name` varchar(13) NOT NULL,
  `teacher` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `name`, `teacher`) VALUES
(1234, 'dfgbhnj', 'dfghj');

-- --------------------------------------------------------

--
-- Table structure for table `enrollment`
--

CREATE TABLE `enrollment` (
  `id` int(15) NOT NULL,
  `user` varchar(14) NOT NULL,
  `course` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `enrollment`
--

INSERT INTO `enrollment` (`id`, `user`, `course`) VALUES
(234, 'dfghj', 'vbnm');

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `id` int(16) NOT NULL,
  `name` varchar(15) NOT NULL,
  `course` varchar(17) NOT NULL,
  `start time` varchar(15) NOT NULL,
  `end time` varchar(14) NOT NULL,
  `title` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`id`, `name`, `course`, `start time`, `end time`, `title`) VALUES
(2345, 'dfgh', 'xcvbn', 'cvbnm', 'fvgbhnm', 'cfvbnm');

-- --------------------------------------------------------

--
-- Table structure for table `grade`
--

CREATE TABLE `grade` (
  `id` int(12) NOT NULL,
  `user` varchar(16) NOT NULL,
  `assignment` varchar(14) NOT NULL,
  `exam` varchar(17) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `grade`
--

INSERT INTO `grade` (`id`, `user`, `assignment`, `exam`) VALUES
(123, 'sdfg', 'cvbnm', 'xcvbn');

-- --------------------------------------------------------

--
-- Table structure for table `submission`
--

CREATE TABLE `submission` (
  `id` int(13) NOT NULL,
  `user` varchar(10) NOT NULL,
  `assignment` varchar(12) NOT NULL,
  `exam` varchar(17) NOT NULL,
  `submission time` varchar(12) NOT NULL,
  `score` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `submission`
--

INSERT INTO `submission` (`id`, `user`, `assignment`, `exam`, `submission time`, `score`) VALUES
(2345, 'sdfgh', 'cvbnm', 'fghnj', 'dfghj', 12);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(12) NOT NULL,
  `first name` varchar(16) NOT NULL,
  `last name` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `email` varchar(14) NOT NULL,
  `role` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
