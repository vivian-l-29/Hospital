package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class BannerPanel extends JPanel {

    // Constructor de la clase
    public BannerPanel() {

        // Establece el tamaño preferido del panel
        setPreferredSize(new Dimension(500, 800)); 

        // Hace que el fondo del panel sea visible
        setOpaque(true);                           

        // Establece el color de fondo del panel
        setBackground(Color.BLUE);                 
    }
}
