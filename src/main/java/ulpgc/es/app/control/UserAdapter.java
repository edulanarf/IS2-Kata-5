package ulpgc.es.app.control;

import ulpgc.es.app.model.User;

public interface UserAdapter<T> {
    User adapt(T t);
}
