package br.edu.insper.desagil.marketing;
import java.util.List;

public class Vendedor extends Usuario {
	private List<Produto> produtos;
	private String nome;
	
	public Vendedor(String nome, List<Video> videos, List<Produto> produtos) {
		super(nome);
		this.produtos = produtos;
	}
	
	public void cadastraProduto(String nome, double preco) {
		Produto produto = new Produto(nome, preco);
		this.produtos.add(produto);
	}
}
