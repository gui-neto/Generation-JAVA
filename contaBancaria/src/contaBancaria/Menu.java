package contaBancaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import contaModel.contaPoupanca;
import contaModel.Conta;
import contaModel.contaCorrente;
import pacoteUtil.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao, numero, agencia, aniversario;
		int tipo;
		String titular;
		float saldo, limite;
		
		System.out.println("\nCriar Contas\n");

		ContaController contas = new ContaController();
		
		contaCorrente cc1 = new contaCorrente(contas.gerarNumero(), 123, 1, "GUilherme Martins", 100000f, 100.0f);
		contas.cadastrar(cc1);
		
		contaCorrente cc2 = new contaCorrente(contas.gerarNumero(), 114, 5, "Pedro Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);
		
		contaPoupanca cp1 = new contaPoupanca(contas.gerarNumero(), 174, 9, "Gustavo Araujo", 4000f, 12);
		contas.cadastrar(cp1);
		
		contaPoupanca cp2 = new contaPoupanca(contas.gerarNumero(), 666, 9, "Joelson Meneses", 8500f, 15);
		
		Scanner leia = new Scanner(System.in);
		
	while(true) {
		System.out.println(Cores.TEXT_BLUE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND										     );
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("                                                                                            ");
		System.out.println("                                 BANCO TRICOLOR FINANCEIRA                                  ");
		System.out.println("                                                                                            ");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("                                                                                            ");
		System.out.println("                                 1 - Criar Conta                                            ");
		System.out.println("                                 2 - Listar todas as Contas                                 ");
		System.out.println("                                 3 - Buscar Conta por Numero                                ");
		System.out.println("                                 4 - Atualizar Dados da Conta                               ");
		System.out.println("                                 5 - Apagar Conta                                           ");
		System.out.println("                                 6 - Sacar                                                  ");
		System.out.println("                                 7 - Depositar                                              ");
		System.out.println("                                 8 - Transferir valores entre contas                        ");
		System.out.println("                                 9 - Sair                                                   ");
		System.out.println("                                                                                            ");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("                                                                                            ");
		System.out.println("Entre com a opção desejada:                                                                 ");
		System.out.println("                                                                                            ");
		System.out.println("                                                                                             "+ Cores.TEXT_RESET);  
		
		try {
			
			opcao = leia.nextInt();
		}catch(InputMismatchException e){
			System.out.println("\nDigite valores inteiros!");
			leia.nextLine();
			opcao=0;
		}
		
		
		if (opcao == 9) {
			System.out.println("\nBanco Tricolor Financeira - Obrigado pela confiança!");
			leia.close();
			System.exit(0);
		}
		
	switch (opcao) {
	case 1:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Criar Conta\n\n");
		
		System.out.println("Digite o Numero da Agência: ");
		agencia = leia.nextInt();
		System.out.println("Digite o Nome do Titular: ");
		leia.skip("\\R?");
		titular = leia.nextLine();
		
		do {
			System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
			tipo = leia.nextInt();
		}while (tipo < 1 && tipo > 2);
		
		System.out.println("Digite o Saldo da Conta (R$): ");
		saldo = leia.nextFloat();
		
		switch(tipo) {
		case 1 -> {
			System.out.println("Digite o limite de Crédito (R$): ");
			limite = leia.nextFloat();
			contas.cadastrar(new contaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
		}
		case 2 -> {
			System.out.println("Digote o dia do Aniversario da conta: ");
			aniversario = leia.nextInt();
			contas.cadastrar(new contaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
			}
		}
	case 2:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Listar todas as Contas\n\n");
		contas.listarTodas();
		keyPress();
		break;
	case 3:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Buscar Conta por Numero\n\n");
		System.out.println("Digite o número da conta: ");
		numero = leia.nextInt();
		
		contas.procurarPorNumero(numero);
		
		keyPress();
		break;
	case 4:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Atualizar Dados da Conta\n\n");
		
		System.out.println("Digite o número da conta: ");
		numero = leia.nextInt();
		
		if (contas.buscarNaCollection(numero) != null) {
			
			System.out.println("Digite o número da agência: ");
			agencia = leia.nextInt();
			System.out.println("Digite o nome do titular: ");
			leia.skip("\\R?");
			titular = leia.nextLine();
			
			System.out.println("Digite o Saldo da Conta (R$): ");
			saldo = leia.nextFloat();
			
			tipo = contas.retornaTipo(numero);
			
			switch (tipo) {
			case 1 -> {
				System.out.println("Digite o limite de Crédito (R$): ");
				limite = leia.nextFloat();
				contas.atualizar(new contaCorrente(numero, agencia, tipo, titular, saldo, limite));
			}
			case 2 -> {
				System.out.println("Digite o Aniversario da conta: ");
				aniversario = leia.nextInt();
				contas.atualizar(new contaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
			}
			default -> {
				System.out.println("Tipo de conta inválida!");
			}
			}
		} else
			System.out.println("\nConta não encontrada!");
		keyPress();
		break;
	case 5:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Apagar conta\n\n");
		
		System.out.println("Digite o número da conta: ");
		numero = leia.nextInt();
		
		contas.deletar(numero);
		
		keyPress();
		break;
	case 6:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Saque\n\n");
		keyPress();
		break;
	case 7:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Depósito\n\n");
		keyPress();
		break;
	case 8:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Transência entre Contas \n\n");
		keyPress();
		break;
	default:
		System.out.println(Cores.TEXT_YELLOW + "\nOpção Inválida!");
		break;
			}	
		}
		
	}
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!"+e);
		}
	}	
}
	
