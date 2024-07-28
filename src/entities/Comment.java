package entities;

public class Comment {
	//Atributos
	private String text;
	
	// Método Getter e Setter
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	// Método Construtor
	public Comment() {
		
	}
	
	public Comment(String text) {
		this.text = text;
	}
}
