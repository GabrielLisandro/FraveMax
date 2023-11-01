
package fravemax.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Menu_Pincipal extends javax.swing.JFrame {

    public Menu_Pincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/fravemax/Utilidades/FONDO.jpg.png"));
        Image miImagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){

                g.drawImage (miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMarticulo = new javax.swing.JMenu();
        jMproductos = new javax.swing.JMenuItem();
        jMagregar = new javax.swing.JMenuItem();
        jMcliente = new javax.swing.JMenu();
        jMAgregarCliente = new javax.swing.JMenuItem();
        jMventa = new javax.swing.JMenu();
        jMCargarVenta = new javax.swing.JMenuItem();
        jMventasXfecha = new javax.swing.JMenu();
        jMsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                escritorioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );

        jMarticulo.setText("| Articulo | ");
        jMarticulo.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N

        jMproductos.setText("PRODUCTOS");
        jMproductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMproductosMouseClicked(evt);
            }
        });
        jMproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMproductosActionPerformed(evt);
            }
        });
        jMarticulo.add(jMproductos);

        jMagregar.setText("AGREGAR PRODUCTO");
        jMagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMagregarActionPerformed(evt);
            }
        });
        jMarticulo.add(jMagregar);

        jMenuBar1.add(jMarticulo);

        jMcliente.setText("| Cliente |");
        jMcliente.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N

        jMAgregarCliente.setText("AGREGAR CLIENTE");
        jMAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAgregarClienteActionPerformed(evt);
            }
        });
        jMcliente.add(jMAgregarCliente);

        jMenuBar1.add(jMcliente);

        jMventa.setText("| Venta |");
        jMventa.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jMventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMventaActionPerformed(evt);
            }
        });

        jMCargarVenta.setText("CARGAR VENTA ");
        jMCargarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCargarVentaActionPerformed(evt);
            }
        });
        jMventa.add(jMCargarVenta);

        jMventasXfecha.setText("VENTAS POR FECHA");
        jMventasXfecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMventasXfechaMouseClicked(evt);
            }
        });
        jMventasXfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMventasXfechaActionPerformed(evt);
            }
        });
        jMventa.add(jMventasXfecha);

        jMenuBar1.add(jMventa);

        jMsalir.setText("| Salir |");
        jMsalir.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jMsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMsalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escritorioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_escritorioAncestorAdded
       
    }//GEN-LAST:event_escritorioAncestorAdded

    private void jMAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAgregarClienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ClienteV bps = new ClienteV();
        bps.setVisible(true);
        escritorio.add(bps);
        escritorio.moveToFront(bps);    }//GEN-LAST:event_jMAgregarClienteActionPerformed

    private void jMCargarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCargarVentaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Venta_Vista ded = new Venta_Vista();
        ded.setVisible(true);
        escritorio.add(ded);
        escritorio.moveToFront(ded);
    }//GEN-LAST:event_jMCargarVentaActionPerformed

    private void jMsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMsalirMouseClicked
    System.exit(0);
    }//GEN-LAST:event_jMsalirMouseClicked

    private void jMproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMproductosActionPerformed
     
        escritorio.removeAll();
        escritorio.repaint();
        Productos_Vista bps = new Productos_Vista();
        bps.setVisible(true);
        escritorio.add(bps);
        escritorio.moveToFront(bps);       
        
    }//GEN-LAST:event_jMproductosActionPerformed

    private void jMproductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMproductosMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        Productos_Vista bps = new Productos_Vista();
        bps.setVisible(true);
        escritorio.add(bps);
        escritorio.moveToFront(bps);       
    }//GEN-LAST:event_jMproductosMouseClicked

    private void jMventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMventaActionPerformed
      
    }//GEN-LAST:event_jMventaActionPerformed

    private void jMagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMagregarActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AgregarProducto pcta = new AgregarProducto();
        pcta.setVisible(true);
        escritorio.add(pcta);
        escritorio.moveToFront(pcta);
    }//GEN-LAST:event_jMagregarActionPerformed

    private void jMventasXfechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMventasXfechaMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        VentaXfecha vxf = new VentaXfecha();
        vxf.setVisible(true);
        escritorio.add(vxf);
        escritorio.moveToFront(vxf);
    }//GEN-LAST:event_jMventasXfechaMouseClicked

    private void jMventasXfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMventasXfechaActionPerformed

    }//GEN-LAST:event_jMventasXfechaActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Pincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Pincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Pincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Pincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Pincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMAgregarCliente;
    private javax.swing.JMenuItem jMCargarVenta;
    private javax.swing.JMenuItem jMagregar;
    private javax.swing.JMenu jMarticulo;
    private javax.swing.JMenu jMcliente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMproductos;
    private javax.swing.JMenu jMsalir;
    private javax.swing.JMenu jMventa;
    private javax.swing.JMenu jMventasXfecha;
    // End of variables declaration//GEN-END:variables
}
