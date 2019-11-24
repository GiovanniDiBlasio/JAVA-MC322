package br.unicamp.ic.mc322.cinema;

public class Usuario {
	private int id;
	private String nome;
	private String senha;
	private Pedido cart;
	// TODO variavel para historico
	
	public Usuario(String nome,String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	public int entrar(String senha) {
		if(senha == this.senha) {
			return 1;
		}
		return 0;
	}
	public void iniciaCarrinho() {
		this.cart = new Pedido();
	}
}
