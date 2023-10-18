/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package fravemax.Vistas;

import fravemax.AccesoADatos.ClienteData;
import fravemax.Entidades.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ClienteVista extends javax.swing.JInternalFrame {

        ClienteData clieData = new ClienteData();
        
    
    public ClienteVista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jTdomicilio = new javax.swing.JTextField();

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar");

        jBbuscar.setText("Buscar");

        jBeliminar.setText("Eliminar");

        jLabel1.setText("Apellido");

        jLabel2.setText("Nombre");

        jLabel3.setText("DNI");

        jLabel4.setText("Domicilio");

        jLabel5.setText("Telefono");

        jTdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTdomicilio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTnombre))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTapellido))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBsalir)
                            .addGap(76, 76, 76)
                            .addComponent(jBguardar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTtelefono)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jBbuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBmodificar)
                        .addGap(76, 76, 76)
                        .addComponent(jBeliminar)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBmodificar)
                    .addComponent(jBguardar)
                    .addComponent(jBeliminar)
                    .addComponent(jBsalir))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

        dispose();


    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniActionPerformed


    }//GEN-LAST:event_jTdniActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try {
            String dni = jTdni.getText();
            String nombre = jTnombre.getText();
            String apellido = jTapellido.getText();
            String domicilio = jTdomicilio.getText();
            String telefono = jTtelefono.getText();

            Cliente cli = new Cliente();
            
            if (dni.isEmpty()) {
//                String dniStr = String.valueOf(jTdni);
                JOptionPane.showMessageDialog(null, "Debe completar el campo DNI");

            }else if (dni.matches("\\d{8}") || dni.matches("\\d{9}")) {
                    int dni1 = Integer.parseInt(dni);  
                    System.out.println("El DNI es válido y no contiene letras.");
                    cli.setDni(dni1);
                   
                } else {
                    System.out.println("El DNI no es válido o contiene letras.");
                }
                   
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Nombre");
                }else{
                    cli.setNombre(nombre);

            }
            if (apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Apellido");
                }else{
                    cli.setApellido(apellido);

            }
            if (domicilio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Domicilio");
                }else{
                    cli.setDomicilio(domicilio);

            }
            if (telefono.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Telefono");
                }else{
                    cli.setTelefono(telefono);

            }
            clieData.agregarCliente(cli);
            
            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, " Error al Ingresar el Cliente ");
            }
        
            limpiarCampos();
    }//GEN-LAST:event_jBguardarActionPerformed

    
    public void limpiarCampos(){
    
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
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTdomicilio;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    // End of variables declaration//GEN-END:variables
}
