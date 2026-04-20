import java.util.UUID;

public class Users extends AbstractEntity {

    private String name;
    private String email;
    protected UUID id;

    public Users(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + getId() +
                ", Nome: " + name +
                ", Email: " + email;
    }

}
