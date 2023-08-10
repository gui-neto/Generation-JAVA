package atividades7;

public class PessoaJuridica extends Cliente {

	String cnpj;

	public PessoaJuridica(String nome, String sobreNome, String cidade, int idade, String telefone, String cnpj) {
		super(nome, sobreNome, cidade, idade, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println("\nNome: "+getNome()+" \nSobrenome: "+getSobreNome()+" \nCidade: "+getCidade()+" \nIdade: "+getIdade()+ 
				 " \nTelefone: "+getTelefone()+ " \nCNPJ: "+cnpj);
		
	}
}
