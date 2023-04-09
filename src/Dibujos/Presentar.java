package Dibujos;

import java.awt.Color;
import javax.swing.JFrame;

public class Presentar {

    public static void main(String[] args) {
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setTitle("Dibujo");
        
        
        Dibujo dbj = new Dibujos.Dibujo();
        marco.add(dbj);
        marco.setSize(600, 600);
        marco.setVisible(true);
    }
    
}
