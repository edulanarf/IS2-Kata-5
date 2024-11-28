package ulpgc.es.app.persistence;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface ImageDeserializer {
    BufferedImage deserialize() throws IOException;
}
