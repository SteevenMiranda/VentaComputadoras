package Ventanas;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setTitle("REGISTRO DE COMPUTADORAS");
//        this.setLocationRelativeTo(this);
//        this.setExtendedState(this.MAXIMIZED_BOTH);
//        this.getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuarchivo = new javax.swing.JMenu();
        itemsalir = new javax.swing.JMenuItem();
        menuswing = new javax.swing.JMenu();
        itemcrear = new javax.swing.JMenuItem();
        itemarraylist = new javax.swing.JMenuItem();
        itembasedatos = new javax.swing.JMenuItem();
        itemdibujo = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/sol.jpg"))); // NOI18N

        menuarchivo.setText("Archivo");

        itemsalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itemsalir.setText("Salir");
        itemsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsalirActionPerformed(evt);
            }
        });
        menuarchivo.add(itemsalir);

        jMenuBar1.add(menuarchivo);

        menuswing.setText("Swing");

        itemcrear.setText("Crear Archivos");
        itemcrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemcrearMouseClicked(evt);
            }
        });
        itemcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcrearActionPerformed(evt);
            }
        });
        menuswing.add(itemcrear);

        itemarraylist.setText("Crud ArrayList");
        itemarraylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemarraylistActionPerformed(evt);
            }
        });
        menuswing.add(itemarraylist);

        itembasedatos.setText("Crud Base de Datos");
        itembasedatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itembasedatosActionPerformed(evt);
            }
        });
        menuswing.add(itembasedatos);

        itemdibujo.setText("Dibujos");
        itemdibujo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdibujoActionPerformed(evt);
            }
        });
        menuswing.add(itemdibujo);

        jMenuBar1.add(menuswing);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemsalirActionPerformed

    private void itemcrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemcrearMouseClicked
        
    }//GEN-LAST:event_itemcrearMouseClicked

    private void itemcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcrearActionPerformed
        new Archivos().setVisible(true);
    }//GEN-LAST:event_itemcrearActionPerformed

    private void itemarraylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemarraylistActionPerformed
        new RegistroComputadora().setVisible(true);
    }//GEN-LAST:event_itemarraylistActionPerformed

    private void itembasedatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itembasedatosActionPerformed
        new VentanaBD().setVisible(true);
    }//GEN-LAST:event_itembasedatosActionPerformed

    private void itemdibujoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdibujoActionPerformed
        new PresentarDibujo().setVisible(true);
        
    }//GEN-LAST:event_itemdibujoActionPerformed
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemarraylist;
    private javax.swing.JMenuItem itembasedatos;
    private javax.swing.JMenuItem itemcrear;
    private javax.swing.JMenuItem itemdibujo;
    private javax.swing.JMenuItem itemsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuarchivo;
    private javax.swing.JMenu menuswing;
    // End of variables declaration//GEN-END:variables


}