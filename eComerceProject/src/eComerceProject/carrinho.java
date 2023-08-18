package eComerceProject;

import java.util.ArrayList;
import java.util.List;

public class carrinho {

	private String str = "", str_aux;
	
	private List<Produto> Produtos = new ArrayList<>();
	
	   public void adicionarProduto(Produto produto) {
	        Produtos.add(produto);
	    }

	    public void removerProduto(Produto produto) {
	        Produtos.remove(produto);
	    }

	    public String getProdutos() {
	        for (Produto produto : Produtos) {
	        	str_aux = produto.getNome() + " R$: " + produto.getPreco()+"\n";
	        	str += str_aux;
	        }
	        return str;
	    }

	    public String calcularTotal() {
	        double total = 0;
	        for (Produto produto : Produtos) {
	            total += produto.getPreco();
	        }
	        return String.format("%.2f", total);
	    }
	public void limparCarrinho() {
		Produtos.clear();
	}
}
