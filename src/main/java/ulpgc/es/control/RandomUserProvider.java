package ulpgc.es.control;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import ulpgc.es.control.Pojo.RandomUserMeResponse;
import ulpgc.es.model.User;

import java.io.IOException;

public class RandomUserProvider implements UserProvider {
    public static final String RANDOM_USER_URL = "https://randomuser.me/API";

    @Override
    public User provideNew() throws IOException {
        String text = Jsoup.connect(RANDOM_USER_URL).ignoreContentType(true).get().text();
        RandomUserMeResponse response = new Gson().fromJson(text, RandomUserMeResponse.class);
        return null;
    }
}
