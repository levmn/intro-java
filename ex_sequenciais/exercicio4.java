/*4) Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte
expressão:
inteiros e positivos: a, b, c
d=(r+s) /2 ,onde r=(a+b)² e s=(b+c)²*/

package ex_sequenciais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		double r,s,d;
		
		System.out.println("\nDigite um número inteiro e positivo: ");
		a = leia.nextInt();
		System.out.println("\nDigite um segundo número inteiro e positivo: ");
		b = leia.nextInt();
		System.out.println("\nDigite um terceiro número inteiro e positivo: ");
		c = leia.nextInt();
		
		System.out.println("\nSe r=("+a+"+"+b+")*2 e s=("+b+"+"+c+")*2, o resultado de d=(r+s)/2 será: ");
		
		r=Math.pow(a+b,2); s=Math.pow(b+c,2);
		
		d=(r+s)/2;
		System.out.println("\nResultado da equação: "+d);
	}

}
