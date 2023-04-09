package Ventanas;

import ClaseComputadora.Botones;
import ClaseComputadora.Computadora;
import java.awt.Color;
import javax.swing.JOptionPane;

public class RegistroComputadora extends javax.swing.JFrame {

    Botones listado = new Botones();

    public RegistroComputadora() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngtipo = new javax.swing.ButtonGroup();
        lblcomputadora = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblmarca = new javax.swing.JLabel();
        lblmodelo = new javax.swing.JLabel();
        lblcosto = new javax.swing.JLabel();
        lblcategoria = new javax.swing.JLabel();
        lblcaracteristicas = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        lbltipo = new javax.swing.JLabel();
        lbltipopago = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        cmbcategoria = new javax.swing.JComboBox<>();
        rdnuevo = new javax.swing.JRadioButton();
        rdusado = new javax.swing.JRadioButton();
        rdreformado = new javax.swing.JRadioButton();
        txtcantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areacaracteristicas = new javax.swing.JTextArea();
        chkefectivo = new javax.swing.JCheckBox();
        chktarjeta = new javax.swing.JCheckBox();
        chktransferencia = new javax.swing.JCheckBox();
        chkpaypal = new javax.swing.JCheckBox();
        chkdirect = new javax.swing.JCheckBox();
        btnagregar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblcomputadora.setFont(new java.awt.Font("Constantia", 3, 20)); // NOI18N
        lblcomputadora.setText("Computadoras");

        lblid.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblid.setText("ID:");

        lblmarca.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblmarca.setText("Marca:");

        lblmodelo.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblmodelo.setText("Modelo:");

        lblcosto.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblcosto.setText("Costo:");

        lblcategoria.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblcategoria.setText("Categoria:");

        lblcaracteristicas.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblcaracteristicas.setText("Caracteristicas:");

        lblcantidad.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lblcantidad.setText("Cantidad:");

        lbltipo.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lbltipo.setText("Tipo:");

        lbltipopago.setFont(new java.awt.Font("Constantia", 3, 15)); // NOI18N
        lbltipopago.setText("Tipo de pago:");

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
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

        cmbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Escritorio", "Gamer", "Laptop", "Netbook", "Ultrabook", " " }));

        btngtipo.add(rdnuevo);
        rdnuevo.setText("Nuevo");

        btngtipo.add(rdusado);
        rdusado.setText("Usado");

