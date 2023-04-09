package Ventanas;

import java.awt.Color;
import java.awt.Graphics;

public class Dibujo extends javax.swing.JPanel {

    public Dibujo() {
        initComponents();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.DARK_GRAY);

        g.setColor(Color.white);
        g.fillOval(120, 20, 90, 90);

        g.setColor(Color.white);
        g.drawLine(165, 250, 165, 30);

        g.setColor(Color.WHITE);
        g.drawRect(200, 200, 200, 300);
        
        g.setColor( Color.WHITE);
        g.fillRect( 220, 220, 50, 50 );
        
        g.setColor( Color.WHITE);
        g.fillRect( 220, 300, 50, 50 );
        
        g.setColor( Color.WHITE);
        g.fillRect( 220, 380, 50, 50 );
        
        g.setColor( Color.WHITE);
        g.fillRect( 330, 380, 50, 50 );
        
        g.setColor( Color.WHITE);
        g.fillRect( 330, 300, 50, 50 );
        
        g.setColor( Color.WHITE);
        g.fillRect( 330, 220, 50, 50 );
        
        g.setColor( Color.WHITE );
        g.drawArc( 250, 460, 100, 80, 0, 180 );

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
