public class Tweets {
    String id;
    String userID;
    TweetContent content;

    public Tweets(String id, String userID, TweetContent content) {
        this.id = id;
        this.userID = userID;
        this.content = content;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public TweetContent getContent() {
        return this.content;
    }

    public void setContent(TweetContent content) {
        this.content = content;
    }
}
