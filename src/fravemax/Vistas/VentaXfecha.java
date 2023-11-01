
package fravemax.Vistas;

import fravemax.AccesoADatos.VentaData;
import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
import fravemax.Entidades.Venta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentaXfecha extends javax.swing.JInternalFrame {

    private ArrayList<DetalleVenta> listaF;
    VentaData vd = new VentaData();
    Venta busfe = new Venta();
    
    
    
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int Columna) {
            return false;
        }
    };
    
    public VentaXfecha() {
        initComponents();
    
        armarCabecera();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTfecha = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("LISTAR VENTAS POR FECHA");

        jLabel2.setText("FECHA:");

        jTfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfechaActionPerformed(evt);
            }
        });

        jBbuscar.setText("BUSCAR");
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTtabla);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(231, 231, 231))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62)
                        .addComponent(jTfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jBbuscar)
                        .addGap(31, 31, 31))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        try {
             String fecha = jTfecha.getText();
    System.out.println(fecha);
             if(!fecha.isEmpty()){
                LocalDate fechaLd = LocalDate.parse(fecha);
                List <DetalleVenta> Dv = new VentaData().listarXFecha(fechaLd);
    System.out.println(fechaLd);
                 for (DetalleVenta detalleVenta : Dv) {
                     modelo.addRow(new Object[]{detalleVenta.getProducto().getNombreProducto(),detalleVenta.getVenta().getCliente().getApellido()});
                 }
                
             }else{
             throw new RuntimeException("El campo esta Vacío"); 
             
             }
        }catch (DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "Ingrese fecha valida");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
      dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfechaActionPerformed
    }//GEN-LAST:event_jTfechaActionPerformed

        private void armarCabecera() {
        modelo.addColumn("CLIENTE");
        modelo.addColumn("PRODUCTO");
        jTtabla.setModel(modelo);
    }
    
    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() -1;   
        for (int i = indice; i>=0; i--){
             modelo.removeRow(i);
        }   
     }

    private void cargarListado() {
        
        
        
//    // Borrar las filas existentes en la tabla
//    borrarFilasTabla();
//    
//    String fechaSeleccionadaStr = jTfecha.getText();
//        System.out.println(fechaSeleccionadaStr);
//    if (fechaSeleccionadaStr.isEmpty()) {
//        // Manejar el caso en el que no se ingresó una fecha válida
//        JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha válida.");
//        return;
//    }
//
//    try {
//        LocalDate fechaSeleccionada = LocalDate.parse(fechaSeleccionadaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        System.out.println(fechaSeleccionada);
//        System.out.println("Tamaño de listaF: " + listaF.size());
//        for (DetalleVenta venta : listaF) {
//            System.out.println("hol111");
//            if (venta.getFechaVenta().isEqual(fechaSeleccionada)) {
//                System.out.println("entre");
//                Producto producto = obtenerProductoDeVenta(venta);
//                modelo.addRow(new Object[]{venta.getCliente().getApellido(), producto.getNombreProducto()});
//            }
//            System.out.println("-----");
//        }
//    } catch (DateTimeParseException ex) {
//        // Manejar el caso en el que la fecha ingresada no es válida
//        JOptionPane.showMessageDialog(this, "La fecha ingresada no es válida. Utilice el formato 'yyyy-MM-dd'.");
//    }
}

private Producto obtenerProductoDeVenta(Venta venta) {
    // Implementa la lógica para obtener el producto relacionado con la venta.
    // Esto depende de la estructura de tus datos y cómo se almacenan las relaciones entre ventas, detalles de ventas y productos.
    // Asumo que existe un método en la clase Venta para obtener el detalle de venta.
    DetalleVenta detalleVenta = venta.getDetVenta();
    
    if (detalleVenta != null) {
        // Asumo que en el detalle de venta tienes el ID del producto
        int idProducto = detalleVenta.getProducto().getIdProducto();
        return obtenerProductoPorId(idProducto);
    }
    
    return null;
}

private Producto obtenerProductoPorId(int idProducto) {
    // Implementa la lógica para obtener el producto por su ID, por ejemplo, desde una lista de productos.
    // Retorna el producto encontrado o null si no se encuentra.
    // Asegúrate de implementar esta lógica de acuerdo a cómo se almacenan tus datos.
    return null;
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTfecha;
    private javax.swing.JTable jTtabla;
    // End of variables declaration//GEN-END:variables
}
