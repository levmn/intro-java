/*2(FOR)- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/

package ex_repeticao;

import java.util.*;

public class Exercicio2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int x,num,par=0,impar=0;
		
		for(x=1;x<=10;x++){
			System.out.printf("\nInsira um n�mero qualquer: ");
			num = leia.nextInt();
			if(num%2==0){
				par++;
			}
			else{
				impar++;
			}
		}
		System.out.println("\nA quantidade de n�meros pares � "+par+" e de n�meros �mpares � "+impar+".");		
	}

}
