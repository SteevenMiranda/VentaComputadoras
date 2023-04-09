package Ventanas;

import Clases.Computadora;
import Clases.CrudComputadoras;
import java.awt.Color;
import javax.swing.JOptionPane;

public class VentanaBD extends javax.swing.JFrame {

    public VentanaBD() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngtipo = new javax.swing.ButtonGroup();
        btngcategoria = new javax.swing.ButtonGroup();
        lblregistro = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        lblcedula = new javax.swing.JLabel();
        lblmarca = new javax.swing.JLabel();
        lblmodelo = new javax.swing.JLabel();
        lblcategoria = new javax.swing.JLabel();
        lbltipo = new javax.swing.JLabel();
        lblcosto = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        rdnuevo = new javax.swing.JRadioButton();
        rdusado = new javax.swing.JRadioButton();
        rdreformado = new javax.swing.JRadioButton();
        rdescritorio = new javax.swing.JRadioButton();
        rdlaptop = new javax.swing.JRadioButton();
        rdnetbook = new javax.swing.JRadioButton();
        btnagregar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblregistro.setFont(new java.awt.Font("Constantia", 3, 20)); // NOI18N
        lblregistro.setText("Registro De Computadoras");

        lblnombre.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblnombre.setText("Nombre:");

        lblapellido.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblapellido.setText("Apellido:");

        lblcedula.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblcedula.setText("Cedula:");

        lblmarca.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblmarca.setText("Marca:");

        lblmodelo.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblmodelo.setText("Modelo:");

        lblcategoria.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblcategoria.setText("Categoria:");

        lbltipo.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lbltipo.setText("Tipo:");

