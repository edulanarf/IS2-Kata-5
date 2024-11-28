package ulpgc.es.app.control;

import ulpgc.es.app.control.Pojo.RandomUserMe;
import ulpgc.es.app.control.Pojo.RandomUserMeResponse;
import ulpgc.es.app.model.User;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;

public class RandomUserMeAdapter implements UserAdapter<RandomUserMeResponse> {

    @Override
    public User adapt(RandomUserMeResponse response) {
        RandomUserMe userMe = response.getResults().getFirst();
        User user = adapt(userMe);
        user.setphoto(downloadPhoto(userMe.getPicture().large()));
        return user;
    }

    private byte[] downloadPhoto(String url) {
        try {
            URLConnection conn = new URI(url).toURL().openConnection();
            return conn.getInputStream().readAllBytes();
        } catch (URISyntaxException | IOException e) {
            return new byte[0];
        }

    }

    private User adapt(RandomUserMe userMe){
        User user = new User(
                userMe.getName().first(),
                userMe.getName().last(),
                userMe.getEmail(),
                User.Gender.valueOf(firstUpperCase(userMe.getGender()))
                );
        return user;
    }

    private String firstUpperCase(String gender) {
        return gender.substring(0,1).toUpperCase()+ gender.substring(1);
    }
}
