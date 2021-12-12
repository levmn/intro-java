/*2) Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, 
meses e dias.*/

package ex_sequenciais;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int ano,dias,meses;
		
		ano=35; meses=30;
		
		System.out.println("\nDigite sua idade em dias: ");
		dias = leia.nextInt();
		
		ano=dias/365; meses=dias/30;
		
		System.out.println("\nSua idade em anos são: "+ano+" anos.");
		System.out.println("\nSua idade em meses são: "+meses+" meses.");
	}

}
