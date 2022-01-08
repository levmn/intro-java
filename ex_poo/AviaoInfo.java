/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta 
classe, em seguida crie um objeto avião, defina as instancias deste objeto e 
apresente as informações deste objeto no console.*/

package ex_poo;

public class AviaoInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nFicha do avião Nº1:");			
		Aviao aero1 = new Aviao ("Dourado","Médio","Alfredo D Luffy");
		aero1.status();
		
		System.out.println("\nFicha do avião Nº2:");			
		Aviao aero2 = new Aviao ("Branco com faixa vermelha","Pequeno","Sofi R Silva");
		aero2.status();
	}
}
