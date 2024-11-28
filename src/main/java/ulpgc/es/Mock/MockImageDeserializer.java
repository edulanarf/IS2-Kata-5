package ulpgc.es.Mock;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface MockImageDeserializer {
    BufferedImage deserialize() throws IOException;
}
