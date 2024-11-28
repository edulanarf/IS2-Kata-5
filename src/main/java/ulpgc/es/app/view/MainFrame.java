package ulpgc.es.app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MainFrame extends JFrame {
    public MainFrame(BufferedImage image) {

        this.setTitle("Photos Random");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout());
        JLabel label = new JLabel(new ImageIcon(image));
        this.add(label);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}