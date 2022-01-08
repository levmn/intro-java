package ex_poo1;

public class Preguica extends Animal {
	private boolean subir;
	
	public Preguica(String nome, int idade, String som, boolean subir) {
		super(nome, idade, som);
		this.subir = true;
	}	
	
	public void subirArvore(){
	}
	
	public boolean getSubir() {
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}
	
	public void imprimir() {
		System.out.println("\n----------FICHA DO BICHINHO----------");
		System.out.println("\nNome da preguiça: "+this.getNome()+".");
		System.out.println("Idade da preguiça: "+this.getIdade()+".");
		System.out.println("Som que emite: "+this.getSom()+".");
		System.out.println("Ela sobe em árvores? "+this.getSubir()+".");
		System.out.println("\n-------------------------------------\n");
	}
}
