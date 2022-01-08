/*2) Implemente um programa que crie os 3 tipos de animais definidos no 
exercício anterior e invoque o método que emite o som de cada um de forma 
polimórfica, isto é, independente do tipo de animal.*/

package ex_poo2;

public abstract class Animal {
	protected String nome;
	protected int idade;
	
	public abstract void emitirSom();
	public abstract void locomover();	
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
	
}

