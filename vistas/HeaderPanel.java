package vistas;

import java.awt.*;
import javax.swing.*;

public class HeaderPanel extends JPanel {

    public HeaderPanel() {
        // Usa BorderLayout para colocar el texto a la izquierda y el cuadrito a la derecha
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // ==== Etiqueta con nombre del hospital ====
        JLabel nombreHospital = new JLabel("  Nombre Hospital"); // espacio para separar un poco del borde
        nombreHospital.setFont(new Font("SansSerif", Font.PLAIN, 18));
        nombreHospital.setHorizontalAlignment(SwingConstants.LEFT);

        // ==== Cuadrito (simulando logo) ====
        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(40, 40)); // tamaño del cuadro
        logoPanel.setBackground(Color.GRAY);               // color gris como marcador
        logoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // borde negro

        // Centra verticalmente el cuadrito dentro del área derecha
        JPanel rightContainer = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        rightContainer.setOpaque(false); // fondo transparente para mantener el fondo blanco
        rightContainer.add(logoPanel);

        // Agrega el nombre al centro (alineado a la izquierda)
        this.add(nombreHospital, BorderLayout.CENTER);

        // Agrega el cuadrito al este (lado derecho del header)
        this.add(rightContainer, BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return this;
    }
}
