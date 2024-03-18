-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2024 at 05:58 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fitnessapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `fooditems`
--

CREATE TABLE `fooditems` (
  `foodItemName` varchar(30) NOT NULL COMMENT 'All measurements are mg/100 g',
  `FoodGroup` varchar(30) DEFAULT NULL,
  `potassium` float DEFAULT NULL,
  `calcium` float DEFAULT NULL,
  `carbohydrate` float DEFAULT NULL,
  `fat` float DEFAULT NULL,
  `fiber` float DEFAULT NULL,
  `protein` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fooditems`
--

INSERT INTO `fooditems` (`foodItemName`, `FoodGroup`, `potassium`, `calcium`, `carbohydrate`, `fat`, `fiber`, `protein`) VALUES
('Almond', 'Nuts', NULL, NULL, 24900, 39100, 4600, 20500),
('AlmondMilk', 'MilkProduct', 67, 184, NULL, NULL, NULL, NULL),
('Anatidae', 'AnimalFood', NULL, NULL, 1400, 14042.9, NULL, 17642.9),
('Apple', 'Fruits', 272.7, NULL, 30780, 380, 1340, 420),
('Apricot', 'Fruits', NULL, NULL, 28700, 700, 2066.67, 1400),
('AsianPear', 'Fruits', 121, 4, NULL, NULL, NULL, NULL),
('Avocado', 'Vegetables', 732.833, NULL, 9100, 15700, 266600, 1900),
('Bagel', 'CerealsandCerealProducts', NULL, NULL, 53750, NULL, 2650, 10456),
('Banana', 'Fruits', 59, NULL, NULL, NULL, NULL, NULL),
('Bean', 'Pulses', 347.5, NULL, 19267.1, NULL, 5033.33, 5578.57),
('Beef', 'AnimalFood', NULL, NULL, 200.067, 11314.9, 4.836, 23135.6),
('BlackSalsify', 'Vegetables', 383.5, 42.05, 16950, 200, 1650, 3300),
('Broccoli', 'Vegetables', 269.675, NULL, 4450, 433.333, 1583.33, 3500),
('BrusselSprouts', 'Vegetables', 500.942, NULL, 7600, 500, 2100, 4250),
('Butter', 'MilkProduct', NULL, NULL, 600, 81950, NULL, 500),
('CarpBream', 'Aquaticfoods', 341.5, NULL, NULL, 4000, NULL, 16700),
('Carrot', 'Vegetables', NULL, NULL, 6983.33, 300, 1100, 833.333),
('CashewNut', 'Nuts', NULL, NULL, 29725, 47100, 1575, 16050),
('Catfish', 'Aquaticfoods', NULL, NULL, NULL, 4800, NULL, 16000),
('Cauliflower', 'Vegetables', 193.667, NULL, 5150, 300, 830, 1920),
('Cheese', 'MilkProduct', NULL, NULL, 1633.33, 22941.7, 7225.22, 22443.3),
('Chicken', 'AnimalFoods', 47, 1, 939.286, 9285.71, 10.714, 20542.9),
('Chocolate', 'Cocoa', NULL, NULL, 0, 30300, 2864.29, 6160.42),
('Clam', 'Aquaticfoods', 7.5, 2.5, NULL, NULL, NULL, NULL),
('ClawedLobster', 'Aquaticfoods', NULL, NULL, 466.667, 1433.33, NULL, 19000),
('Coconut', 'Fruits', NULL, NULL, 6375, 75550, 3325, 2700),
('CommonMushroom', 'Vegetables', 363, NULL, 2225, 400, 1025, 2700),
('Corn', 'CerealsandCerealProducts', NULL, NULL, 49388.3, 19888.9, 2476.19, 5760),
('Cornbread', 'CerealsandCerealProducts', NULL, NULL, 57650, NULL, 5133.33, 6975),
('Cucumber', 'Gourds', 398.231, NULL, 6983.33, 266.667, 450, 583.333),
('DaikonRadish', 'Vegetables', 214.167, 29, 3425, 100, 575, 800),
('Date', 'Fruits', NULL, NULL, 78100, 500, 3200, 2000),
('Eggplant', 'Vegetables', 267.893, NULL, 1900, 50, 600, 450),
('Eggs', 'AnimalFoods', NULL, NULL, 3076.92, 17453.8, NULL, 22469.2),
('Fig', 'Fruits', NULL, NULL, 47816.7, 1900, 3283.33, 2200),
('FrenchPlantain', 'Fruits', 465, NULL, 30750, 400, 1150, 1300),
('GardenTomato', 'Vegetables', 505.386, NULL, 13281.2, 725, 16681.2, 3412.5),
('Grapes', 'Fruits', 223.167, NULL, 26287.5, 25525, 6637.5, 1150),
('Grouper', 'Aquaticfoods', 483, 27, NULL, NULL, NULL, NULL),
('Guava', 'Fruits', 485.833, NULL, 8550, 500, 2450, 900),
('Hazelnut', 'Nuts', NULL, NULL, 25200, 49300, 4100, 14900),
('HotChocolate', 'Beverage', NULL, NULL, 9893.33, 1125, 400, 2581.5),
('JavaPlum', 'Fruits', 220.875, 34.5, NULL, NULL, NULL, NULL),
('Kale', 'Vegetables', 188.5, NULL, 3700, 750, 1700, 2150),
('Kiwi', 'Fruits', 506.833, NULL, 12250, 800, 1350, 1000),
('Kumquat', 'Fruits', NULL, NULL, 11800, 1500, 2200, 1100),
('Leek', 'Vegetables', 208, NULL, 6600, 400, 1100, 1900),
('Lemon', 'Fruits', 420.6, NULL, 8066.67, 466.667, 1966.67, 800),
('Lettuce', 'Vegetables', 1200.42, NULL, 2600, 250, 725, 1225),
('Lime', 'Fruits', 240.55, NULL, 9100, 200, 1400, 700),
('Liquor', 'Beverage', NULL, NULL, 33912.5, 2762.5, NULL, 900),
('Mango', 'Fruits', NULL, 393.15, 15050, 500, 950, 500),
('Margarine', 'FatsandOils', NULL, NULL, 400, 63783.3, NULL, 583.333),
('Milk', 'MilkProduct', NULL, NULL, 4829.62, 1850, NULL, 2925.91),
('Milk(Human)', 'MilkProduct', 61.667, 29, 6900, 3466.67, NULL, 1600),
('MilkZeroPercet', 'MilkProduct', 33641, 32909, NULL, NULL, NULL, NULL),
('Nutmeg', 'HerbsandSpices', NULL, NULL, 38900, 36300, 10400, 5800),
('Olive', 'Vegetables', NULL, 261.233, 4587.5, 39325, 1312.5, 1050),
('PassionFruit', 'Fruits', 522.917, NULL, 18200, 700, 5200, 2200),
('Pasta', 'CerealsandCerealProducts', NULL, NULL, 50020, 1700, 3015.69, 8567.21),
('Peach', 'Fruits', 829.892, NULL, 34466.7, 533.333, 2866.67, 2133.33),
('Peanut', 'Nuts', NULL, NULL, 10125, 64050, 2875, 18250),
('Pear', 'Fruits', 256.833, NULL, 14750, 250, 1400, 300),
('Persimmon', 'Fruits', 259, NULL, NULL, 300, 2950, 700),
('Pineapple', 'Fruits', NULL, NULL, 12937.5, 275, 637.5, 400),
('PitaBread', 'CerealsandCerealProducts', NULL, NULL, 55466.7, NULL, 3933.33, 9333.33),
('Pomegranate', 'Fruits', NULL, NULL, 16900, 300, 300, 1000),
('Pork', 'AnimalFood', NULL, NULL, 356.173, 12748.1, 4.321, 19192.6),
('Potato', 'Vegetables', NULL, NULL, 50690, 10250, 2380, 4690),
('PotatoBread', 'CerealsandCerealProducts', 718, NULL, 47070, NULL, 6300, 12500),
('PricklyPear', 'Fruits', 220, 56, 7800, 500, 1800, 700),
('Rabbit', 'AnimalFoods', NULL, NULL, NULL, 4000, NULL, 22200),
('Radish', 'Vegetables', 1840.68, 482, NULL, NULL, NULL, NULL),
('RainbowTrout', 'AquaticFoods', 643.667, NULL, NULL, 5000, NULL, 19200),
('RaisinBread', 'CerealsandCerealProducts', NULL, NULL, 53833.3, NULL, 4433.33, 8133.33),
('RedBeetroot', 'Vegetables', 0, NULL, 0, 0, 0, 0),
('RedKingCrab', 'Aquaticfoods', 204, 46, NULL, NULL, NULL, NULL),
('Rice', 'CerealsandCeralProducts', NULL, NULL, 74811.8, 3950, 1935.29, 7455.56),
('RiceBread', 'CerealsandCerealProducts', NULL, NULL, 45400, NULL, 5100, 9300),
('RockPtarmigan', 'AnimalFood', 390, 40, NULL, 2000, NULL, 23500),
('RyeBread', 'CerealsandCerealProducts', NULL, NULL, 45606.7, 3264.71, 3476, 5763),
('Sheep', 'AnimalFoods', NULL, NULL, NULL, 20066.7, NULL, 16888.9),
('Shrimp', 'Aquaticfoods', NULL, NULL, 500, 1133.33, NULL, 19100),
('Snail', 'Aquaticfoods', 254.667, 63.333, 2000, 1000, NULL, 16000),
('SourCream', 'MilkProduct', 212, 141, 66630, NULL, NULL, 2400),
('Spinach', 'Vegetables', 827.086, NULL, 2175, 550, 975, 2350),
('Strawberry', 'Fruits', 94.75, NULL, 25950, 387.5, 537.5, 475),
('Sturgeon', 'Aquaticfoods', NULL, NULL, 3250, 9850, NULL, 11000),
('SweetPotato', 'Vegetables', 825.86, NULL, 15233.3, 266.667, 1066.67, 1533.33),
('TacoShell', 'CeralsandCeralproducts', NULL, NULL, 62560, NULL, 6050, 7140),
('Tofu', 'Soy', NULL, NULL, 1766.67, 4200, 533.333, 7900),
('TostadaShell', 'CerealsandCerealProducts', 237, NULL, 64430, NULL, 5800, 6150),
('Turkey', 'AnimalFoods', NULL, NULL, NULL, 3900, 55.556, 21622),
('VegetableJuice', 'Beverage', 193, 16, 10050, 400, 850, 2100),
('Vermouth', 'Beverage', 34.5, 6.5, 9850, NULL, NULL, 50),
('Vodka', 'Beverage', 1, NULL, NULL, NULL, NULL, NULL),
('Watermelon', 'Gourds', NULL, NULL, 8350, 100, 250, 800),
('Wheat', 'CerealsandCerealProducts', NULL, NULL, 57142.9, 18271.4, 0, 11271.4),
('Wheatbread', 'CerealsandCerealProducts', NULL, NULL, 49928.1, 3168.42, 2855.56, 7502.81),
('Whisky', 'Beverage', NULL, NULL, 100, NULL, NULL, NULL),
('Yam', 'Vegetables', 724.667, 113.333, 25850, 200, 2050, 1500),
('Yogurt', 'MilkProduct', 33, 30, 22882.6, 2920, 309.677, 2622.38);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fooditems`
--
ALTER TABLE `fooditems`
  ADD PRIMARY KEY (`foodItemName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
