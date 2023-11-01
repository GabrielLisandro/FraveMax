-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2023 a las 18:01:44
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fravemax`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `apellido` varchar(58) NOT NULL,
  `nombre` varchar(58) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` varchar(23) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `DNI` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `apellido`, `nombre`, `domicilio`, `telefono`, `estado`, `DNI`) VALUES
(1, 'Menacho', 'Fernando', 'Batalla de San Chacabuco 1614', '+543815330552', 1, 32412897),
(2, 'Robles', 'Juan', 'Frias Silva 674', '+543885666666', 1, 33457488),
(3, 'Rodriguez', 'Marcelo', 'Florida 733', '+5491134659865', 1, 12895362),
(4, 'Di Ninno', 'Fabricio', 'Rosales 1245', '+5491178956421', 1, 25984125),
(5, 'Madrazo', 'Carolina', 'Jujuy 614', '+54358142754896', 1, 28356941),
(6, 'Theler', 'Jesica', 'Av Gaona 1245', '+5491132758610', 1, 15032985),
(7, 'Carrascosa', 'Luis Francisco', 'Directorio 145', '+543815410552', 1, 6785310),
(8, 'Martinez ', 'Sofia', 'Av Crovara 457', '+5491132457865', 1, 40320145),
(9, 'Robledo', 'Norma', 'Gral Paz 123', '+543814201150', 1, 37225984),
(11, 'Lopez', 'Lucia', 'Guaymallen 123', '+543885300180', 1, 22023689),
(13, 'Martos', 'Rafael', 'Balcarce 568', '+540115963150', 1, 14456892),
(15, 'Montiel', 'Lucas', 'Santiago 825', '+540115523663', 1, 17123665),
(16, 'Miño Juarez', 'Maria Lucila Jacinta', 'Falucho 1825', '+540115784663', 0, 11546457);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE `detalleventa` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `idVenta` int(11) NOT NULL,
  `precio` double NOT NULL,
  `idProducto` int(11) NOT NULL,
  `precioTotal` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`idDetalle`, `cantidad`, `idVenta`, `precio`, `idProducto`, `precioTotal`) VALUES
