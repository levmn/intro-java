/*1) Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros.
 O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
 A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

package ex_arrays;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int soma;
		int[] a=new int[6];		
		a[0]=1; a[1]=0; a[2]=5; a[3]=-2; a[4]=-5; a[5]=7;
		
		soma=a[0]+a[1]+a[5];
		System.out.println("\nA somat�ria dos valores das posi��es A[0], A[1], A[5] �: "+soma+".");
		
		a[4]=100;
		
		System.out.println("\nO valor do vetor A[0] �: "+a[0]+".");
		System.out.println("\nO valor do vetor A[1] �: "+a[1]+".");
		System.out.println("\nO valor do vetor A[2] �: "+a[2]+".");
		System.out.println("\nO valor do vetor A[3] �: "+a[3]+".");
		System.out.println("\nO valor do vetor A[4] �: "+a[4]+".");
		System.out.println("\nO valor do vetor A[5] �: "+a[5]+".");
	}

}
