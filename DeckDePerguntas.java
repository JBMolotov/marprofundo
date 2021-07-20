package view;

public class DeckDePerguntas {
	public Pergunta[] arrayPerguntas;
	public int nroPerguntas;
	public int limitePerguntas;
	public Random rand;
	
	public DeckDePerguntas(int n) {
		this.arrayPerguntas = new Pergunta[n];
		this.nroPerguntas = 0;
		this.limitePerguntas = n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void inserirPergunta(Pergunta p) {
		if(nroPerguntas == limitePerguntas)
			throw new IllegalArgumentException();
		
		arrayPerguntas[nroPerguntas] = p;
	}
	
	public void imprimirPerguntas() {
		
	}
}
