package ulpgc.es.control.Pojo;

public class RandomUserMe {
    private final String name;
    private final String surname;
    private final String email;
    private byte[] photo;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public record Name(String title, String first, String last){}

    public record Picture(String large, String medium, String thumbnail){}

}
