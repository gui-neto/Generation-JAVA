package contaBancaria;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import contaModel.contaPoupanca;
import contaModel.contaCorrente;
import pacoteUtil.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		contaCorrente cc1 = new contaCorrente(9, 3655, 0, "Messias", 23000.0f);
		
		cc1.visualizar();
		cc1.sacar(13500.0f);
		cc1.visualizar();
		cc1.depositar(7000.0f);
		cc1.visualizar();
		
		contaPoupanca cp1 = new contaPoupanca(9, 3655, 1, "Hugo", 38000.0f, 15);
		
		cp1.visualizar();
		cp1.sacar(10000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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
		break;
	case 2:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Listar todas as Contas\n\n");
		break;
	case 3:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Buscar Conta por Numero\n\n");
		break;
	case 4:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Atualizar Dados da Conta\n\n");
		break;
	case 5:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Apagar conta\n\n");
		break;
	case 6:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Saque\n\n");
		break;
	case 7:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Depósito\n\n");
		break;
	case 8:
		System.out.print(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+ "Transência entre Contas \n\n");
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
	