        btngtipo.add(rdreformado);
        rdreformado.setSelected(true);
        rdreformado.setText("Reformado");

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });

        areacaracteristicas.setColumns(20);
        areacaracteristicas.setRows(5);
        jScrollPane1.setViewportView(areacaracteristicas);

        chkefectivo.setText("Efectivo");

        chktarjeta.setText("Tarjeta");

        chktransferencia.setText("Transferencia Bancaria");

        chkpaypal.setText("PayPal");

        chkdirect.setText("Direct Debit");

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
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

        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblmarca)
                                    .addComponent(lblid))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(lblmodelo)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtmodelo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(lblcantidad)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbltipopago)
                                        .addGap(427, 427, 427))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbltipo)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdnuevo))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chktarjeta)
                                                .addComponent(chkefectivo)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdusado)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdreformado))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chkpaypal)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(chktransferencia)
                                                        .addGap(27, 27, 27)
                                                        .addComponent(chkdirect)))))
                                        .addGap(87, 87, 87)))))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcategoria)
                            .addComponent(lblcosto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcaracteristicas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnagregar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnbuscar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnactualizar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btneliminar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnlistar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnlimpiar)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(btnsalir, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(lblcomputadora)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcaracteristicas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblid)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcantidad)
                                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblmarca)
                                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblmodelo)
                                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblcosto)
                                    .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcategoria))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltipo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rdnuevo)
                                        .addComponent(rdusado)
                                        .addComponent(rdreformado)))
                                .addGap(35, 35, 35)
                                .addComponent(lbltipopago))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblcomputadora)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkefectivo)
                                    .addComponent(chktransferencia)
                                    .addComponent(chkdirect))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chktarjeta)
                                    .addComponent(chkpaypal)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnagregar)
                                    .addComponent(btnbuscar)
                                    .addComponent(btnactualizar)
                                    .addComponent(btneliminar)
                                    .addComponent(btnlistar)
                                    .addComponent(btnlimpiar))))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed
    public void Limpiar() {
        txtid.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtcosto.setText("");
        txtcantidad.setText("");
        areacaracteristicas.setText("");
        cmbcategoria.setSelectedIndex(0);
        chkefectivo.setSelected(false);
        chktarjeta.setSelected(false);
        chktransferencia.setSelected(false);
        chkpaypal.setSelected(false);
        chkdirect.setSelected(false);
    }
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        TablaComputadora listar = new TablaComputadora();
        listar.Datos(this.listado);
        listar.setVisible(true);
    }//GEN-LAST:event_btnlistarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        if (!validar()) {
        String id = txtid.getText();
        String marca = txtmarca.getText();
        String modelo = txtmodelo.getText();
        String costo = txtcosto.getText();
        String cantidad = txtcantidad.getText();
        String caracteristicas = areacaracteristicas.getText();

        int categoria = cmbcategoria.getSelectedIndex();

        String tipo;
        if (rdnuevo.isSelected()) {
            tipo = "Nuevo";
        } else if (rdusado.isSelected()) {
            tipo = "Usado";
        } else {
            tipo = "Reformado";
        }

        int tipopago[] = new int[5];
        if (chkefectivo.isSelected()) {
            tipopago[0] = 1;
        } else {
            tipopago[0] = 0;
        }
        if (chktarjeta.isSelected()) {
            tipopago[1] = 1;
        } else {
            tipopago[1] = 0;
        }
        if (chktransferencia.isSelected()) {
            tipopago[2] = 1;
        } else {
            tipopago[2] = 0;
        }
        if (chkpaypal.isSelected()) {
            tipopago[3] = 1;
        } else {
            tipopago[3] = 0;
        }
        if (chkdirect.isSelected()) {
            tipopago[4] = 1;
        } else {
            tipopago[4] = 0;
        }

        Computadora c = new Computadora(id, marca, modelo, costo, categoria, tipo, cantidad, tipopago, caracteristicas);
        this.listado.Agregar(c);
        Limpiar();
        
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los datos");
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        if (!validar()) {
        String id = txtid.getText();
        String marca = txtmarca.getText();
        String modelo = txtmodelo.getText();
        String costo = txtcosto.getText();
        String cantidad = txtcantidad.getText();
        String caracteristicas = areacaracteristicas.getText();

        int categoria = cmbcategoria.getSelectedIndex();

        String tipo;
        if (rdnuevo.isSelected()) {
            tipo = "Nuevo";
        } else if (rdusado.isSelected()) {
            tipo = "Usado";
        } else {
            tipo = "Reformado";
        }

        int tipopago[] = new int[5];
        if (chkefectivo.isSelected()) {
            tipopago[0] = 1;
        } else {
            tipopago[0] = 0;
        }
        if (chktarjeta.isSelected()) {
            tipopago[1] = 1;
        } else {
            tipopago[1] = 0;
        }
        if (chktransferencia.isSelected()) {
            tipopago[2] = 1;
        } else {
            tipopago[2] = 0;
        }
        if (chkpaypal.isSelected()) {
            tipopago[3] = 1;
        } else {
            tipopago[3] = 0;
        }
        if (chkdirect.isSelected()) {
            tipopago[4] = 1;
        } else {
            tipopago[4] = 0;
        }

        Computadora c = new Computadora(id, marca, modelo, costo, categoria, tipo, cantidad, tipopago, caracteristicas);
        this.listado.ActualizarxId(c);
        Limpiar();
        
        } else {
            JOptionPane.showMessageDialog(null, "Llene todos los datos");
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        Computadora c;
        String id = JOptionPane.showInputDialog("Ingrese el id del dispositivo");
        try {
            c = this.listado.BuscarxId(id);

            txtid.setText(c.getId());
            txtmarca.setText(c.getMarca());
            txtmodelo.setText(c.getModelo());
            txtcantidad.setText(c.getCantidad());
            txtcosto.setText(c.getCosto());

            if (c.getTipo().equals("Nuevo")) {
                rdnuevo.setSelected(true);
            } else if (c.getTipo().equals("Usado")) {
                rdusado.setSelected(true);
            } else {
                rdreformado.setSelected(true);
            }

            cmbcategoria.setSelectedIndex(c.getCategoria());

            if (c.getTipopago()[0] == 1) {
                chkefectivo.setSelected(true);
            } else {
                chkefectivo.setSelected(false);
            }
            if (c.getTipopago()[1] == 1) {
                chktarjeta.setSelected(true);
            } else {
                chktarjeta.setSelected(false);
            }
            if (c.getTipopago()[2] == 1) {
                chktransferencia.setSelected(true);
            } else {
                chktransferencia.setSelected(false);
            }
            if (c.getTipopago()[3] == 1) {
                chkpaypal.setSelected(true);
            } else {
                chkpaypal.setSelected(false);
            }
            if (c.getTipopago()[4] == 1) {
                chkdirect.setSelected(true);
            } else {
                chkdirect.setSelected(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Dispositivo no encontrado");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        String id = JOptionPane.showInputDialog("Ingrese el id del dispositivo");
        int confirmar = JOptionPane.showConfirmDialog(this, "Desea eliminar el dispositivo?");
        if (confirmar == 0) {
            this.listado.EliminarxId(id);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtidKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtmarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarcaKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtmarcaKeyTyped

    private void txtcostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcostoKeyTyped
    
    private boolean validar() {
        boolean vacio = false;
        if (txtid.getText().equals("")) {
            vacio = true;
        } else if (txtcantidad.getText().equals("")) {
            vacio = true;
        } else if (txtmarca.getText().equals("")) {
            vacio = true;
        } else if (txtmodelo.getText().equals("")) {
            vacio = true;
        } if (txtcosto.getText().equals("")) {
            vacio = true;
        }
        return vacio;
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
            java.util.logging.Logger.getLogger(RegistroComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroComputadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areacaracteristicas;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.ButtonGroup btngtipo;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JCheckBox chkdirect;
    private javax.swing.JCheckBox chkefectivo;
    private javax.swing.JCheckBox chkpaypal;
    private javax.swing.JCheckBox chktarjeta;
    private javax.swing.JCheckBox chktransferencia;
    private javax.swing.JComboBox<String> cmbcategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblcaracteristicas;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lblcomputadora;
    private javax.swing.JLabel lblcosto;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblmarca;
    private javax.swing.JLabel lblmodelo;
    private javax.swing.JLabel lbltipo;
    private javax.swing.JLabel lbltipopago;
    private javax.swing.JRadioButton rdnuevo;
    private javax.swing.JRadioButton rdreformado;
    private javax.swing.JRadioButton rdusado;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    // End of variables declaration//GEN-END:variables
}
