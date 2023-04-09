package Ventanas;

import Clases.RegistroComputadoras;
import ManejoArchivos.CrearArchivoTexto;
import ManejoArchivos.DemostracionFile;
import ManejoArchivos.LeerArchivoTexto;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Archivos extends javax.swing.JFrame {
    CrearArchivoTexto archivo = new CrearArchivoTexto();

    public Archivos() {
        initComponents();
        archivo.abrirArchivo();
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblregistro = new javax.swing.JLabel();
        lblruta = new javax.swing.JLabel();
        lblpropiedades = new javax.swing.JLabel();
        lblcrear = new javax.swing.JLabel();
        txtruta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areapropiedades = new javax.swing.JTextArea();
        btncomprobar = new javax.swing.JButton();
        lblnumero = new javax.swing.JLabel();
        lblmarca = new javax.swing.JLabel();
        lblmodelo = new javax.swing.JLabel();
        lblcosto = new javax.swing.JLabel();
        lblstock = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblarchivo = new javax.swing.JTable();
        btnagregar = new javax.swing.JButton();
        btnarchivo = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblregistro.setFont(new java.awt.Font("Constantia", 3, 20)); // NOI18N
        lblregistro.setText("Registro De Computadoras");

        lblruta.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblruta.setText("Ingrese la ruta del directorio:");

        lblpropiedades.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblpropiedades.setText("Propiedades del directorio:");

        lblcrear.setFont(new java.awt.Font("Constantia", 3, 20)); // NOI18N
        lblcrear.setText("Crear Archivos");

        areapropiedades.setColumns(20);
        areapropiedades.setRows(5);
        jScrollPane1.setViewportView(areapropiedades);

        btncomprobar.setText("Comprobar");
        btncomprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomprobarActionPerformed(evt);
            }
        });

        lblnumero.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblnumero.setText("Numero:");

        lblmarca.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblmarca.setText("Marca:");

        lblmodelo.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblmodelo.setText("Modelo:");

        lblcosto.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblcosto.setText("Costo:");

        lblstock.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblstock.setText("Stock:");

        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeroKeyTyped(evt);
            }
        });

        txtmarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmarcaKeyTyped(evt);
            }
        });

        txtmodelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmodeloKeyTyped(evt);
            }
        });

        txtcosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcostoKeyTyped(evt);
            }
        });

        txtstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstockKeyTyped(evt);
            }
        });

        tblarchivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Marca", "Modelo", "Costo", "Stock"
            }
        ));
        jScrollPane2.setViewportView(tblarchivo);

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnarchivo.setText("Abrir Archivo");
        btnarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarchivoActionPerformed(evt);
            }
        });

        btncerrar.setText("Cerrar Archivo");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar Tabla");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnlistar.setText("Listar Archivo");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblregistro)
                                .addGap(390, 390, 390))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblcrear)
                                .addGap(455, 455, 455))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addGap(27, 27, 27)
                                .addComponent(btnarchivo)
                                .addGap(18, 18, 18)
                                .addComponent(btncerrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnlistar)
                                .addGap(18, 18, 18)
                                .addComponent(btnlimpiar)
                                .addGap(148, 148, 148)
                                .addComponent(btnsalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblruta)
                                    .addComponent(lblpropiedades))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtruta)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btncomprobar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblcosto)
                                            .addComponent(lblmodelo)
                                            .addComponent(lblstock))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtstock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                                .addComponent(txtcosto, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblmarca)
                                            .addComponent(lblnumero))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblregistro)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblruta)
                    .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncomprobar))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpropiedades))
                .addGap(18, 18, 18)
                .addComponent(lblcrear)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnumero)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmarca)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmodelo)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcosto)
                            .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblstock)
                            .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncerrar)
                    .addComponent(btnlimpiar)
                    .addComponent(btnagregar)
                    .addComponent(btnarchivo)
                    .addComponent(btnlistar)
                    .addComponent(btnsalir))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblarchivo.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btncomprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprobarActionPerformed
        DemostracionFile aplicacion = new DemostracionFile();
        String datos = aplicacion.analizarRuta(txtruta.getText());
        areapropiedades.setText(datos);
    }//GEN-LAST:event_btncomprobarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (!validar()) {
            archivo.agregarRegistros(Integer.parseInt(txtnumero.getText()),
                    txtmarca.getText(), txtmodelo.getText(),
                    Double.parseDouble(txtcosto.getText()),
                    Integer.parseInt(txtstock.getText()));
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los datos");
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarchivoActionPerformed
        try {
            String url = "C:\\Users\\Jose\\Documents\\NetBeansProjects\\VentaComputadoras\\Computadoras.txt";
            ProcessBuilder p = new ProcessBuilder();
            p.command("cmd.exe", "/c", url);
            p.start();
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnarchivoActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        archivo.cerrarArchivo();
        btnagregar.setEnabled(false);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        LeerArchivoTexto lectura = new LeerArchivoTexto();
        lectura.abrirArchivo();
        ArrayList<RegistroComputadoras> compu = lectura.leerRegistros();
        lectura.cerrarArchivo();
        DefaultTableModel modelo = (DefaultTableModel) tblarchivo.getModel();

        modelo.getDataVector().clear();
        tblarchivo.updateUI();

        for (RegistroComputadoras registro : compu) {
            Object[] fila = {registro.obtenerNumero(), registro.obtenerMarca(),
                registro.obtenerModelo(), registro.obtenerCosto(), registro.obtenerStock()};
            modelo.addRow(fila);

        }
    }//GEN-LAST:event_btnlistarActionPerformed

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumeroKeyTyped

    private void txtmarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarcaKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmarcaKeyTyped

    private void txtmodeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodeloKeyTyped

    }//GEN-LAST:event_txtmodeloKeyTyped

    private void txtcostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcostoKeyTyped

    private void txtstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtstockKeyTyped

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private boolean validar() {
        boolean vacio = false;
        if (txtnumero.getText().equals("")) {
            vacio = true;
        } else if (txtmarca.getText().equals("")) {
            vacio = true;
        } else if (txtmodelo.getText().equals("")) {
            vacio = true;
        } else if (txtcosto.getText().equals("")) {
            vacio = true;
        }
        if (txtstock.getText().equals("")) {
            vacio = true;
        }
        return vacio;
    }

    public void Limpiar() {
        txtnumero.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtcosto.setText("");
        txtstock.setText("");
    }

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
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areapropiedades;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnarchivo;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btncomprobar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcosto;
    private javax.swing.JLabel lblcrear;
    private javax.swing.JLabel lblmarca;
    private javax.swing.JLabel lblmodelo;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblpropiedades;
    private javax.swing.JLabel lblregistro;
    private javax.swing.JLabel lblruta;
    private javax.swing.JLabel lblstock;
    private javax.swing.JTable tblarchivo;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtruta;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
