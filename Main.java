import Vistas.BannerPanel;
import Vistas.LoginPanel;                             // Importa la clase BannerPanel
import java.awt.BorderLayout;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Crear una ventana con JFrame
        JFrame miVentana = new JFrame();                    // Crea la ventana principal
        miVentana.setTitle("Hospital SCL");                 // Establece el título de la ventana
        miVentana.setSize(1000, 800);                       // Establece el tamaño de la ventana (ancho x alto)
        miVentana.setLayout(new BorderLayout());            // Establece un BorderLayout para organizar los componentes en 5 zonas (NORTE, SUR, ESTE, OESTE y CENTRO)
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación cuando se cierre la ventana

        // Crear el panel del banner (parte izquierda) usando la clase personalizada BannerPanel
        BannerPanel panelBanner = new BannerPanel();            // Crea una instancia del panel de banner
        miVentana.add(panelBanner, BorderLayout.WEST);          // Agrega el panel al lado izquierdo (OESTE) de la ventana

        // Crear y agregar el panel de login
        LoginPanel panelLogin = new LoginPanel();               // Crea una instancia del panel de login
        miVentana.add(panelLogin.getPanel(), BorderLayout.CENTER); // Agrega el panel de login al centro de la ventana

        // Hacer visible la ventana
        miVentana.setVisible(true);                             // Muestra la ventana en pantalla
    }
}
