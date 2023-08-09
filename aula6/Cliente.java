package atividade6;

public class Cliente {
	private String nome;
	private String sobreNome;
	private String cidade;
	private int idade;
	private int telefone;
	
	
	public Cliente(String nome, String sobreNome, String cidade, int idade, int telefone) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cidade = cidade;
		this.idade = idade;
		this.telefone = telefone;
	}


	
	public Cliente(int i, String string, String string2, String string3, int j, int k) {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobreNome() {
		return sobreNome;
	}


	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void visualizar() {
		System.out.println("Nome do cliente: "+nome);
		System.out.println("Sobrenome do cliente: "+sobreNome);
		System.out.println("Cidade do Cliente: "+cidade);
		System.out.println("Idade do cliente: "+idade);
		System.out.println("Telefone do Cliente: "+telefone);
	}
	
}
