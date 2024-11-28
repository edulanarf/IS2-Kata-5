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
        //Hacer el comando
        LoadRandomUserCommand command = new LoadRandomUserCommand(1);
        command.execute();
        List<User> user = command.getUsers();
        // Convertir bytes en una imagen y mostrarla
        try {
            // 1. Convierte los bytes a un BufferedImage
            MockImageDeserializer deserilizer = new MockByteImageDeserializer(user.get(0).getPhoto());
            BufferedImage image = deserilizer.deserialize();
            MockMainFrame mainFrame = new MockMainFrame(image);
            mainFrame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
