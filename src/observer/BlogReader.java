package observer;

public class BlogReader implements Observer {

    String name;
    int postsToRead = 0;

    public BlogReader(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        postsToRead++;
        System.out.println(this.name + " , you have now " + postsToRead + " posts to read on blog.");

    }
}
