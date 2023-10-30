package fravemax.Vistas;

import fravemax.AccesoADatos.ClienteData;
import fravemax.AccesoADatos.DetalleVentaData;
import fravemax.AccesoADatos.ProductoData;
import fravemax.AccesoADatos.VentaData;
import fravemax.Entidades.Cliente;
import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
import fravemax.Entidades.Venta;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class Venta_Vista extends javax.swing.JInternalFrame {

    ClienteData clieData = new ClienteData();
    Cliente buscClie = new Cliente();
    Producto producto = new Producto();
    Date fecha = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private ArrayList<Producto> listaP;
    ProductoData pData = new ProductoData();
    DetalleVentaData dv = new DetalleVentaData();
    VentaData vf = new VentaData();

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int Columna) {
            return false;
        }
    };

    public Venta_Vista() {
        initComponents();

        listaP = (ArrayList<Producto>) pData.ListarProducto();
        cargarBox();

        armarCabecera();

        jTFecha.setText(sdf.format(fecha));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtablaVenta = new javax.swing.JTable();
        jBagregar = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTPrecioTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jTcliente = new javax.swing.JTextField();
        jCproducto = new javax.swing.JComboBox<>();
        jBGuardar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();

        jTFecha.setEditable(false);
        jTFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFechaActionPerformed(evt);
            }
        });

        jLabel1.setText("FECHA:");

        jTDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDniActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI:");

        jLabel3.setText("PRODUCTO:");

        jTtablaVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jTtablaVenta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTtablaVentaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTtablaVenta);

        jBagregar.setText("AGREGAR");
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });

        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("INGRESO DE VENTA");

        jLabel5.setText("TOTAL:");

        jTPrecioTotal.setEditable(false);
        jTPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPrecioTotalActionPerformed(evt);
            }
        });

        jLabel6.setText("CLIENTE: ");

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBlimpiar.setText("LIMPIAR");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jTcliente.setEditable(false);

        jCproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCproductoActionPerformed(evt);
            }
        });

        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBeliminar.setText("ELIMINAR ");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jBbuscar)
                                                .addGap(0, 3, Short.MAX_VALUE))
                                            .addComponent(jTcliente)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCproducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBagregar)
                                        .addGap(21, 21, 21)))))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBagregar)
                    .addComponent(jLabel3)
                    .addComponent(jCproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBlimpiar)
                    .addComponent(jBGuardar)
                    .addComponent(jBeliminar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDniActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        try {
            String dni = jTDni.getText();

            if (dni.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los Campos ya estan Limpios");
            } else {
                limpiarCampos();
                borrarFilasTabla();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Limpiar Campos");
        }
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        jBbuscar.setSelected(true);
        CargaProductos();
        jBbuscar.setEnabled(true);
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        int dni = Integer.parseInt(jTDni.getText());
        buscClie = clieData.buscarClienteDni(dni);

        if (buscClie != null) {
            String nombre = buscClie.getApellido() + " " + buscClie.getNombre();
            jTcliente.setText(nombre);
            int idClie = buscClie.getIdCliente();
        } else {
            buscClie = null;
        }


    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFechaActionPerformed
        jTFecha.setEditable(false);

    }//GEN-LAST:event_jTFechaActionPerformed

    private void jTPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPrecioTotalActionPerformed

    }//GEN-LAST:event_jTPrecioTotalActionPerformed

    private Producto productoSeleccionado;

    private void jCproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCproductoActionPerformed
        String nombreProductoSeleccionado = (String) jCproducto.getSelectedItem();
        for (Producto p : listaP) {
            if (p.getNombreProducto().equals(nombreProductoSeleccionado)) {
                productoSeleccionado = p;
                break;
            }
        }
    }//GEN-LAST:event_jCproductoActionPerformed

    private void jTtablaVentaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTtablaVentaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtablaVentaAncestorAdded

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed

        borrarFilaSelec();
    }//GEN-LAST:event_jBeliminarActionPerformed


    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        int filas = jTtablaVenta.getSelectedRow();
        if (filas != -1) {
            int j = jTtablaVenta.getSelectedRow();
            int idVe = Integer.parseInt(jTtablaVenta.getModel().getValueAt(j, 0).toString());
            String prod = jTtablaVenta.getModel().getValueAt(j, 1).toString();
            double precio = Double.parseDouble(jTtablaVenta.getModel().getValueAt(j, 2).toString());
            int cant = Integer.parseInt(jTtablaVenta.getModel().getValueAt(j, 3).toString());
            double precioTo = Double.parseDouble(jTtablaVenta.getModel().getValueAt(j, 4).toString());
            int idPro = productoSeleccionado.getIdProducto();
            System.out.println(idPro);
            int idCli = buscClie.getIdCliente();
            LocalDate fech = LocalDate.now();
            //guardar venta de venta data
            vf.guardarVenta(idVe, idCli, fech);
            //guardar detalle de venta
            dv.guardarVenta(cant, idVe, precio, idPro, precioTo);
            // JOptionPane.showMessageDialog(this, "Venta guardada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila antes de guardar la venta.");
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }

    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void armarCabecera() {
        modelo.addColumn("ID VENTA");
        modelo.addColumn("PRODUCTO");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO TOTAL");
        jTtablaVenta.setModel(modelo);
    }

    private void limpiarCampos() {
        jTDni.setText("");
        jTcliente.setText("");
    }

    private void cargarBox() {

        for (Producto producto : listaP) {
            jCproducto.addItem(producto.getNombreProducto());
        }

    }
    private double precioTotal = 0.0;

    private void CargaProductos() {
        // Obtener el nombre del producto seleccionado en el JComboBox
        String nombreProductoSeleccionado = (String) jCproducto.getSelectedItem();
        int idVenta = vf.proximaVenta();
        // Recorrer la lista de productos y agregar los productos correspondientes a la tabla
        for (Producto producto : listaP) {
            if (producto.getNombreProducto().equals(nombreProductoSeleccionado)) {
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));
                double precioUnitario = producto.getPrecioActual();
                double totalPorProducto = cantidad * precioUnitario;
                modelo.addRow(new Object[]{idVenta, producto.getNombreProducto(), precioUnitario, cantidad, totalPorProducto});
                precioTotal += totalPorProducto; // Actualizar el precio total
                jTPrecioTotal.setText(String.valueOf(precioTotal)); // Actualizar el JTPrecioTotal del precio total
            }
        }
        int idpro = producto.getIdProducto();
    }

    private double calcularSumaTotal() {
        double sumaTotal = 0.0;
        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            double precioTotalPorFila = (double) modelo.getValueAt(fila, 3); // 3 es el índice de la columna "Precio Total"
            sumaTotal += precioTotalPorFila;
        }
        return sumaTotal;
    }

    private void borrarFilaSelec() {

        int fila = jTtablaVenta.getSelectedRow();
        if (fila != -1) {
            int i = jTtablaVenta.getSelectedRow();
            modelo.removeRow(i);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JComboBox<String> jCproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTFecha;
    private javax.swing.JTextField jTPrecioTotal;
    private javax.swing.JTextField jTcliente;
    private javax.swing.JTable jTtablaVenta;
    // End of variables declaration//GEN-END:variables

}
