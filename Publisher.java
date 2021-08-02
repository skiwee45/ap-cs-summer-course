import java.util.ArrayList;
import java.util.List;

public class Publisher {
    protected List<Subscriber> subscriberList;
    protected int maximumSubscribers;

    public Publisher(int max) {
        // An array stores subscribers
        // Maximum number of subscribers
        maximumSubscribers = max;
        subscriberList = new ArrayList<>();
    }

    public void register(Subscriber s) {
        // Re gister a subscriber unless t he subscriber array is f ull
        if (subscriberList.size() < maximumSubscribers)
            subscriberList.add(s);
        else
            System.out.println("ERROR: Subscriber List is full");
    }

    public void notifySubscribers() {
        // Iterate through the subscriber array & invoke update () methods
        for (int i = 0; i < subscriberList.size(); i ++)
            subscriberList.get(i).update();
    }
}
