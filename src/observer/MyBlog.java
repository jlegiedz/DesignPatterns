package observer;

import java.util.ArrayList;
import java.util.List;

public class MyBlog implements Subject {

    List<Observer> listOfReaders = new ArrayList<>();


    @Override
    public void registerReader(Observer observer) {
        listOfReaders.add(observer);
    }

    @Override
    public void unregisterReader(Observer observer) {
        listOfReaders.remove(observer);
    }

    @Override
    public void notifyAllReaders() {
        for (Observer o : listOfReaders) {
            o.update();
        }
    }


    //blog knows that once the post is added it has to notify all users about this
    public void addNewPost(){
        System.out.println("A new post is published on the blog");
        notifyAllReaders();
    }
}
