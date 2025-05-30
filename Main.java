// Importa la clase JFrame del paquete javax.swing (para crear la ventana)
import java.awt.BorderLayout;
import javax.swing.*;
import vistas.BannerPanel;
import vistas.LoginPanel;

public class Main {

    public static void main(String[] args) {
        // Título y tamaño de la ventana
        JFrame miVentana = new JFrame();  // Crea la ventana principal
        miVentana.setTitle("Hospital SCL");  // Establece el título de la ventana
        miVentana.setSize(1000, 800); // Establece el tamaño de la ventana (ancho x alto)
        miVentana.setLayout(new BorderLayout()); // Establece un BorderLayout para organizar los componentes en 5 zonas (NORTE, SUR, ESTE, OESTE y CENTRO)
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación cuando se cierre la ventana
        // BannerPanel
        BannerPanel panelBanner = new BannerPanel(); // Crea una instancia del panel de banner
        miVentana.add(panelBanner.getJPanel(), BorderLayout.WEST);  // Agrega el panel al lado izquierdo (OESTE) de la ventana

        // LoginView (con frame pasado)
        LoginPanel panelLogin = new LoginPanel(miVentana);  // Crea una instancia del panel de login
        miVentana.add(panelLogin.getJPanel(), BorderLayout.CENTER); // Agrega el panel de login al centro de la ventana

        miVentana.setVisible(true);
    }
}