/*2) Fa�a um programa que receba 6 n�meros inteiros e mostre: 
  	               [][][][][][] // vetor: num[6]
	� Os n�meros pares digitados;  //if(numPar %2==0)
	� A soma dos n�meros pares digitados; somaPar+=num[x]
	� Os n�meros �mpares digitados;  //else
	� A quantidade de n�meros �mpares digitados.//qtImp++ */  

package ex_arrays;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int[] num=new int[6];
		int somaPar=0,qtImp=0,x;
						
		for(x=0;x<6;x++){
			System.out.println("\nInsira os n�meros: ");
			num[x] = leia.nextInt();
			
			if(num[x]%2==0){
				somaPar+=num[x];				
			}			
			else{
				qtImp++;				
			}			
		}
		
		for(x=0;x<6;x++){
			if(num[x]%2==0){
				System.out.println("\nN�mero par: "+num[x]+".");
			}
			else{		
				System.out.println("\nN�mero �mpar: "+num[x]+".");			
			}
		}		
		
		System.out.println("\nSomat�rio dos n�meros pares digitados: "+somaPar+".");		
		System.out.println("\nQuantidade de n�meros �mpares digitados: "+qtImp+".");
	}
}
