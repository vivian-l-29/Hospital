package ventanas;

import java.awt.*;
import javax.swing.*;
import vistas.MenuLateralPanel;
import vistas.TablaPanel;

public class DashBoard extends JFrame {

    public DashBoard() {
        this.setTitle("Vista-Doctor");
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        this.add(new MenuLateralPanel().getPanel());

        TablaPanel tabla = new TablaPanel();
        this.add(tabla, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
