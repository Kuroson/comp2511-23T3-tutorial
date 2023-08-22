package youtube;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 */
public class Producer {
    private String name;
    private List<Video> videos = new ArrayList<Video>();
    // TODO Add Subscribers list

    public Producer(String name) {
        this.name = name;
    }

    public void addSubscriber(User user) {
        // TODO subscribe method
    }

    public void postVideo(String name, int length) {
        // TODO notify
    }

    @Override
    public String toString() {
        return name;
    }
}