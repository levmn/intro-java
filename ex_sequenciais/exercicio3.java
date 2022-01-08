/*3) Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e
mostre-o expresso em horas, minutos e segundos.*/

package ex_sequenciais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int segundos,minutos,horas;
		
		minutos=60; horas=3600;
		
		System.out.println("\nDigite a duração do evento em segundos: ");
		segundos = leia.nextInt();
		
		minutos=segundos/60; horas=segundos/3600;
		
		System.out.println("\nA duração do evento em horas foi: "+horas);
		System.out.println("\nA duração do evento em minutos foi: "+minutos);
		System.out.println("\nA duração do evento em segundos foi: "+segundos);
	}

}
