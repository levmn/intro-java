/*5(DO WHILE)- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números digitados.*/

package ex_repeticao;

import java.util.*;

public class Exercicio5DoWhile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num,soma=0;
		
		System.out.println("\nDigite 0 para interromper o programa e obter a soma dos números digitados.");
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();	
		
		do{			
			soma+=num;
			
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();	
		}
		while(num!=0);
		
		System.out.println("\nA soma dos números digitados é "+soma+".");
	}
}
