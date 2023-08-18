package conta.controller;

import java.util.ArrayList;

import conta.repository.contaRepository;
import contaModel.Conta;

public class ContaController implements contaRepository {
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null)
			conta.visualizar();
		else
			System.out.println("\nA Conta Número: " + numero + " não foi encontrada!");
		
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}
	
	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas .add(conta);
		System.out.println("\nA Conta número: " + conta.getNumero() + "foi criada com sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\n Conta número: " + conta.getNumero() + " foi atualizada com sucesso");
		} else
			System.out.println("\nA conta número: " + conta.getNumero() + " não foi encontrada!");
		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta!= null) {
			if (listaContas.remove(conta) == true)
				System.out.println("\nA Conta número: " + numero + " foi deletada com sucesso");
		} else 
			System.out.println("\nA conta número " + numero + " não foi encontrada!");
		
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if (conta.sacar(valor) == true)
				System.out.println("\nO saque da conta numero: " + numero + " foi efetuado com sucesso! ");
		} else 
			System.out.println("\nA conta numero: " + numero + " não foi econtrada! ");
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta!= null) {
			conta.depositar(valor);
			System.out.println("\nO deposito na conta numero: " +numero+ " foi efetuado com sucesso! ");
		} else 
			System.out.println("\nA conta numero " + numero + " não foi encontrada ou a conta destino não é conta corrente! ");
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if (contaOrigem != null && contaDestino != null) {
			
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nA transferencia foi efetuada com sucesso" );
			}
		}else 
			System.out.println("\nA conta de Origem e/ou destino não foram encontradas!");
		
	}
	public int gerarNumero() {
		return ++ numero;
	}
	
	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}
		return numero;
	}
}
