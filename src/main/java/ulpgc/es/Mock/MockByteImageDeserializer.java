package ulpgc.es.Mock;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MockByteImageDeserializer implements MockImageDeserializer{
    private byte[] photo;

    public MockByteImageDeserializer(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public BufferedImage deserialize() throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(photo);
        return ImageIO.read(bis); //Devuelve un BufferedImage (matriz de pixeles)
    }
}
