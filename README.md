# FraveMax
Grupi 62, Tema 2
INSERT INTO `cliente` (`idCliente`, `apellido`, `nombre`, `domicilio`, `telefono`) VALUES (NULL, 'Torres', 'Agustina', 'Ruiz 138', '+543815312552'), (NULL, 'Gutierrez', 'Roman', 'Dinamarca 1242', '+543885154766');
INSERT INTO `venta` (`idVenta`, `idCliente`, `fechaVenta`) VALUES (NULL, '1', '2022-10-20'), (NULL, '2', '2023-10-01'), (NULL, '3', '2022-07-11'), (NULL, '4', '2023-04-04'), (NULL, '5', '2013-10-01'), (NULL, '6', '2016-04-19'), (NULL, '7', '2020-05-20'), (NULL, '8', '2021-10-12'), (NULL, '9', '2022-06-14'), (NULL, '10', '2021-12-20'), (NULL, '7', '2021-10-20'), (NULL, '5', '2021-05-04');
![image](https://github.com/GabrielLisandro/FraveMax/assets/141675470/914c1c0c-0f8b-475c-b247-083c88f20442)
String sql = "SELECT v.idVenta, v.idCliente, v.fechaVenta, v.estado, p.idProducto, p.nombre, p.descripcion, p.precio, p.stock, p.estado AS producto_estado, d.idDetalle, d.cantidad, d.precio AS detalle_precio FROM venta v JOIN detalleventa d ON v.idVenta = d.idVenta JOIN producto p ON d.idProducto = p.idProducto WHERE `fechaVenta` BETWEEN '2023-10-01' AND '2023-10-10'";

