/*4) Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package ex_lacoscondicionais;

import java.util.*;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num;
				
		System.out.println("\nInsira um número: ");
		num = leia.nextInt();
		
		if(num % 2==0){
			System.out.println("\nEste número é par e a raiz quadrada dele é: "+Math.round(Math.sqrt(num)));
		}
		else{
			System.out.println("\nEste némero é ímpar e elevado ao quadrado é: "+Math.round(Math.pow(num,2)));
		}
	}

}
