import java.util.Date;

public class Profile {
    String name;
    String bio;
    Date dob;

    public Profile(String name, String bio, Date dob) {
        this.name = name;
        this.bio = bio;
        this.dob = dob;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
