/*6(DO WHILE)- Escrever um programa que receba v�rios n�meros inteiros no teclado. 
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).*/

package ex_repeticao;

import java.util.*;

public class exercicio6dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num,soma=0,mult=0;
		float media=0;
		
		System.out.println("\nDigite 0 para interromper o programa e imprimir a m�dia dos m�ltiplos de 3.");
		
		System.out.println("\nInsira um n�mero: ");
		num = leia.nextInt();
		
		do{ 						
			if(num%3==0){
				soma+=num; 
				mult++;
				
				media=soma/mult;
			}
			System.out.println("\nInsira um n�mero: ");
			num = leia.nextInt();
		}
		while(num!=0);		
				
		System.out.println("\nA m�dia dos n�meros m�ltiplos de 3 � "+Math.round(media)+".");		
	}

}
