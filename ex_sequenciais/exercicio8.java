/*8) O custo ao consumidor de um carro novo � a soma do -custo de f�brica- com a -percentagem do 
distribuidor- e dos -impostos- (aplicados ao custo de f�brica). Supondo que a percentagem do 
distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica 
de um carro e escreva o custo ao consumidor. */

package ex_sequenciais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);		
		
		float cf,pd=28,i=45,custoCons;
		
		System.out.println("\nInsira o custo de f�brica do seu ve�culo: ");
		cf = leia.nextFloat();
		
		pd=cf+(cf*pd/100); i=cf+(cf*i/100);
		
		custoCons=cf+pd+i;
		
		System.out.println("\nO custo do consumidor � de: "+Math.round(custoCons));
	}

}
