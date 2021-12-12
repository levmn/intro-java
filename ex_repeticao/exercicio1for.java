/*1(FOR)- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.*/

package ex_repeticao;

public class exercicio1for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		for(n=1000;n<2000;n++){
			if(n%11==5){
				System.out.printf("\n %d",n);
			}
		}		
	}

}
