/*4) Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte
express�o:
inteiros e positivos: a, b, c
d=(r+s) /2 ,onde r=(a+b)� e s=(b+c)�*/

package ex_sequenciais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		double r,s,d;
		
		System.out.println("\nDigite um n�mero inteiro e positivo: ");
		a = leia.nextInt();
		System.out.println("\nDigite um segundo n�mero inteiro e positivo: ");
		b = leia.nextInt();
		System.out.println("\nDigite um terceiro n�mero inteiro e positivo: ");
		c = leia.nextInt();
		
		System.out.println("\nSe r=("+a+"+"+b+")*2 e s=("+b+"+"+c+")*2, o resultado de d=(r+s)/2 ser�: ");
		
		r=Math.pow(a+b,2); s=Math.pow(b+c,2);
		
		d=(r+s)/2;
		System.out.println("\nResultado da equa��o: "+d);
	}

}
