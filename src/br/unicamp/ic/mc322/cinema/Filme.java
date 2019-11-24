package br.unicamp.ic.mc322.cinema;
public class Filme {
	private int id;
	private double duracao;
	private String nome;
	private String faixaEtaria;
	private String sinopse;
	private String diretor;
	public Filme(int id,double duracao,String nome,String faixa,String sinopse,String diretor) {
		this.id =id;
		this.duracao = duracao;
		this.nome = nome;
		this.faixaEtaria = faixa;
		this.sinopse = sinopse;
		this.diretor = diretor;
	}
	public int getId() {
		return id;
	}
	public double getDuracao() {
		return duracao;
	}
	public String getNome() {
		return nome;
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public String getSinopse() {
		return sinopse;
	}
	
	public String getDiretor() {
		return diretor;
	}
}
