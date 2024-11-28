package ulpgc.es.app.control;

import ulpgc.es.app.model.User;

import java.io.IOException;

public interface UserProvider {
    User provideNew() throws IOException;
}
