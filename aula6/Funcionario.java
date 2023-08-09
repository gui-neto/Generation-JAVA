package atividade6;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private String cidade;
	private int idade;
	private int id;
	
	
	public Funcionario(String nome, String cargo, String cidade, int idade, int id) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.cidade = cidade;
		this.idade = idade;
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public void visualizar() {
		System.out.println("Nome do funcionario: "+nome);
		System.out.println("Cargo na empresa: "+cargo);
		System.out.println("Cidade do funcionario: "+cidade);
		System.out.println("Idade do funcionario: "+idade);
		System.out.println("Numero de identificação: "+id);
	}

}
