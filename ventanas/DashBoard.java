package ventanas;

import java.awt.*;
import javax.swing.*;
import vistas.MenuLateralPanel;
import vistas.TablaPanel;
import vistas.HeaderPanel;

public class DashBoard extends JFrame {

    public DashBoard() {
        this.setTitle("Vista-Doctor");
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        this.add(new HeaderPanel().getPanel(), BorderLayout.NORTH); // ✅ AGREGA EL HEADER
        this.add(new MenuLateralPanel().getPanel(), BorderLayout.WEST); // lateral
        this.add(new TablaPanel(), BorderLayout.CENTER); // centro

        this.setVisible(true);
    }
}
