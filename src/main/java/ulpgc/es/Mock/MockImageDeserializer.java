package ulpgc.es.Mock;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

public interface MockImageDeserializer {
    List<BufferedImage> deserialize() throws IOException;
}
