package ex_poo2;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void cadastro() {
		System.out.println("\n--------------CADASTRO--------------\n");
		System.out.println("O cavalo se chama "+this.getNome()+".");
		System.out.println("E tem "+this.getIdade()+" anos.");
		System.out.println("\n-------------------------------------");
	}

	@Override
	public void emitirSom() {
		System.out.println("\nO cavalo "+this.getNome()+" está relinchando...");
		System.out.println("Irrinhó");
	}

	@Override
	public void locomover() {
		System.out.println("\nO cavalo "+this.getNome()+" se locomove...");
		System.out.println("Correndo");
	}

}
