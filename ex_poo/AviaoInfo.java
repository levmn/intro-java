/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta 
classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e 
apresente as informa��es deste objeto no console.*/

package ex_poo;

public class AviaoInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nFicha do avi�o N�1:");			
		Aviao aero1 = new Aviao ("Dourado","M�dio","Alfredo D Luffy");
		aero1.status();
		
		System.out.println("\nFicha do avi�o N�2:");			
		Aviao aero2 = new Aviao ("Branco com faixa vermelha","Pequeno","Sofi R Silva");
		aero2.status();
	}
}
