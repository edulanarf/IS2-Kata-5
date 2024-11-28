package ulpgc.es.app.persistence;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteImageDeserializer implements ImageDeserializer{
    private final byte[] photo;

    public ByteImageDeserializer(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public BufferedImage deserialize() throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(photo);
        return ImageIO.read(bis);
    }
}
