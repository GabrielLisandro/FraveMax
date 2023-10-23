
package fravemax.Vistas;

import fravemax.AccesoADatos.ProductoData;
import fravemax.Entidades.Producto;
import javax.swing.JOptionPane;


public class AgregarProducto extends javax.swing.JInternalFrame {

    ProductoData prodat = new ProductoData();
    
            
    
    
    
    
    
    public AgregarProducto() {
        initComponents();
        
        
        
        
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTproducto = new javax.swing.JTextField();
        jTdescripcion = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        jTstock = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jLabel1.setText("PRODUCTO:");

        jLabel2.setText("DESCRIPCION:");

        jLabel3.setText("PRECIO ACTUAL:");

        jLabel4.setText("STOCK:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("AGREGAR PRODUCTOS");

        jTproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTproductoActionPerformed(evt);
            }
        });

        jTprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTprecioActionPerformed(evt);
            }
        });

        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTstock, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jTprecio)
                            .addComponent(jTdescripcion)
                            .addComponent(jTproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel5)))))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jBGuardar)
                .addGap(27, 27, 27)
                .addComponent(jBSalir)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTproductoActionPerformed

    private void jTprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTprecioActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
       
        try {
            
       
        String producto = jTproducto.getText();
        String descrip = jTdescripcion.getText();
        String precio = jTprecio.getText();
        String stock = jTstock.getText();
        
        Producto prod = new Producto();
        
         if (producto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Producto");
          return;
         } else {
               prod.setNombreProducto(producto);
         }
               
        if (descrip.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Descripcion");
         return;   
        } else {
               prod.setDescripcion(descrip);
        }
               
        if (precio.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Precio");
        return;   
        } else if (precio.matches ("\\d+(\\.\\d+)?")) {
        double pc = Double.parseDouble(precio);
           
             prod.setPrecioActual(pc);
                    
            }
             
        else {
              JOptionPane.showMessageDialog(null, "En el campo Precio debe ingresar solo numeros");
              return; 
        }
        
         if (stock.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el campo Stock");
         return;   
         }
         else if (stock.matches("\\d+")) {
                 int st = Integer.parseInt(stock);
                prod.setStock(st);
            
         }
         
         else {
              
                JOptionPane.showMessageDialog(null, "En el campo Stock debe ingresar solo numeros");
        return;
         }
        
        prodat.agregarProducto(prod);
        
         } catch (Exception e) {
                  JOptionPane.showMessageDialog(null, "Error al ingresar el producto");
         
         }
        
        
        limpiarCampos();
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    public void limpiarCampos() {
        
        jTproducto.setText("");
        jTdescripcion.setText("");
        jTprecio.setText("");
        jTstock.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTdescripcion;
    private javax.swing.JTextField jTprecio;
    private javax.swing.JTextField jTproducto;
    private javax.swing.JTextField jTstock;
    // End of variables declaration//GEN-END:variables
}
