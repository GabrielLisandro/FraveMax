
package fravemax.Vistas;

import fravemax.AccesoADatos.ClienteData;
import fravemax.Entidades.Cliente;
import javax.swing.JOptionPane;


public class ClienteV extends javax.swing.JInternalFrame {
ClienteData clieData = new ClienteData();
    Cliente buscClie = new Cliente();
 
    public ClienteV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTdomicilio = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        jLabel1.setText("DATOS DEL CLIENTE");

        jLabel2.setText("DNI");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("APELLIDO:");

        jLabel5.setText("DOMICILIO:");

        jLabel6.setText("TELEFONO:");

        jTdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdniActionPerformed(evt);
            }
        });

        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBguardar.setText("GUARDAR");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBmodificar.setText("MODIFICAR");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBeliminar.setText("ELIMINAR");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBguardar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(89, 89, 89))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4))
                                            .addGap(76, 76, 76)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel2))
                                            .addComponent(jLabel6))
                                        .addGap(85, 85, 85)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jBbuscar))
                                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBmodificar)
                                .addGap(59, 59, 59)
                                .addComponent(jBeliminar)
                                .addGap(48, 48, 48)
                                .addComponent(jBsalir)))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jBmodificar)
                    .addComponent(jBeliminar)
                    .addComponent(jBsalir))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
       try {
    int dni = Integer.parseInt(jTdni.getText());
    String nombre = jTnombre.getText();
    String apellido = jTapellido.getText();
    String domicilio = jTdomicilio.getText();
    String telefono = jTtelefono.getText();

    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe completar el campo Nombre");
    } else if (!nombre.matches("^[A-Za-z]+$")) {
        JOptionPane.showMessageDialog(this, "El campo Nombre solo debe contener letras.");
    } else if (apellido.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe completar el campo Apellido");
    } else if (!apellido.matches("^[A-Za-z]+$")) {
        JOptionPane.showMessageDialog(this, "El campo Apellido solo debe contener letras.");
    } else if (domicilio.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe completar el campo Domicilio");
    } else if (telefono.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe completar el campo Teléfono");
    } else if (!telefono.matches("^[0-9+]+$")) {
        JOptionPane.showMessageDialog(this, "El campo Teléfono solo debe contener números.");
    } else {
        // Si todas las validaciones pasan, realiza la modificación
        buscClie.setDni(dni);
        buscClie.setNombre(nombre);
        buscClie.setApellido(apellido);
        buscClie.setDomicilio(domicilio);
        buscClie.setTelefono(telefono);

        clieData.modificarCliente(buscClie);

        limpiarCampos();

        buscClie = null;
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error: No se pudo realizar la modificación");
}
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
      dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try {
            String dni = jTdni.getText();
            String nombre = jTnombre.getText();
            String apellido = jTapellido.getText();
            String domicilio = jTdomicilio.getText();
            String telefono = jTtelefono.getText();

            Cliente cli = new Cliente();

            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo DNI");

            } else if (dni.matches("\\d{8}") || dni.matches("\\d{9}")) {
                int dni1 = Integer.parseInt(dni); 
                cli.setDni(dni1);

            } else {
                JOptionPane.showMessageDialog(null, "El DNI no es válido o contiene letras.");
                return;
            }

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Nombre");
            } else if (!nombre.matches("^[A-Za-z]+$")) {
                JOptionPane.showMessageDialog(null, "El campo Nombre solo debe contener letras.");
            return;
            } else {
                cli.setNombre(nombre);
            }

            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Apellido");
            } else if (!apellido.matches("^[A-Za-z]+$")) {
                JOptionPane.showMessageDialog(null, "El campo Apellido solo debe contener letras.");
            return;
            } else {
                cli.setApellido(apellido);
            }
            if (domicilio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Domicilio");
            return;
            } else {
                cli.setDomicilio(domicilio);

            }
            if (telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Teléfono");
            } else if (!telefono.matches("^[0-9+]+$")) {
                JOptionPane.showMessageDialog(null, "El campo Teléfono solo debe contener números.");
           return;
            } else {
                cli.setTelefono(telefono);
            }
            clieData.agregarCliente(cli);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error al Ingresar el Cliente ");
        }
        limpiarCampos();
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
         try {
            buscClie = clieData.buscarClienteDni(Integer.parseInt(jTdni.getText()));
            jTnombre.setText(buscClie.getNombre());
            jTapellido.setText(buscClie.getApellido());
            jTdomicilio.setText(buscClie.getDomicilio());
            jTtelefono.setText(buscClie.getTelefono());
        } catch (NumberFormatException e) {
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Controle que los campos sean los correctos o que no esten vacios");
            buscClie = null;
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
       try {
            int dni = Integer.parseInt(jTdni.getText());

            if (jTdni.getText() != null) {
                clieData.eliminarCliente(dni);
}
            limpiarCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar el Cliente");
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

     public void limpiarCampos() {

        jTdni.setText("");
        jTnombre.setText("");
        jTapellido.setText("");
        jTdomicilio.setText("");
        jTtelefono.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTdomicilio;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    // End of variables declaration//GEN-END:variables
}
