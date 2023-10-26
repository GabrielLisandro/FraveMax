# FraveMax
Grupi 62, Tema 2
INSERT INTO `cliente` (`idCliente`, `apellido`, `nombre`, `domicilio`, `telefono`) VALUES (NULL, 'Torres', 'Agustina', 'Ruiz 138', '+543815312552'), (NULL, 'Gutierrez', 'Roman', 'Dinamarca 1242', '+543885154766');
INSERT INTO `venta` (`idVenta`, `idCliente`, `fechaVenta`) VALUES (NULL, '1', '2022-10-20'), (NULL, '2', '2023-10-01'), (NULL, '3', '2022-07-11'), (NULL, '4', '2023-04-04'), (NULL, '5', '2013-10-01'), (NULL, '6', '2016-04-19'), (NULL, '7', '2020-05-20'), (NULL, '8', '2021-10-12'), (NULL, '9', '2022-06-14'), (NULL, '10', '2021-12-20'), (NULL, '7', '2021-10-20'), (NULL, '5', '2021-05-04');
![image](https://github.com/GabrielLisandro/FraveMax/assets/141675470/914c1c0c-0f8b-475c-b247-083c88f20442)
String sql = "SELECT v.idVenta, v.idCliente, v.fechaVenta, v.estado, p.idProducto, p.nombre, p.descripcion, p.precio, p.stock, p.estado AS producto_estado, d.idDetalle, d.cantidad, d.precio AS detalle_precio FROM venta v JOIN detalleventa d ON v.idVenta = d.idVenta JOIN producto p ON d.idProducto = p.idProducto WHERE `fechaVenta` BETWEEN '2023-10-01' AND '2023-10-10'";

private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            int dni = Integer.parseInt(jTdni.getText());
            String nombre = jTnombre.getText();
            String apellido = jTapellido.getText();
            String domicilio = jTdomicilio.getText();
            String telefono = jTtelefono.getText();

            Cliente cli = new Cliente();
            
            if (jTdni.getText() != null) {
System.out.println("1");
                String dniStr = String.valueOf(jTdni);
System.out.println("2");
                if (jTdni > 7 && jTdni< 9) {
                    System.out.println("El DNI es válido y no contiene letras.");
                    cli.setDni(dni);
                   
                } else {
                    System.out.println(jTdni);
                    cli.setDni(dni);
                    System.out.println("El DNI no es válido o contiene letras.");
                }
                    } else {
                    JOptionPane.showMessageDialog(null, "Debe completar el campo DNI");
                }

//if (jTdni.getText().isEmpty()) {
//    JOptionPane.showMessageDialog(null, "Debe completar el campo DNI");
//} else {
//    String dniStr = jTdni.getText(); // Obtener el valor del campo DNI como una cadena
//    if (dniStr.matches("\\d{8}") || dniStr.matches("\\d{9}")) {
//        int dni = Integer.parseInt(dniStr); 
//// Convertir la cadena a un entero
//        // Ahora puedes usar 'dni' en la inserción a la base de datos
//        System.out.println("El DNI es válido y no contiene letras.");
//    } else {
//        System.out.println("El DNI no es válido o contiene letras.");
//    }
//}

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Nombre");
                }else{
                    cli.setNombre(nombre);
//                    clieData.agregarCliente(cli);
            }
            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Apellido");
                }else{
                    cli.setApellido(apellido);
//                    clieData.agregarCliente(cli);
            }
            if (domicilio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Domicilio");
                }else{
                    cli.setDomicilio(domicilio);
//                    clieData.agregarCliente(cli);
            }
            if (telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Telefono");
                }else{
                    cli.setTelefono(telefono);
//                    clieData.agregarCliente(cli);
            }
            clieData.agregarCliente(cli);
            
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, " Error al Ingresar el Cliente ");
            }
            limpiarCampos();
    }                                
desde aca es detalleventadata
 public void sumaPrecios(int id) {
        try {
            String prec = "SELECT SUM(cantidad * precio) AS precioTotal FROM detalleventa";

            PreparedStatement ps = connection.prepareStatement(prec);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double precioTotal = rs.getDouble("precioTotal");
                System.out.println("Precio total para ID " + id + ": " + precioTotal);
            }
            connection.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la Base de Datos");
        }
en el main dvd.sumaPrecios(1);
