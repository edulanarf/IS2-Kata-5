package ulpgc.es.app;

import ulpgc.es.app.control.LoadRandomUserCommand;
import ulpgc.es.app.model.User;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LoadRandomUserCommand command = new LoadRandomUserCommand(100);
        command.execute();
        for(User user: command.getUsers()){
            System.out.println(user.getName());
        }
    }
}
