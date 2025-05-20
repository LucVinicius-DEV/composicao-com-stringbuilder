package entities;

// Classe que representa um comentário em um post
public class Comment {
  
  // Atributo que armazena o texto do comentário
  private String text;
  
  // Construtor padrão (vazio)
  public Comment () {
  }
  
  // Construtor com parâmetro para inicializar o comentário com um texto
  public Comment(String text) {
    this.text = text;
  }
  
  // Método getter para obter o texto do comentário
  public String getText() {
    return text;
  }
  
  // Método setter para alterar o texto do comentário
  public void setText(String text) {
    this.text = text;
  }
}
