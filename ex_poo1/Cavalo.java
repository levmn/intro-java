package ex_poo1;

public class Cavalo extends Animal {
	private boolean correr;
	
	public Cavalo(String nome, int idade, String som, boolean correr) {
		super(nome, idade, som);
		this.correr = true;
	}	

	public boolean getCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	public void imprimir() {
		System.out.println("\n----------FICHA DO BICHINHO----------");
		System.out.println("\nNome do cavalo: "+this.getNome()+".");
		System.out.println("Idade do cavalo: "+this.getIdade()+".");
		System.out.println("Som que emite: "+this.getSom()+".");
		System.out.println("Ele corre? "+this.getCorrer()+".");
		System.out.println("\n-------------------------------------\n");
	}	
}
