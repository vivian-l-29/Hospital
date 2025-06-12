package vistas; 
// Esta línea indica en qué "paquete" está esta clase.
// Un paquete es una forma de organizar tus archivos Java (como carpetas).

import data.pacientes;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TablaPanel extends JScrollPane {
    // Aquí estamos creando una clase llamada TablaPanel.
    // Esta clase "hereda" de JScrollPane, lo que significa que se comportará como un JScrollPane (un panel con scroll).

    public TablaPanel() {
        // Este es el constructor de la clase.
        // El constructor es un método especial que se ejecuta automáticamente cuando creamos un nuevo objeto de esta clase.

        String[] columnas = { "Nombre", "Cita", "Hora" };
        // Aquí estamos creando un arreglo de String con los nombres de las columnas de la tabla.
        // Estos serán los títulos que se verán en la parte superior de la tabla.

        Object[][] datos = new pacientes().getDatos();
        // Aquí estamos creando una matriz (arreglo de arreglos) con los datos que se mostrarán en la tabla.
        // Cada fila representa una persona con su ID, nombre y edad.

        DefaultTableModel base = new DefaultTableModel(datos, columnas);
        // Aquí estamos creando un "modelo de tabla", que le dice a la tabla qué datos debe mostrar y cómo están organizados.

        JTable tabla = new JTable(base);
        // Creamos una tabla con ese modelo.
        // JTable es el componente que realmente dibuja la tabla en pantalla.

        // NUEVO: Crear un renderizador para centrar el texto en las celdas
        DefaultTableCellRenderer centrado = new DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(SwingConstants.CENTER);

        // NUEVO: Aplicar el renderizador a todas las columnas
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centrado);
        }

        this.setViewportView(tabla);
        // Aquí usamos `this` para referirnos al objeto actual (la instancia de TablaPanel, que es un JScrollPane).
        // Le decimos que la vista que se mostrará dentro del scroll será la tabla que creamos.
        // Esto permite que la tabla tenga barras de desplazamiento si los datos no caben en pantalla.
    }
}
