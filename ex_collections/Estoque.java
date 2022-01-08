/*3) Crie uma um programa para trabalhar com estoque de uma loja, o programa 
dever� trabalhar com Collection do tipo List do Java para manipular os dados 
desse estoque, o programa dever� atender as seguintes funcionalidades:

Armazenar dados da list;
Remover dados da list;
Atualizar dados da list;
Apresentar todos os dados da list.*/

package ex_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList <String> estoque = new ArrayList();
		
		do {
			System.out.println("\n--------------- MENU DE ESTOQUE ---------------\n");
			System.out.println("[1] Armazenar um produto em estoque.");
			System.out.println("[2] Remover um produto em estoque.");
			System.out.println("[3] Atualizar um produto em estoque.");
			System.out.println("[4] Visualizar todos os produtos em estoque.");
			System.out.println("[0] Sair do programa.");
			System.out.println("\n-----------------------------------------------");
			
			System.out.println("\nDigite a op��o desejada: ");
			op=leia.nextInt();
			
			switch(op) {
			case 1: 
				leia.nextLine();
				System.out.println("\nInforme o produto que quer armazenar: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nInforme o produto que quer remover: ");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				}else{
					System.out.println("\nProduto indispon�vel para remo��o.");
				}
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nInforme o produto que quer alterar: "); 
				String verifica = leia.nextLine();
				System.out.println("\nInforme o produto que entrar� no lugar de "+verifica+": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else{
					System.out.println("\nProduto indispon�vel para altera��o.");
				}
				System.out.println("\n------------------- ESTOQUE -------------------\n");				
				
				for(int i = 0; i < estoque.size(); i++){
					System.out.println(estoque.get(i));
				}
				
				System.out.println("\n-----------------------------------------------");
				break;
				
			case 4:
				System.out.println("\n------------------- ESTOQUE -------------------\n");				
				
				for(int i = 0; i < estoque.size(); i++){
					System.out.println(estoque.get(i));
				}
				
				System.out.println("\n-----------------------------------------------");
				break;
				
			default: 
				System.out.println("\nPrograma finalizado.");
			}
			
		}while(op != 0);
				
	}

}
