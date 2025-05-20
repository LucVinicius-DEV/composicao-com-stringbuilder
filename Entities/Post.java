package entities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;

// Classe que representa um post com comentários (composição)
public class Post {
  
  // Formatador de data estático (compartilhado por todos os posts)
  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  
  // Atributos básicos do post
  private Date moment;      // Data/hora de criação
  private String title;     // Título do post
  private String content;   // Conteúdo/texto do post
  private Integer likes;    // Número de curtidas
  
  // Relação de composição: um Post contém vários Comments
  private List<Comment> comments = new ArrayList<>();
  
  // Construtor padrão
  public Post() {
  }
  
  // Construtor com parâmetros (não inclui comentários, que são adicionados depois)
  public Post(Date moment, String title, String content, Integer likes) {
    this.moment = moment;
    this.title = title;
    this.content = content;
    this.likes = likes;
  }
  
  // Métodos getters e setters para os atributos básicos
  public Date getMoment() {
    return moment;
  }
  
  public void setMoment(Date moment) {
    this.moment = moment;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getContent() {
    return content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
  
  public Integer getLikes() {
    return likes;
  }
  
  public void setLikes(Integer likes) {
    this.likes = likes;
  }
  
  // Retorna a lista de comentários (sem setter para proteger a composição)
  public List<Comment> getComments() {
    return comments;
  }
  
  // Métodos para manipular a composição (adicionar/remover comentários)
  public void addComment(Comment comment){
    comments.add(comment);
  }
  
  public void removeComment(Comment comment) {
    comments.remove(comment);
  }
  
  // Sobrescreve o método toString() usando StringBuilder para eficiência
  @Override
  public String toString() {
    // Cria um StringBuilder para concatenar strings de forma eficiente
    StringBuilder sb = new StringBuilder();
    
    // Adiciona as informações do post ao StringBuilder
    sb.append(title + "\n");
    sb.append(likes);
    sb.append(" Likes - ");
    sb.append(sdf.format(moment) + "\n");
    sb.append(content + "\n");
    sb.append("Comments:\n");
    
    // Percorre todos os comentários e adiciona ao StringBuilder
    for (Comment c : comments) {
      sb.append(c.getText() + "\n");
    }
    
    // Converte o StringBuilder para String e retorna
    return sb.toString();
  }
}
