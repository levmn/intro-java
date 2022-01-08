package ex_poo2;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);		
	}
	
	public void cadastro() {
		System.out.println("\n--------------C�ODASTRO--------------\n");
		System.out.println("O cachorro se chama "+this.getNome()+".");
		System.out.println("E tem "+this.getIdade()+" anos.");
		System.out.println("\n--------------------------------------");
	}

	@Override
	public void emitirSom() {
		System.out.println("\nO cachorro "+this.getNome()+" est� latindo...");
		System.out.println("Auauau uuuu");
	}

	@Override
	public void locomover() {
		System.out.println("\nO cachorro "+this.getNome()+" se locomove...");
		System.out.println("Correndo");
	}
	
}
