package ulpgc.es.Mock;

import ulpgc.es.app.control.LoadRandomUserCommand;
import ulpgc.es.app.model.User;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

public class MockMain {
    public static void main(String[] args) throws IOException {

        LoadRandomUserCommand command = new LoadRandomUserCommand(10);
        command.execute();
        List<User> users = command.getUsers();
        try {
            MockImageDeserializer deserializer = new MockByteImageDeserializer(users);
            List<BufferedImage> images = deserializer.deserialize();
            MockMainFrame mainFrame = new MockMainFrame(images);
            mainFrame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
