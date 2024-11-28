package ulpgc.es.app.persistence;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

public interface ImageDeserializer {
    List<BufferedImage> deserialize() throws IOException;
}
