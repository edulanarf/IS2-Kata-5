package ulpgc.es.app.control;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import ulpgc.es.app.control.Pojo.RandomUserMeResponse;
import ulpgc.es.app.model.User;

import java.io.IOException;

public class RandomUserProvider implements UserProvider {
    public static final String RANDOM_USER_URL = "https://randomuser.me/API";

    @Override
    public User provideNew() throws IOException {
        String text = Jsoup.connect(RANDOM_USER_URL).ignoreContentType(true).get().text();
        RandomUserMeResponse response = new Gson().fromJson(text, RandomUserMeResponse.class);
        return new RandomUserMeAdapter().adapt(response);
    }
}
