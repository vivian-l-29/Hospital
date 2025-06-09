package vistas;

import java.awt.Color;
import javax.swing.JPanel;

public class MenuLateralPanel extends JPanel{
    
    public MenuLateralPanel(){
        this.setSize(300,1000);
        this.setOpaque(true);
        this.setBackground(Color.RED);
    }

    public JPanel getPanel(){
        return this;
    }
}
