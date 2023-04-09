package Ventanas;

import ClaseComputadora.Botones;
import ClaseComputadora.Computadora;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class TablaComputadora extends javax.swing.JFrame {

    public TablaComputadora() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblcompu = new javax.swing.JTable();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblcompu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Marca", "Modelo", "Costo", "Categoria", "Tipo", "Cantidad", "Tipo de Pago", "Caracteristicas"
            }
        ));
        jScrollPane1.setViewportView(tblcompu);

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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsalir)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalir)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed

    public void Datos(Botones datos) {
        DefaultTableModel modelo = (DefaultTableModel) tblcompu.getModel();

        for (Computadora c : datos.getLista()) {
            String categoria = "";
            String tipo = "";
            String tipopago = "";

            switch (c.getCategoria()) {
                case 1:
                    categoria = "Seleccione";
                case 2:
                    categoria = "Escritorio";
                case 3:
                    categoria = "Gamer";
                case 4:
                    categoria = "Laptop";
                case 5:;
                    categoria = "Netbook";
                case 6:
                    categoria = "Ultrabook";
            }

            if (c.getTipo().equals("Nuevo")) {
                tipo = "Nuevo";
            } else if (c.getTipo().equals("Usado")) {
                tipo = "Usado";
            } else {
                tipo = "Reformado";
            }

            if (c.getTipopago()[0] == 1) {
                tipopago = "Efectivo";
            }
            if (c.getTipopago()[1] == 1) {
                tipopago = "Tarjeta";
            }
            if (c.getTipopago()[2] == 1) {
                tipopago = "Transferencia Bancaria";
            }
            if (c.getTipopago()[3] == 1) {
                tipopago = "PayPal";
            }
            if (c.getTipopago()[4] == 1) {
                tipopago = "Direct Debit";
            }
            Object[] fila = {c.getId(), c.getMarca(), c.getModelo(), c.getCosto(),
                categoria, tipo, c.getCantidad(), tipopago, c.getCaracteristicas()};
            modelo.addRow(fila);
        }
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
            java.util.logging.Logger.getLogger(TablaComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaComputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaComputadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcompu;
    // End of variables declaration//GEN-END:variables
}
