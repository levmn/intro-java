/*3) Faça um programa que receba a idade de uma pessoa e mostre na saéda em qual
categoria ela se encontra:
.10-14 infantil
.15-17 juvenil
.18-25 adulto*/

package ex_lacoscondicionais;

import java.util.*;

public class Exercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("\nInsira a sua idade: ");
		idade = leia.nextInt();		
		
		if(idade>=10 && idade<15){
			System.out.println("\nSua categoria é Infantil!");
		}
		else if(idade>=15 && idade<17){
			System.out.println("\nSua categoria é Juvenil!");
		}
		else if(idade>=18 && idade<25){
			System.out.println("\nSua categoria é Adulto!");
		}
		else{
			System.out.println("\nNão há categoria para essa idade.");
		}
	}
}
