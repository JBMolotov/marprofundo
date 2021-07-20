package view;

public class Pergunta {
	public String pergunta;
	public String categoria;
	public String alternativa[];
	public char dificuldade;
	
	public Pergunta(String pergunta, String categoria, String alternativa[], char dificuldade) {
		this.pergunta = pergunta;
		this.categoria = categoria;
		this.alternativa = alternativa;
		this.dificuldade = dificuldade;
	}
	
	public static void main(String[] args) {
	
	}

	public String getPergunta() {
		return this.pergunta;
	}
	
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String[] getAlternativa() {
		return this.alternativa;
	}
	
	public void setAlternativa(String alternativa[]) {
		this.alternativa = alternativa;
	}
	
	public char getDificuldade() {
		return this.dificuldade;
	}
	
	public void setDificuldade(char dificuldade) {
		this.dificuldade = dificuldade;
	}
	
}
