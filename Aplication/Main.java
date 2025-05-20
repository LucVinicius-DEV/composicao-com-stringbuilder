// Importa classes necessárias
import java.text.SimpleDateFormat;
import java.text.ParseException;
import entities.Post;
import entities.Comment;

public class Main {
  
  public static void main(String[] args) throws ParseException {
    
    // Cria formatador de data para converter strings em objetos Date
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    // Cria objetos Comment (comentários)
    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome!");
    
    // Cria primeiro Post com data, título, conteúdo e número de likes
    Post p1 = new Post(
      sdf.parse("21/06/2018 13:05:44"),
      "Traveling to New Zealand",
      "I'm going to visit this wonderful country!",
      12
    );
    
    // Adiciona comentários ao primeiro post (composição)
    p1.addComment(c1);
    p1.addComment(c2);
    
    // Cria mais comentários para o segundo post
    Comment c3 = new Comment("Good night");
    Comment c4 = new Comment("May the Force be with you");
    
    // Cria segundo Post
    Post p2 = new Post(
      sdf.parse("28/07/2018 23:14:19"),
      "Good night guys",
      "See you tomorrow",
      5
    );
    
    // Adiciona comentários ao segundo post (composição)
    p2.addComment(c3);
    p2.addComment(c4);
    
    // Imprime os posts formatados usando o método toString() com StringBuilder
    System.out.println(p1);
    System.out.println(p2);
  }
}
