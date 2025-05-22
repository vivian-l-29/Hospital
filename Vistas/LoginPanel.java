package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

public class LoginPanel {

    // Declaración del panel principal que contendrá todos los componentes
    private JPanel panelLogin;

    // Constructor de la clase
    public LoginPanel() {

        // Inicialización del panel
        panelLogin = new JPanel();
        panelLogin.setPreferredSize(new Dimension(500, 800)); // Tamaño preferido del panel
        panelLogin.setOpaque(true);                           // Hace visible el color de fondo
        panelLogin.setBackground(Color.WHITE);                // Establece color de fondo blanco
        panelLogin.setLayout(new GridBagLayout());            // Usa GridBagLayout para una disposición flexible

        // Administrador de restricciones para ubicar los componentes en el GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 80, 10, 20);               // Márgenes alrededor de los componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;             // Expande los componentes horizontalmente
        gbc.weightx = 1.0;                                     // Distribuye el espacio horizontal

        // ---------------- COMPONENTES ---------------- //

        // Título del panel
        JLabel titulo = new JLabel("Login", SwingConstants.CENTER);
        gbc.anchor = GridBagConstraints.CENTER;               // Alinea el componente en el centro
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;                                    // Ocupa dos columnas
        panelLogin.add(titulo, gbc);                          // Agrega el título al panel

        // Etiqueta para el campo de usuario
        JLabel labelUsuario = new JLabel("Usuario:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;                                    // Solo una columna
        panelLogin.add(labelUsuario, gbc);

        // Campo de texto para ingresar el usuario
        JTextField entradaCorreo = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        panelLogin.add(entradaCorreo, gbc);

        // Etiqueta para el campo de contraseña
        JLabel labelContra = new JLabel("Contraseña:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelLogin.add(labelContra, gbc);

        // Campo para ingresar la contraseña
        JPasswordField entradaContra = new JPasswordField();
        entradaContra.setPreferredSize(new Dimension(100, 30)); // Tamaño preferido
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(entradaContra, gbc);

        // Botón para enviar el formulario de login
        JButton entradaBoton = new JButton("Iniciar");
        entradaBoton.setPreferredSize(new Dimension(100, 30));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;                // Alinea el botón a la derecha
        gbc.fill = GridBagConstraints.NONE;                  // No lo estira
        panelLogin.add(entradaBoton, gbc);
    }

    // Método público que permite obtener el panel desde fuera de esta clase
    public JPanel getPanel() {
        return panelLogin;
    }
}
