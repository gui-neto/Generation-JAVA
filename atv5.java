package atividades;

import java.util.Scanner;

public class atv5 {
	public static void main(String ags[]) {
		
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o codigo do produto (1 a 6): ");
		int codigo = leia.nextInt();
		
	System.out.println("Digite a quantidade comprada: ");
		int compra = leia.nextInt();
		
	String nome = "";
	float preco = 0;
	
	switch (codigo) {
	case 1:
		nome = "Cachorro quente";
		preco = (float) 10.00;
		break;
		
	case 2:
		nome = "X-salada";
		preco = (float) 15.00;
		break;
		
	case 3:
		nome = "X-bacon";
		preco = (float) 18.00;
		break;
	
	case 4:
		nome = "Bauru";
		preco = (float) 12.00;
		break;
		 
	case 5:
		nome = "Refrigerante";
		preco = (float) 8.00;
		break;
		 
	case 6:
		nome = "Suco de laranja";
		preco = (float) 13.00;
		break;
		
		default:
			System.out.println("Código de produto invalido.");
	}
	
	float total = compra * preco;
	
	System.out.println("Produto comprado: "+ nome);
	System.out.println("Valor total R$: "+ total);
	}

}
