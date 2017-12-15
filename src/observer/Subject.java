package observer;

public interface Subject {

    public void registerReader(Observer observer);
    public void unregisterReader(Observer observer);
    public void notifyAllReaders();
}
