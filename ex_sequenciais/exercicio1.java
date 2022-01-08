/*1) Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa apenas em dias.*/

package ex_sequenciais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade,ano,dias,meses;
		
		dias=30; meses=12; ano=30*12;
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nSua idade é: "+idade+" anos");
		System.out.println("\n"+idade+" anos é equivalente a: "+ano*idade+" dias.");
	}

}
