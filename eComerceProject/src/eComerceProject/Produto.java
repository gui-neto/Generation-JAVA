package eComerceProject;

import java.util.LinkedList;
import java.util.Queue;

public class Produto {

	public static Queue<Produto> camisasFemininas = new LinkedList<>();
	public static Queue<Produto> camisasInfantis = new LinkedList<>();
	public static Queue<Produto> camisasAnimes = new LinkedList<>();
	public static Queue<Produto> camisasRock = new LinkedList<>();
	
	private String nome;
	private int id;
	private double preco;
	
	public Produto() {}
	public Produto(String nome, double preco, int id) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public static void cadastrarProdutos() {
		
		Produto camisaPolly = new Produto("Camisa Polly Pocket", 79.99, 1);
		camisasFemininas.add(camisaPolly);
		Produto camisaBarbie = new Produto("Camisa Barbie", 109.99, 2);
		camisasFemininas.add(camisaBarbie);
		Produto camisaMoranguinho = new Produto("Camisa Moranguinho", 49.99, 3);
		camisasFemininas.add(camisaMoranguinho);
		Produto camisaPeppa = new Produto("Camisa Peppa Pig", 89.99, 4);
		camisasFemininas.add(camisaPeppa);
		
		Produto camisaMax = new Produto("Camisa Max Stell", 79.99, 1);
		camisasInfantis.add(camisaMax);
		Produto camisaBen = new Produto("Camisa Ben 10", 54.99, 2);
		camisasInfantis.add(camisaBen);
		Produto camisaMutante = new Produto("Camisa Mutante Rex", 69.99, 3);
		camisasInfantis.add(camisaMutante);
		Produto camisaTitans = new Produto("Camisa Os Jovens Titans", 89.99, 4);
		camisasInfantis.add(camisaTitans);
		
		Produto camisaNaruto = new Produto("Camisa Naruto", 99.99, 1);
		camisasAnimes.add(camisaNaruto);
		Produto camisaDragon = new Produto("Camisa Dragon Ball", 74.99, 2);
		camisasAnimes.add(camisaDragon);
		Produto camisaShingeki = new Produto("Camisa Shingeki no Kyojin", 69.99, 3);
		camisasAnimes.add(camisaShingeki);
		Produto camisaOne = new Produto("Camisa One Piece ", 89.99, 4);
		camisasAnimes.add(camisaOne);
			
		Produto camisaLinkin = new Produto("Camisa Linkin Park", 99.99, 1);
		camisasRock.add(camisaLinkin);
		Produto camisaMetalica = new Produto("Camisa Metalica", 84.99, 2);
		camisasRock.add(camisaMetalica);
		Produto camisaSystem = new Produto("Camisa System Of Down", 74.99, 3);
		camisasRock.add(camisaSystem);
		Produto camisaIron = new Produto("Camisa Iron Maiden", 66.66, 4);
		camisasRock.add(camisaIron);
		
	}
	
}
