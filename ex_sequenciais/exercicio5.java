/*5) Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/

package ex_sequenciais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float nota1,nota2,nota3,mediaPond;
		
		System.out.println("\nInforme a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("\nInforme a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("\nInforme a nota 3: ");
		nota3 = leia.nextFloat();
		
		mediaPond=(nota1*2+nota2*3+nota3*5) /10;
		System.out.println("\nSua nota média é: "+mediaPond);
	}

}
