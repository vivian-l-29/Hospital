package vistas;

import java.awt.*;
import javax.swing.*;

public class MenuLateralPanel extends JPanel {

    public MenuLateralPanel() {
        // Establece el tamaño preferido del panel: ancho fijo 300 px, altura flexible (0)
        setPreferredSize(new Dimension(300, 0)); 

        // Fondo gris claro para el panel lateral
        setBackground(new Color(230, 230, 230)); 

        // Borde negro de 2 px alrededor del panel para delimitarlo visualmente
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Layout vertical que apila los componentes uno debajo del otro
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Array con los textos de los botones que irán en el menú lateral
        String[] botones = {
            "Agendar cita",
            "Recetar",
            "Diagnósticos",
            "Pruebas o estudios",
            "Notas clínicas",
            "Recordatorios"
        };

        // Recorremos cada texto para crear un botón con las propiedades deseadas
        for (String texto : botones) {
            JButton boton = new JButton(texto);

            // Evita que el botón tenga el "focus" resaltado al seleccionarlo
            boton.setFocusPainted(false);

            // Fondo blanco para el botón para contraste con el gris del panel
            boton.setBackground(Color.WHITE);

            // Texto en negro para buena visibilidad
            boton.setForeground(Color.BLACK);

            // Fuente SansSerif, tamaño 16 para texto claro y legible
            boton.setFont(new Font("SansSerif", Font.PLAIN, 16));

            // Borde negro fino de 1 px alrededor del botón
            boton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

            // Tamaño máximo, mínimo y preferido del botón:
            // Ancho 280 px (un poco menor que el panel para dejar margen)
            // Alto 50 px para un botón cómodo para clic
            boton.setMaximumSize(new Dimension(280, 50));
            boton.setMinimumSize(new Dimension(280, 50));
            boton.setPreferredSize(new Dimension(280, 50));

            // Centra el botón horizontalmente dentro del BoxLayout vertical
            boton.setAlignmentX(Component.CENTER_ALIGNMENT);

            // Agrega un espacio vertical fijo de 10 px antes del botón para separación
            add(Box.createVerticalStrut(10));

            // Añade el botón al panel
            add(boton);
        }

        // Añade un "resorte" vertical que empuja los componentes hacia arriba,
        // para que no queden pegados al borde inferior cuando haya espacio extra
        add(Box.createVerticalGlue());
    }

    // Método para obtener el propio panel si se quiere usar externamente
    public JPanel getPanel() {
        return this;
    }
}
