/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package fravemax.Vistas;

import fravemax.AccesoADatos.ProductoData;
import fravemax.Entidades.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Productos_Vista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int Columna) {
            return false;
        }
    };

    private ArrayList<Producto> listaP;
    ProductoData pData = new ProductoData();
    
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

        jCproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCproductosActionPerformed(evt);
            }
        });

        jBbuscar.setText("Buscar");
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

        jLabel1.setText("Productos");

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBsalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jCproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBbuscar))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBsalir)
                .addContainerGap(8, Short.MAX_VALUE))
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

    private void cargarBox() {
        for (Producto producto : listaP) {
            jCproductos.addItem(producto.getNombreProducto());
        }
    }

    private void armarCabecera() {
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jTtabla.setModel(modelo);
    }

    
    private void CargaProductos(){        
           // Obtener el nombre del producto seleccionado en el JComboBox
    String nombreProductoSeleccionado = (String) jCproductos.getSelectedItem();
    // Borrar las filas existentes en la tabla
    borrarFilasTabla();
    // Recorrer la lista de productos y agregar los productos correspondientes a la tabla
    for (Producto producto : listaP) {
        if (producto.getNombreProducto().equals(nombreProductoSeleccionado)) {
            modelo.addRow(new Object[]{producto.getDescripcion(), producto.getPrecioActual(), producto.getStock()});
        }
    }
}
//Con estos cambios, la tabla debería cargarse correctamente con los productos correspondientes cuando hagas clic en el botón "Buscar". Asegúrate de que los nombres de los productos en el JComboBox coincidan exactamente con los nombres en tu lista de productos. 
//    Producto selec = (Producto) jCproductos.getSelectedItem();
//    listaP = (ArrayList<Producto>) pData.ListarProducto();
//        for (Producto producto : listaP) {
//            modelo.addRow(new Object[]{producto.getDescripcion(),producto.getPrecioActual(),producto.getStock()});
//        }
//        
//        
//    }    
    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() -1;   
        for (int i = indice; i>=0; i--){
             modelo.removeRow(i);
        }   
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCproductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables
}
