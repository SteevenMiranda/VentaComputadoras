-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.5.4-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para computadoras
CREATE DATABASE IF NOT EXISTS `computadoras` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `computadoras`;

-- Volcando estructura para tabla computadoras.registro
CREATE TABLE IF NOT EXISTS `registro` (
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Cedula` int(11) DEFAULT NULL,
  `Marca` varchar(50) DEFAULT NULL,
  `Modelo` varchar(50) DEFAULT NULL,
  `Costo` double(22,0) DEFAULT NULL,
  `Categoria` varchar(50) DEFAULT NULL,
  `Tipo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla computadoras.registro: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
INSERT INTO `registro` (`Nombre`, `Apellido`, `Cedula`, `Marca`, `Modelo`, `Costo`, `Categoria`, `Tipo`) VALUES
	('Jose', 'Aroca', 123, 'Asus', 'LTA150', 200, 'Laptop', 'Nuevo'),
	('Luis', 'Coronel', 321, 'HP', 'xTAx', 322, 'Netbook', 'Nuevo');
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
