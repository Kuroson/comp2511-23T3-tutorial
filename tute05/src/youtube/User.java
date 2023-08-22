package youtube;

/**
 * Observer
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(Producer user) {
        user.addSubscriber(this);
    }

    public void alertNewVideo(Video video) {
        // TODO update method
    }

    @Override
    public String toString() {
        return name;
    }
}