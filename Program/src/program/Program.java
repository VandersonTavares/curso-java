package program;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        
       Comment c1 = new Comment("Have a nice Trips");
       Comment c2 = new Comment("Wow That's Awesome!");
       Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),//pode acontecer um erro ao converter a data (ParseException)
               "Traveling to New Zeland" ,
               "Im going to visit this wonderful country!",12);
       p1.addComment(c1);
       p1.addComment(c2);
       
        System.out.println(p1);
       
        
    }
    
}
