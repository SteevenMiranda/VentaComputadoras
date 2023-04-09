package Dibujos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujo extends JPanel{
    
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
}
