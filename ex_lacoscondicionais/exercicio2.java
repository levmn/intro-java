/*2) Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

package ex_lacoscondicionais;

import java.util.*;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.printf("\nDigite o primeiro n�mero: ");
		a = leia.nextInt();
		System.out.printf("\nDigite o segundo n�mero: ");
		b = leia.nextInt();
		System.out.printf("\nDigite o terceiro n�mero: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("A ordem crescente �: "+a+", "+b+", "+c+".");
		}
		else if(a<=c && c<=b){
			System.out.println("A ordem crescente �: "+a+", "+c+", "+b+".");
		}
		else if(b<=a && a<=c){
			System.out.println("A ordem crescente �: "+b+", "+a+", "+c+".");
		}
		else if(b<=c && c<=a){
			System.out.println("A ordem crescente �: "+b+", "+c+", "+a+".");
		}
		else if(c<=a && a<=b){
			System.out.println("A ordem crescente �: "+c+", "+a+", "+b+".");
		}
		else {
			System.out.println("A ordem crescente �: "+c+", "+b+", "+a+".");
		}
	}

}
