package ulpgc.es.Mock;

import ulpgc.es.app.control.LoadRandomUserCommand;
import ulpgc.es.app.model.User;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

public class MockMain {
    public static void main(String[] args) throws IOException {
        LoadRandomUserCommand command = new LoadRandomUserCommand(1);
        command.execute();
        List<User> user = command.getUsers();

        // Convertir bytes en una imagen y mostrarla
        try {
            // 1. Convierte los bytes a un BufferedImage
            ByteArrayInputStream bis = new ByteArrayInputStream(user.get(0).getPhoto());
            BufferedImage image = ImageIO.read(bis);

            // 2. Crear un JFrame para mostrar la imagen
            JFrame frame = new JFrame("Imagen desde byte[]");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 3. Usar un JLabel con ImageIcon para mostrar la imagen
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label);

            // 4. Ajustar el tamaño del JFrame y hacerlo visible
            frame.pack();
            frame.setLocationRelativeTo(null); // Centrar en pantalla
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
