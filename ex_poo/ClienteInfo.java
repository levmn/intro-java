/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta		
classe, em seguida crie um objeto cliente, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package ex_poo;

public class ClienteInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente();
		
		System.out.println("\n\t\t\t**********CADASTRO CLIENTE*********");
		
		c1.setNome("Rubi");
		c1.setCpf("50306352893");
		c1.setIdade(37);		
		c1.setGenero("mulher");
		c1.setEmail("rubicontato@rubi.com");
		c1.status();
		
		System.out.println("\n\t\t************CADASTRO COMPUTADO COM SUCESSO!************");
	}
}	

