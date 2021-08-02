public class Unit10Lab3Publisher extends Publisher{

    public Unit10Lab3Publisher(int max) {
        super(max);
    }
    
    @Override
    public void notifySubscribers() {
        if (subscriberList.size() < 3) 
            super.notifySubscribers();
        else {
            for (int i = 0; i < 3; i ++)
                ((Unit10Lab3Subscriber) subscriberList.get(i)).update(i + 1);
        }
    }
}
