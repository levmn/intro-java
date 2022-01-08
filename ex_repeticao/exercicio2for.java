/*2(FOR)- Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/

package ex_repeticao;

import java.util.*;

public class Exercicio2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int x,num,par=0,impar=0;
		
		for(x=1;x<=10;x++){
			System.out.printf("\nInsira um número qualquer: ");
			num = leia.nextInt();
			if(num%2==0){
				par++;
			}
			else{
				impar++;
			}
		}
		System.out.println("\nA quantidade de números pares é "+par+" e de números ímpares é "+impar+".");		
	}

}
