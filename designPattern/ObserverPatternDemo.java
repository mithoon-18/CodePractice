package designPattern;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Observer {
    void update(String message);
}

// Subject Interface
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}

// Concrete Subject
class YouTubeChannel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : subscribers) {
            o.update(message);
        }
    }

    // Custom method to simulate uploading a video
    public void uploadVideo(String videoTitle) {
        System.out.println("Channel uploaded a new video: " + videoTitle);
        notifyObservers("New video uploaded: " + videoTitle);
    }
}

// Concrete Observer
class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

// Test Class
public class ObserverPatternDemo {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();

        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");
        Observer sub3 = new Subscriber("Charlie");

        channel.registerObserver(sub1);
        channel.registerObserver(sub2);
        channel.registerObserver(sub3);

        channel.uploadVideo("Observer Pattern in Java");

        System.out.println("\nBob unsubscribes...\n");
        channel.removeObserver(sub2);

        channel.uploadVideo("Factory Pattern in Java");
    }
}

