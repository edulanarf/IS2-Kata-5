package ulpgc.es.app.persistence;

import ulpgc.es.Mock.MockImageDeserializer;
import ulpgc.es.app.model.User;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ByteImageDeserializer implements ImageDeserializer {
    private List<User> users;

    public ByteImageDeserializer(List<User> users) {
        this.users = users;
    }

    @Override
    public List<BufferedImage> deserialize() throws IOException {
        List<byte[]> photos = selectphotos(users);
        List<BufferedImage> images = new ArrayList<>();
        for(byte[] photo: photos){
            ByteArrayInputStream bis = new ByteArrayInputStream(photo);
            images.add(ImageIO.read(bis));
        }
        return images;
    }

    private List<byte[]> selectphotos(List<User>users) {
        List<byte[]>photos= new ArrayList<>();
        for(User user: users){
            photos.add(user.getPhoto());
        }
        return photos;
    }


}
