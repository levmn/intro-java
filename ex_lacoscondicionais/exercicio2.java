/*2) Faça um programa que entre com três números e coloque em ordem crescente.*/

package ex_lacoscondicionais;

import java.util.*;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.printf("\nDigite o primeiro número: ");
		a = leia.nextInt();
		System.out.printf("\nDigite o segundo número: ");
		b = leia.nextInt();
		System.out.printf("\nDigite o terceiro número: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("A ordem crescente é: "+a+", "+b+", "+c+".");
		}
		else if(a<=c && c<=b){
			System.out.println("A ordem crescente é: "+a+", "+c+", "+b+".");
		}
		else if(b<=a && a<=c){
			System.out.println("A ordem crescente é: "+b+", "+a+", "+c+".");
		}
		else if(b<=c && c<=a){
			System.out.println("A ordem crescente é: "+b+", "+c+", "+a+".");
		}
		else if(c<=a && a<=b){
			System.out.println("A ordem crescente é: "+c+", "+a+", "+b+".");
		}
		else {
			System.out.println("A ordem crescente é: "+c+", "+b+", "+a+".");
		}
	}

}
