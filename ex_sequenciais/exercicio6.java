/*6) Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano, 
P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �: 
d= raiz quadrada de (x2 � x1)� + (y2 � y1)�*/

package ex_sequenciais;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double x1,y1,x2,y2,dx,dy,dxy,d;
		
		System.out.println("\nInsira o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("\nInsira o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("\nInsira o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("\nInsira o valor de y2: ");
		y2 = leia.nextDouble();		
		
		dx=Math.pow((x2-x1),2); dy=Math.pow((y2-y1),2);
		dxy=dx+dy; d=Math.sqrt(dxy);
		
		System.out.println("\nA dist�ncia entre os dois pontos � de: "+Math.round(d));
	}

}