        lblcosto.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblcosto.setText("Costo:");

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtmarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmarcaKeyTyped(evt);
            }
        });

        txtcosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcostoKeyTyped(evt);
            }
        });

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        txtmodelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmodeloKeyTyped(evt);
            }
        });

        btngtipo.add(rdnuevo);
        rdnuevo.setSelected(true);
        rdnuevo.setText("Nuevo");

        btngtipo.add(rdusado);
        rdusado.setText("Usado");

        btngtipo.add(rdreformado);
        rdreformado.setText("Reformado");

        btngcategoria.add(rdescritorio);
        rdescritorio.setSelected(true);
        rdescritorio.setText("Escritorio");

        btngcategoria.add(rdlaptop);
        rdlaptop.setText("Laptop");

        btngcategoria.add(rdnetbook);
        rdnetbook.setText("Netbooks");

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcategoria)
                            .addComponent(lbltipo)
                            .addComponent(btnagregar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdescritorio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdlaptop)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdnetbook))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdnuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdusado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdreformado))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnlistar)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnactualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btneliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnombre)
                            .addComponent(lblapellido))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnnuevo)
                .addGap(18, 18, 18)
                .addComponent(btnsalir)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmarca)
                    .addComponent(lblcedula)
                    .addComponent(lblmodelo)
                    .addComponent(lblcosto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblregistro)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblregistro)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapellido)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblcedula)
                        .addGap(18, 18, 18)
                        .addComponent(lblmarca)
                        .addGap(27, 27, 27)
                        .addComponent(lblmodelo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcosto))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcategoria)
                    .addComponent(rdescritorio)
                    .addComponent(rdlaptop)
                    .addComponent(rdnetbook))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltipo)
                    .addComponent(rdnuevo)
                    .addComponent(rdusado)
                    .addComponent(rdreformado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btnagregar)
                    .addComponent(btnlistar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar)
                    .addComponent(btnnuevo)
                    .addComponent(btnsalir))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (!validar()) {
            String nombre = txtnombre.getText();
            String apellido = txtapellido.getText();
            int cedula = Integer.parseInt(txtcedula.getText());
            String marca = txtmarca.getText();
            String modelo = txtmodelo.getText();
            double costo = Double.parseDouble(txtcosto.getText());
            String categoria;
            String tipo;

            if (rdescritorio.isSelected()) {
                categoria = "Escritorio";
            } else if (rdlaptop.isSelected()) {
                categoria = "Laptop";
            } else {
                categoria = "Netbook";
            }

            if (rdnuevo.isSelected()) {
                tipo = "Nuevo";
            } else if (rdusado.isSelected()) {
                tipo = "Usado";
            } else {
                tipo = "Reformado";
            }

            Computadora comp = new Computadora(nombre, apellido, cedula, marca, modelo, costo, categoria, tipo);
            CrudComputadoras cp = new CrudComputadoras();
            String mensaje = cp.guardarNuevo(comp);
            JOptionPane.showMessageDialog(this, mensaje);

            Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los datos");
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        TablaBD listar = new TablaBD();
        CrudComputadoras crudComp = new CrudComputadoras();
        listar.cargardatos(crudComp.getLista());
        listar.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo"));

        try {
            Limpiar();
            CrudComputadoras crudComp = new CrudComputadoras();
            Computadora per = crudComp.Buscarxcedula(cedula);

            if (per.getNombre() == null) {
                JOptionPane.showMessageDialog(this, "Registro no encontrado...");
                return;
            }

            txtnombre.setText(per.getNombre());
            txtapellido.setText(per.getApellido());
            txtcedula.setText(String.valueOf(per.getCedula()));
            txtmarca.setText(per.getMarca());
            txtmodelo.setText(per.getModelo());
            txtcosto.setText(String.valueOf(per.getCosto()));

            if (per.getCategoria().equals("Escritorio")) {
                rdescritorio.setSelected(true);
            } else if (per.getCategoria().equals("Laptop")) {
                rdlaptop.setSelected(true);
            } else {
                rdnetbook.setSelected(true);
            }

            if (per.getTipo().equals("Nuevo")) {
                rdnuevo.setSelected(true);
            } else if (per.getTipo().equals("Usado")) {
                rdusado.setSelected(true);
            } else {
                rdreformado.setSelected(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Registro no encontrado...");
            Limpiar();
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        int cedula = Integer.parseInt(txtcedula.getText());
        String marca = txtmarca.getText();
        String modelo = txtmodelo.getText();
        double costo = Double.parseDouble(txtcosto.getText());
        String categoria;
        String tipo;

        if (rdescritorio.isSelected()) {
            categoria = "Escritorio";
        } else if (rdlaptop.isSelected()) {
            categoria = "Laptop";
        } else {
            categoria = "Netbook";
        }

        if (rdnuevo.isSelected()) {
            tipo = "Nuevo";
        } else if (rdusado.isSelected()) {
            tipo = "Usado";
        } else {
            tipo = "Reformado";
        }

        Computadora comp = new Computadora(nombre, apellido, cedula, marca, modelo, costo, categoria, tipo);
        CrudComputadoras cp = new CrudComputadoras();
        
        String mensaje = cp.Actualizar(comp);
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        CrudComputadoras crudComp = new CrudComputadoras();
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente"));
        int confirm =  JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar el registro?");
        if(confirm == 0)
            JOptionPane.showMessageDialog(this, crudComp.Eliminarxcedula(cedula));
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

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
     
    private boolean validar() {
        boolean vacio = false;
        if (txtnombre.getText().equals("")) {
            vacio = true;
        } else if (txtapellido.getText().equals("")) {
            vacio = true;
        } else if (txtcedula.getText().equals("")) {
            vacio = true;
        } else if (txtmarca.getText().equals("")) {
            vacio = true;
        } else if (txtmodelo.getText().equals("")) {
            vacio = true;
        }
        if (txtcosto.getText().equals("")) {
            vacio = true;
        }
        return vacio;
    }
    
    public void Limpiar(){
        txtnombre.setText("");
        txtapellido.setText("");
        txtcedula.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtcosto.setText("");
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
            java.util.logging.Logger.getLogger(VentanaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.ButtonGroup btngcategoria;
    private javax.swing.ButtonGroup btngtipo;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblcosto;
    private javax.swing.JLabel lblmarca;
    private javax.swing.JLabel lblmodelo;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblregistro;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JRadioButton rdescritorio;
    private javax.swing.JRadioButton rdlaptop;
    private javax.swing.JRadioButton rdnetbook;
    private javax.swing.JRadioButton rdnuevo;
    private javax.swing.JRadioButton rdreformado;
    private javax.swing.JRadioButton rdusado;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
