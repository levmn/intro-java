/*5(DO WHILE)- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros digitados.*/

package ex_repeticao;

import java.util.*;

public class Exercicio5DoWhile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num,soma=0;
		
		System.out.println("\nDigite 0 para interromper o programa e obter a soma dos n�meros digitados.");
		
		System.out.println("\nEntre com um n�mero: ");
		num = leia.nextInt();	
		
		do{			
			soma+=num;
			
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();	
		}
		while(num!=0);
		
		System.out.println("\nA soma dos n�meros digitados � "+soma+".");
	}
}
