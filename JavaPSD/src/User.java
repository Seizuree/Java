public class User {
    String id;
    Profile profile;
    Account account;

    public User(String id, Profile profile, Account account) {
        this.id = id;
        this.profile = profile;
        this.account = account;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
