package ulpgc.es.app;

import ulpgc.es.Mock.MockByteImageDeserializer;
import ulpgc.es.Mock.MockImageDeserializer;
import ulpgc.es.Mock.MockMainFrame;
import ulpgc.es.app.control.LoadRandomUserCommand;
import ulpgc.es.app.model.User;
import ulpgc.es.app.persistence.ByteImageDeserializer;
import ulpgc.es.app.persistence.ImageDeserializer;
import ulpgc.es.app.view.MainFrame;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        LoadRandomUserCommand command = new LoadRandomUserCommand(100);
        command.execute();
        List<User> users = command.getUsers();
        try {
            ImageDeserializer deserializer = new ByteImageDeserializer(users);
            List<BufferedImage> images = deserializer.deserialize();
            MainFrame mainFrame = new MainFrame(images);
            mainFrame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
