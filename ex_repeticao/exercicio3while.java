/*3(WHILE)- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com
menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/

package ex_repeticao;

import java.util.*;

public class Exercicio3While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);		
						
		int idade=0,id21=0,id50=0;
		
		System.out.println("\nInfome -99 para parar o programa!");
		
		System.out.println("\nInsira as idades: ");
		idade = leia.nextInt();
		
		while(idade!=-99){
			if(idade<21){
				id21++;				
			}
			else if(idade>50){
				id50++;
			}
			else{
				System.out.println("\nInsira uma idade menor que 21 ou maior que 50.");
			}
			System.out.println("\nInsira as idades: ");
			idade = leia.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é "+id21+".");
		System.out.println("\nO total de pessoas com mais de 50 anos é "+id50+".");		
	}

}
