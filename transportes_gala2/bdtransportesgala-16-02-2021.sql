-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.17 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping structure for table bdtransportesgala.carros
CREATE TABLE IF NOT EXISTS `carros` (
  `idcarro` int(10) NOT NULL AUTO_INCREMENT,
  `placa` varchar(50) NOT NULL DEFAULT '0',
  `marca` varchar(50) NOT NULL DEFAULT '0',
  `version` varchar(50) NOT NULL DEFAULT '0',
  `modelo` varchar(50) NOT NULL DEFAULT '0',
  `color` varchar(50) NOT NULL DEFAULT '0',
  `numpuertas` int(11) NOT NULL DEFAULT '0',
  `tipocombustible` varchar(50) NOT NULL DEFAULT '0',
  `cilindraje` int(11) NOT NULL DEFAULT '0',
  `puestos` int(11) NOT NULL DEFAULT '0',
  `valor` double NOT NULL DEFAULT '0',
  `idchofer` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idcarro`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table bdtransportesgala.carros: ~0 rows (approximately)
/*!40000 ALTER TABLE `carros` DISABLE KEYS */;
INSERT INTO `carros` (`idcarro`, `placa`, `marca`, `version`, `modelo`, `color`, `numpuertas`, `tipocombustible`, `cilindraje`, `puestos`, `valor`, `idchofer`) VALUES
	(1, 'CTA', 'DAEWOO', '1', '1', '1', 1, '1', 1, 1, 25000000, 1),
	(2, 'BOG', 'DAEWOO', '2', '2', '2', 2, '2', 2, 2, 23000000, 2),
	(3, 'UBT', '2', '2', '2', '2', 2, '2', 2, 2, 2, 2),
	(4, '23', '23', '3', '3', '3', 3, '23', 3, 3, 3, 3);
/*!40000 ALTER TABLE `carros` ENABLE KEYS */;

-- Dumping structure for table bdtransportesgala.choferes
CREATE TABLE IF NOT EXISTS `choferes` (
  `idchofer` int(11) NOT NULL AUTO_INCREMENT,
  `cc` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `genero` varchar(50) DEFAULT NULL,
  `fechanacimiento` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idchofer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table bdtransportesgala.choferes: ~0 rows (approximately)
/*!40000 ALTER TABLE `choferes` DISABLE KEYS */;
/*!40000 ALTER TABLE `choferes` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
