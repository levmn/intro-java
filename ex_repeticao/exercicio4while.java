/*4(WHILE)- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas	
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:
. n�mero de pessoas calmas; (cal)
. n�mero de mulheres nervosas; (fNer)
. n�mero de homens agressivos; (mAgr)
. n�mero de outros calmos; (oCal)
. n�mero de pessoas nervosas com mais de 40 anos; (maisNer) 
. n�mero de pessoas calmas com menos de 18 anos. (menosCal)*/ 

package ex_repeticao;

import java.util.*;

public class exercicio4while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade,sexo,temp,cal=0,fNer=0,mAgr=0,oCal=0,maisNer=0,menosCal=0,pessoa=0;
				
		while(pessoa<5){
			System.out.println("\nInforme a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\n1 - Feminino");
			System.out.println("\n2 - Masculino");
			System.out.println("\n3 - Outros");
			System.out.println("\nInforme seu sexo: ");					
			sexo = leia.nextInt();
			
			System.out.println("\n1 - Calmo(a/e)");
			System.out.println("\n2 - Nervoso(a/e)");
			System.out.println("\n3 - Agressivo(a/e)");
			System.out.println("\nInforme o seu temperamento: ");					
			temp = leia.nextInt();
			
			if(temp==1){
				cal++;
			}
			if(sexo==1 && temp==2){
				fNer++;
			}
			if(sexo==2 && temp==3){
				mAgr++;
			}
			if(sexo==3 && temp==1){
				oCal++;
			}
			if(idade>40 && temp==2){
				maisNer++;
			}
			if(idade<18 && temp==1){
				menosCal++;
			}
			pessoa++;
		}		
		System.out.println("\nResultado da pesquisa:");
		
		System.out.println("\nN�mero de pessoas calmas: "+cal+".");
		System.out.println("\nN�mero de mulheres nervosas: "+fNer+".");
		System.out.println("\nN�mero de homens agressivos: "+mAgr+".");
		System.out.println("\nN�mero de outros calmos: "+oCal+".");
		System.out.println("\nN�mero de pessoas com mais de 40 anos nervosas: "+maisNer+".");
		System.out.println("\nN�mero de pessoas com menos de 18 anos calmas: "+menosCal+".");		
	}

}
