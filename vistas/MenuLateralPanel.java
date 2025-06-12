package vistas;

import java.awt.*;
import javax.swing.*;

public class MenuLateralPanel extends JPanel {

    public MenuLateralPanel() {
        // Establece el tamaño del panel: ancho de 300 px, altura se ajusta automáticamente
        setPreferredSize(new Dimension(300, 0));

        // Color de fondo gris claro
        setBackground(new Color(230, 230, 230));

        // Borde negro de 2 píxeles
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Lista con los nombres de los botones
        String[] botones = {
            "Agendar cita",
            "Recetar",
            "Diagnósticos",
            "Pruebas o estudios",
            "Notas clínicas",
            "Recordatorios"
        };

        // Creamos cada botón y lo agregamos al panel
        for (String texto : botones) {
            JButton boton = new JButton(texto);

            // Fondo blanco y texto negro
            boton.setBackground(Color.WHITE);
            boton.setForeground(Color.BLACK);

            // Borde negro delgado
            boton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

            // Tamaño del botón: 280 de ancho y 50 de alto
            Dimension tamaño = new Dimension(280, 50);
            boton.setPreferredSize(tamaño);
            boton.setMaximumSize(tamaño);
            boton.setMinimumSize(tamaño);

            // Agrega el botón al panel
            add(boton);
        }
    }

    // Método para obtener el panel desde otro lugar
    public JPanel getPanel() {
        return this;
    }
}
