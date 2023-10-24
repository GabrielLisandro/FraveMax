
package fravemax.Vistas;

import fravemax.AccesoADatos.ProductoData;
import fravemax.Entidades.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos_Vista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int Columna) {
            return true;
        }
    };

    private ArrayList<Producto> listaP;
    ProductoData pData = new ProductoData();
    Producto prod = new Producto();
       
    public Productos_Vista() {
        initComponents();
        listaP = (ArrayList<Producto>) pData.ListarProducto();
        
        cargarBox();
        armarCabecera();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCproductos = new javax.swing.JComboBox<>();
        jBbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jBguarCam = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jCproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCproductosActionPerformed(evt);
            }
        });

        jBbuscar.setText("BUSCAR");
        jBbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBbuscarMouseClicked(evt);
            }
        });
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jTtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTtabla.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTtablaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTtabla);

        jLabel1.setText("PRODUCTO:");

        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBguarCam.setText("GUARDAR CAMBIOS");
        jBguarCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguarCamActionPerformed(evt);
            }
        });

        jBeliminar.setText("ELIMINAR");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("BUSCAR PRODUCTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBguarCam)
                                .addGap(111, 111, 111)
                                .addComponent(jBeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBsalir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jCproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBbuscar)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(226, 226, 226))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBguarCam)
                    .addComponent(jBeliminar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCproductosActionPerformed
    }//GEN-LAST:event_jCproductosActionPerformed

    private void jTtablaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTtablaAncestorAdded
    }//GEN-LAST:event_jTtablaAncestorAdded

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        borrarFilasTabla();
        jBbuscar.setSelected(true);
        CargaProductos();
        jBbuscar.setEnabled(true);   
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBbuscarMouseClicked

    }//GEN-LAST:event_jBbuscarMouseClicked

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBguarCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguarCamActionPerformed
        
        int fila = jTtabla.getSelectedRow();
            if (fila != -1) {
 
                int i = jTtabla.getSelectedRow();
                String producto = jTtabla.getModel().getValueAt(i, 0).toString();
                String descrip = jTtabla.getModel().getValueAt(i, 1).toString();
                String precio = jTtabla.getModel().getValueAt(i, 2).toString();
                String stock = jTtabla.getModel().getValueAt(i, 3).toString();
         
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
            
         }else {
              
                JOptionPane.showMessageDialog(null, "En el campo Stock debe ingresar solo numeros");
        return;
         }
        
         pData.modificarProducto(prod);
        
            }else{
            JOptionPane.showMessageDialog(null, "Error al modificar el Producto");
            }
        borrarFilasTabla();
    }//GEN-LAST:event_jBguarCamActionPerformed

    
    private void cargarBox() {
        for (Producto producto : listaP) {
            jCproductos.addItem(producto.getNombreProducto());
        }
    }

    private void armarCabecera() {
        modelo.addColumn("PRODUCTO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO");
        modelo.addColumn("STOCK");
        jTtabla.setModel(modelo);
    }

    
    private void CargaProductos(){        
           // Obtener el nombre del producto seleccionado en el JComboBox
    String nombreProductoSeleccionado = (String) jCproductos.getSelectedItem();
    
    borrarFilasTabla();
    // Recorrer la lista de productos y agregar los productos correspondientes a la tabla
    for (Producto producto : listaP) {
        if (producto.getNombreProducto().equals(nombreProductoSeleccionado)) {
            modelo.addRow(new Object[]{producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
        }
    }
}
   
    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() -1;   
        for (int i = indice; i>=0; i--){
             modelo.removeRow(i);
        }   
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguarCam;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCproductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables
}
