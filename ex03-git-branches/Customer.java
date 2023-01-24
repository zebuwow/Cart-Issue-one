public class Customer {
    private String name;
    private String email;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String user) {
        name = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String userEmail) {
        email = userEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int idToSet) {
        id = idToSet;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nEmail: " + email + "\nID: " + id;
    }
}