package atividades5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex01fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String> ( );
		
		int opcao;
		String nome;
		
		while(true) {
		
		System.out.println("###############################################################################");
		System.out.println("                                                                               ");
		System.out.println("                     1 - Adicionar Clientes na fila                            ");
		System.out.println("                     2 - Listar todos os Clientes                              ");
		System.out.println("                     3 - Retirar Cliente da Fila                               ");
		System.out.println("                     0 - Sair                                                  ");
		System.out.println("                                                                               ");
		System.out.println("###############################################################################");
		System.out.println("                      	ENTRE COM A OPÇÃO DESEJADA:                            ");
		System.out.println("                                                                               ");
		
		opcao = leia.nextInt();
		
		if (opcao == 0) {
			System.out.println("\nEncerrando programa, Obrigado!");
			leia.close();
			System.exit(0);
		}
		if (opcao == 1) {
			System.out.println("\nDigite o nome do cliente: ");
			nome = leia.next();
			fila.add(nome);
			System.out.println("\nCliente "+nome+ " adicionado.");
		}
		if (opcao == 2) {
			System.out.println("\nElementos na fila: "+fila);
		}
		if (opcao == 3) {
			System.out.println("\nO cliente foi chamado! "+fila.remove());
		}
		else {
			System.out.println("Valor invalido. ");
		}
		
		}
	}

}
