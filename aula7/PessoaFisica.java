package atividades7;

public class PessoaFisica extends Cliente {
	
	
	String cpf;

	public PessoaFisica(String nome, String sobreNome, String cidade, int idade, String telefone, String cpf) {
		super(nome, sobreNome, cidade, idade, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
 public void visualizar() {
	
	 System.out.println("\nNome: "+getNome()+" \nSobrenome: "+getSobreNome()+" \nCidade: "+getCidade()+" \nIdade: "+getIdade()+ 
			 " \nTelefone: "+getTelefone()+ " \nCPF: "+cpf);
	 
 }

	
}
	
