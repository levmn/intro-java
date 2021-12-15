/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta		
classe, em seguida crie um objeto cliente, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package poo;

public class cliente {
	private String clienteNome;
	private String clienteSobrenome;
	private String clienteApelido;
	private String clienteTel;	
	
	public void imprimir(){
		// TODO Auto-generated method stub
		System.out.println("\nO nome do cliente é "+clienteNome+" "+clienteSobrenome+", prefere ser chamado informalmente de "+clienteApelido+", \ne a forma de contatá-lo é pelo telefone "+clienteTel+".");
	}	
	
	public cliente (String nome, String sobrenome, String apelido, String telefone){
		clienteNome=nome;
		clienteSobrenome=sobrenome;
		clienteApelido=apelido;
		clienteTel=telefone;		
	}
	
	public String getClienteNome(){
		return clienteNome;
	}

	public void setClienteNome(String clienteNome){
		this.clienteNome = clienteNome;
	}

	public String getClienteSobrenome(){
		return clienteSobrenome;
	}

	public void setClienteSobrenome(String clienteSobrenome){
		this.clienteSobrenome = clienteSobrenome;
	}

	public String getClienteApelido(){
		return clienteApelido;
	}

	public void setClienteApelido(String clienteApelido) {
		this.clienteApelido = clienteApelido;
	}

	public String getClienteTel() {
		return clienteTel;
	}

	public void setClienteTel(String clienteTel) {
		this.clienteTel = clienteTel;
	}	
	
}
