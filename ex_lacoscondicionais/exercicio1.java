/*1) Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

package ex_lacoscondicionais;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,maior;
		
		System.out.printf("Escreva o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.printf("Escreva o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.printf("Escreva o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3){
			System.out.printf("\nO n�mero "+n1+" � o maior!");
			}else if(n2>n1 && n2>n3){
			System.out.printf("\nO n�mero "+n2+" � o maior!");
			}else{
			System.out.printf("\nO n�mero "+n3+" � o maior!");
			}
	}

}
