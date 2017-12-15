package observer;

public class Client {

    public static void main(String[] args) {
        Observer observer1 = new BlogReader("Asia");
        Observer observer2 = new BlogReader("Ola");
        Observer observer3 = new BlogReader("Rafek");

        MyBlog blog = new MyBlog();
        blog.registerReader(observer1);
        blog.registerReader(observer2);

        blog.addNewPost();
        blog.registerReader(observer3);
        blog.addNewPost();
        blog.unregisterReader(observer1);
        blog.addNewPost();




    }
}
