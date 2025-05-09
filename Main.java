import javax.swing.JFrame; // Para crear ventanas
import javax.swing.JLabel; // Para mostrar texto en la interfaz 

public class Main {

    public static void main(String[] args) {
        
        // Crear una ventana con JFrame
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital SCL");     // Establece el título de la ventana
        miVentana.setSize(1000, 800);           // Establece el tamaño de la ventana (ancho x alto
    
        // Crear un texto
        JLabel texto = new JLabel();
        texto.setText("Hola mundo");            // Establece el texto del JLabel

        miVentana.add(texto);                   // Añade el JLabel a la ventana (usa el layout por defecto)

        // Hacer visible la ventana
        miVentana.setVisible(true);             // Muestra la ventana en pantalla
    }
}