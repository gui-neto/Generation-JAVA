package atividades7;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PessoaJuridica pessoa1 = new PessoaJuridica("Amenaide", "Bastos", "Souto Soares", 70, "74991004556", "09423606"); 
		PessoaFisica pessoa2 = new PessoaFisica("Jailson", "Santos", "Barro Alto", 50, "71991568677", "86263633"); 
		
		pessoa1.visualizar();
		pessoa2.visualizar();

	}
}