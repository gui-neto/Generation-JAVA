package menu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Util.Cores;
import eComerceProject.Produto;
import eComerceProject.carrinho;

public class menu {

    public static void main(String[] args) {
    	
    	Produto.cadastrarProdutos();
    	
    	String nome, cep = null;
    	
    	carrinho carrinho = new carrinho();
    	
    	Produto camisa = null;
   
        Scanner leia = new Scanner(System.in);

        int opcao;


        while (true) {
            System.out.println(Cores.TEXT_CYAN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND   );
            System.out.println("#####################################################");
            System.out.println("                                                     ");
            System.out.println("                    UNIVERSO GEEK                    ");
            System.out.println("                                                     ");
            System.out.println("#####################################################");
            System.out.println("                                                     ");
            System.out.println("            1 - Catálogo de camisetas:               ");
            System.out.println("            2 - Carrinho:                            ");
            System.out.println("            3 - Opções de entrega:                   ");
            System.out.println("            4 - Atendimento ao Cliente:              ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("                                                     ");
            System.out.println("=====================================================");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");
            System.out.println("                                                     " + Cores.TEXT_RESET);

            opcao = leia.nextInt();

            if (opcao == 0) {
                System.out.println("\nUNIVERSO GEEK agradeço sua preferência, volte sempre! ");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                	System.out.println(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND );
                	System.out.println("--------------------------------------------------");
                	System.out.println("                                                  ");
                    System.out.println("Selecione o Tema:                                 ");
                    System.out.println("(1) Camisas Femininas:                            ");
                    System.out.println("(2) Camisas Desenhos Infantis                     ");
                    System.out.println("(3) Camisas Animes                                ");
                    System.out.println("(4) Camisas Banda de Rock                         ");
                    System.out.println("                                                  ");
                    System.out.println("--------------------------------------------------");
                    int temaCamisa = leia.nextInt();
                    switch (temaCamisa) {
                        case 1:
                        	for (Produto camisasProduto : Produto.camisasFemininas) {
                        		System.out.println("("+camisasProduto.getId()+") "+camisasProduto.getNome()+" \nValor: R$ "+camisasProduto.getPreco());
                        	} 
                        	System.out.println("Selecione o codigo do produto desejado: ");
                        	int escolha = leia.nextInt();
                        	for (Produto camisasProduto : Produto.camisasFemininas) {
                        		if (camisasProduto.getId() == escolha) {
                        			 camisa = camisasProduto;
                        		}
                        	}
                        	carrinho.adicionarProduto(camisa);
                        	KeyPress();
                            break;
                            
                        case 2:
                        	for (Produto camisasProduto : Produto.camisasInfantis) {
                        		System.out.println("("+camisasProduto.getId()+") "+camisasProduto.getNome()+" \nValor: R$ "+camisasProduto.getPreco());
                        	} 
                        	System.out.println("Selecione o codigo do produto desejado: ");
                        	escolha = leia.nextInt();
                        	for (Produto camisasProduto : Produto.camisasInfantis) {
                        		if (camisasProduto.getId() == escolha) {
                        			 camisa = camisasProduto;
                        		}
                        	}
                        	carrinho.adicionarProduto(camisa);
                        	KeyPress();
                            break;
                            
                        case 3:
                        	for (Produto camisasProduto : Produto.camisasAnimes) {
                        		System.out.println("("+camisasProduto.getId()+") "+camisasProduto.getNome()+" \nValor: R$ "+camisasProduto.getPreco());
                        	} 
                        	System.out.println("Selecione o codigo do produto desejado: ");
                        	escolha = leia.nextInt();
                        	for (Produto camisasProduto : Produto.camisasAnimes) {
                        		if (camisasProduto.getId() == escolha) {
                        			 camisa = camisasProduto;
                        		}
                        	}
                        	carrinho.adicionarProduto(camisa);
                        	KeyPress();
                            break;
                            
                        case 4:
                        	for (Produto camisasProduto : Produto.camisasRock) {
                        		System.out.println("("+camisasProduto.getId()+") "+camisasProduto.getNome()+" \nValor: R$ "+camisasProduto.getPreco());
                        	} 
                        	System.out.println("Selecione o codigo do produto desejado: ");
                        	escolha = leia.nextInt();
                        	for (Produto camisasProduto : Produto.camisasRock) {
                        		if (camisasProduto.getId() == escolha) {
                        			 camisa = camisasProduto;
                        		}
                        	}
                        	carrinho.adicionarProduto(camisa);
                        	KeyPress();
                            break;
                    } 
                    break;
                case 2:
                	System.out.println(Cores.TEXT_CYAN_BRIGHT                                   );
                	System.out.println("Itens adcionados no carrinho: \n"+carrinho.getProdutos());
                	System.out.println("Valor Total: "+carrinho.calcularTotal());
                	System.out.println("Deseja Finalizar a compra? S/N");
                	leia.nextLine();
                	String finalizar = leia.nextLine().toLowerCase();
                	if (finalizar.equals("s")) { 
                		carrinho.limparCarrinho();
                		System.out.println("Compra realizada com sucesso!");
                		leia.close();
                		System.exit(0);
                	}else System.out.println("Compra cancelada.");
                	System.out.println("                                     "+Cores.TEXT_RESET);
                    break;
                    
                case 3:
                	System.out.println(Cores.TEXT_CYAN_BRIGHT        );
                	System.out.println("                  OPÇÕES DE ENTREGA:                           ");
                		while (true) {
                			System.out.println("Informe o seu nome completo (ou 'sair' para encerrar)  ");
                			leia.nextLine();
                				nome = leia.nextLine();
                			if (nome.equalsIgnoreCase("sair")) {
                				System.out.println("Encerrando o programa...");
                				break;
                			}else {
                				System.out.println("Informe seu CEP: ");
                					cep = leia.nextLine();
                				break;
                			}
                		} System.out.println("Nome do Cliente: "+nome);
                		  System.out.println("CEP para entrega: "+cep);
                       break;
                	
                case 4: 
                	System.out.println(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND              );
                	System.out.println("---------------------------------------------------------------");
                	System.out.println("                                                               ");
                    System.out.println("Entre em contato através do nosso telefone: (75)98283-9568     ");
                    System.out.println("Ou se preferir, o nosso Instagram: @Uni_versogeek              ");
                    System.out.println("                                                               ");
                	System.out.println("---------------------------------------------------------------");
                    break;
              	
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

	private static void KeyPress() {
		// TODO Auto-generated method stub
		
	}
}
