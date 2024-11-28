package ulpgc.es.app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class MainFrame extends JFrame {
    private final java.util.List<BufferedImage> images;
    private JLabel imageLabel;
    private int currentIndex = 0;

    public MainFrame(List<BufferedImage> images){
        this.images = images;
        this.setTitle("Fotos Random");
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout());

        imageLabel = new JLabel();
        updateImage();

        add(imageLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton previousButton = new JButton("Anterior");
        JButton nextButton = new JButton("Siguiente");

        previousButton.addActionListener(e -> showPreviousImage());

        nextButton.addActionListener(e -> showNextImage());

        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    private void updateImage() {
        BufferedImage currentImage = images.get(currentIndex);
        ImageIcon imageIcon = new ImageIcon(currentImage);

        imageLabel.setIcon(imageIcon);
        revalidate();
        repaint();
    }

    private void showNextImage() {
        if (currentIndex > 0) {
            currentIndex--;
        } else {
            currentIndex = images.size() - 1;
        }
        updateImage();
    }

    private void showPreviousImage() {
        if (currentIndex < images.size() - 1) {
            currentIndex++;
        } else {
            currentIndex = 0;
        }
        updateImage();
    }
}