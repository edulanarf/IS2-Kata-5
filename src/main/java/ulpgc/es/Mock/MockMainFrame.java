package ulpgc.es.Mock;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MockMainFrame extends JFrame {
    private BufferedImage image;
    public MockMainFrame(BufferedImage image){
        this.image = image;

        this.setTitle("Money Calculator");
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);                       //En el centro de la pantalla

        this.setLayout(new BorderLayout());
        JLabel label = new JLabel(new ImageIcon(image));
        this.add(label);

        // 4. Ajustar el tamaño del JFrame y hacerlo visible
        this.pack();
        this.setLocationRelativeTo(null); // Centrar en pantalla
        this.setVisible(true);

    }
}