(1, 1, 1, 1099999, 5, 0),
(2, 1, 2, 657999, 4, 0),
(3, 1, 3, 200000, 2, 0),
(4, 1, 4, 475000, 3, 0),
(5, 1, 5, 820000, 7, 0),
(6, 1, 6, 174628.55, 15, 0),
(7, 1, 7, 17953.64, 17, 0),
(9, 3, 2, 3022005.22, 15, 0),
(10, 3, 4, 3032, 15, 9096),
(11, 3, 2, 3032.1, 1, 6064.2),
(13, 3, 2, 4200.1, 3, 12600.3),
(17, 3, 12, 4200.1, 3, 12600.3),
(29, 1, 24, 249999, 11, 249999),
(32, 1, 26, 18457, 1, 18457),
(37, 1, 30, 18457, 1, 18457);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(58) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `descripcion`, `precio`, `stock`, `estado`) VALUES
(1, 'SMART LED', 'Televisor Smart / Android. Pantalla: TV LED HD. Resolucion de panel: 1366 x 768 p. ', 18457, 10, 1),
(2, 'SMART LED ANDROID TV PHILIPS 43 PULGADAS 4K UHD 43PUD7407/', 'Televisor Smart android. Pantalla: 4K Ultra HD LED. Tamano de pantalla diagonal: 43 pulgadas.  1080p', 200000, 12, 1),
(3, 'CELULAR MOTOROLA EDGE 30 ULTRA / XT2241-2 BLANCO', 'Celular + Cargador Inalambrico 50 W. Pantalla 6.67 \" pOLED FHD + 1080x 2400 Px. Sistema Operativo: A', 47500, 4, 1),
(4, 'CELULAR SAMSUNG GALAXY Z FLIP 5 - SM-F731B LAVENDER', 'Celular. Pantalla de 6.7\" FHD+ (2640 x 1080) Dynamic Amoled 2X / 3.4\" (720 x 748). Super AMOLED. 120', 657999, 6, 1),
(5, 'AIRE ACONDICIONADO SPLIT SAMSUNG AR24BSHQAWK2BG FRIO/CALOR', 'SPLIT FRIO CALOR INVERTER 5850WATTS EQUIVALENTE A 5031 FRIGORÍAS EN FRIO Y 6140 WATTS', 1099999, 2, 1),
(6, 'AIRE ACONDICIONADO SPLIT PHILCO PHS32HA4CN FRIO/CALOR 2838', '-Climatización: Frio Calor\n-Potencia Refrigeración: 3200W\n-Frigorías: 2.838 Fg\n-Hidden Display\n', 379999, 8, 1),
(7, 'NOTEBOOK ASUS VIVOBOOK 15 X1502ZA-EJ194W INTEL CORE I7', 'Color	AZUL\nGarantia	12 meses\nModelo	VIVOBOOK 15 X1502ZA-EJ194W\nOrigen	CHINA\nPeso	1.7\nProfundida', 820000, 5, 1),
(8, 'NOTEBOOK ACER ASPIRE 3 A315-24P-R9AU AMD R5', 'Color	SILVER\nGarantia	12\nModelo	ASPIRE 3 A315-24P-R9AU\nOrigen	CHINA\nPeso	1.78\nProfundidad	23.75', 432999, 4, 1),
(9, 'HELADERA NO FROST WHIRLPOOL WRM56K2 PLATA', 'Heladera No Frost Inverter. Volumen bruto 462 Litros. Volumen neto: 492 Lts. Sistema de enfriamiento', 807999, 6, 1),
(10, 'HELADERA CON FREEZER PHILCO PHCT341X INOXIDABLE', 'Heladera con freezer. Volumen Neto: 326 Lts. Volumen bruto: 340 Lts. Sistema de enfriamiento: Ciclic', 330428.05, 8, 1),
(11, 'LAVARROPAS AUTOMATICO DREAN NEXT 6.06 ECO 6 BLANCO', 'Clase AA. Cap.6 Kg. Display Led. Carga Autoadaptativa. Sist.Autobalance. 29 Alternativas de lavado. ', 249999, 12, 1),
(12, 'LAVARROPAS WHIRLPOOL WNQ90AB 9 BLANCO', 'Lavarropas automatico. Inverter. Capacidad 9 kg. 15 Programas. Eficiencia energetica A++. ', 408499.05, 4, 1),
(13, 'TABLET SAMSUNG GALAXY TAB S9 ULTRA SM-X910 14.6\' 512 GB GR', 'Tablet. Pantalla de 14.6\" (369.9 mm), resolucion 2960x1848 (WQXGA+), Dynamic AMOLED 2X. Procesador S', 1142269, 3, 1),
(14, 'TABLET HDC H7 7\' 16 GB NEGRO', 'Tablet 7\" Multitouch de 5 puntos. Sistema Operativo: Android 10. WiFi IEEE 802.11 b/g/n. Bluetooth. ', 16000, 10, 1),
(15, 'BICICLETA EXER 16276', 'Bicicleta MTB. Rodado 29. Talle 18. 21 Velocidades. Cuadro de aluminio. Frenos a disco mecanico SLP.', 174628.55, 7, 1),
(16, 'BICICLETA MOTOMEL MAXAM 190', 'Bicicleta MTB. Rodado 29. Talle SM. 21 Velocidades. Cuadro de aluminio. Freno a disco mecanico. Pie ', 144754.66, 6, 1),
(17, 'CORTABARBA PHILIPS MG3711/15', 'Color	NEGRO\r\nGarantia	24 MESES\r\nModelo	MG3711/15', 17953.64, 12, 1),
(18, 'CORTABARBA GA.MA. GT 527', 'Cortabarba tipo trimmer. 5 Medidas de corte. 45 Minutos de autonomia. Carga por USB.\r\n\r\n', 13599, 10, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `fechaVenta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `idCliente`, `fechaVenta`) VALUES
(1, 1, '2023-09-23'),
(2, 2, '2023-09-07'),
(3, 3, '2023-10-02'),
(4, 4, '2023-09-14'),
(5, 5, '2023-09-21'),
(6, 6, '2023-09-18'),
(7, 7, '2023-08-31'),
(8, 8, '2023-09-11'),
(9, 4, '2023-10-18'),
(10, 2, '2023-05-22'),
(11, 1, '2023-10-30'),
(12, 1, '2023-10-30'),
(13, 2, '2023-05-22'),
(14, 2, '2023-05-22'),
(15, 2, '2023-10-30'),
(16, 2, '2023-10-30'),
(17, 2, '2023-10-30'),
(18, 2, '2023-10-30'),
(19, 15, '2023-10-30'),
(20, 2, '2023-05-22'),
(21, 15, '2023-10-30'),
(22, 11, '2023-10-30'),
(23, 9, '2023-10-30'),
(24, 7, '2023-10-30'),
(25, 2, '2023-05-22'),
(26, 1, '2023-10-31'),
(27, 2, '2023-05-22'),
(28, 2, '2023-05-22'),
(29, 2, '2023-05-22'),
(30, 5, '2023-11-01'),
(31, 2, '2023-05-22');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- Indices de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `detalleventa_ibfk_1` (`idVenta`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `idCliente` (`idCliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD CONSTRAINT `detalleventa_ibfk_1` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`),
  ADD CONSTRAINT `detalleventa_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
