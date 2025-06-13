package vistas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class BannerPanel {
    
    private JPanel panelBanner;

    public BannerPanel() {
        panelBanner = new JPanel();
        panelBanner.setPreferredSize(new Dimension(500, 800)); // Ancho x Alto
        panelBanner.setOpaque(true);
        panelBanner.setBackground(new Color(230, 230, 230));
    }
    
    public JPanel getJPanel() {
        return panelBanner;
    }
}