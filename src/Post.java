package oop;
import java.util.Date;
public class Post {

    /*

    int id


     */
    public int id;
    public String title;
    public String content;
    public String author;
    public Date created_at;

    public static void main(String[] args) {
        Post post = new Post ();
        post.id = 1;
        post.title = "Day in the Life";
        post.content = "It happens every day...";
        post.author = "Overlord";
        post.created_at = new Date();

        System.out.println(post.title);

    }

}

