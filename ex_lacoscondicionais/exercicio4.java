/*4) Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package ex_lacoscondicionais;

import java.util.*;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num;
				
		System.out.println("\nInsira um n�mero: ");
		num = leia.nextInt();
		
		if(num % 2==0){
			System.out.println("\nEste n�mero � par e a raiz quadrada dele �: "+Math.round(Math.sqrt(num)));
		}
		else{
			System.out.println("\nEste n�mero � �mpar e elevado ao quadrado �: "+Math.round(Math.pow(num,2)));
		}
	}

}
