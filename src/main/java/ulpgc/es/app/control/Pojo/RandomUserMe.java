package ulpgc.es.app.control.Pojo;

public class RandomUserMe {
    private Name name;
    private String email;
    private String gender;
    private Picture picture;

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public Picture getPicture() {
        return picture;
    }

    public record Name(String title, String first, String last){}

    public record Picture(String large, String medium, String thumbnail){}

}
