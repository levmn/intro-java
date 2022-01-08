package ex_poo2;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public void cadastro() {
		System.out.println("\n--------------CADASTRO--------------\n");
		System.out.println("A pregui�a se chama "+this.getNome()+".");
		System.out.println("E tem "+this.getIdade()+" anos.");
		System.out.println("\n-------------------------------------");
	}

	@Override
	public void emitirSom() {
		System.out.println("\nA pregui�a "+this.getNome()+" est� tranquila...");
		System.out.println("Apenas emito som se estiver em amea�a...*bocejo*");
	}

	@Override
	public void locomover() {
		System.out.println("\nA pregui�a "+this.getNome()+" se locomove...");
		System.out.println("Beeeeeeeeem devagar...");
	}
	
	public void subir() {
		System.out.println("\nA pregui�a sobe em �rvores...");
	}

}
