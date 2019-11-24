package br.unicamp.ic.mc322.cinema;

public class Sessao {
	private Filme filme;
	private int id;
	private String horario;
	private int poltronasDisponiveis;
	private double precoFull;
	private Sala sala;
	
	public Sessao(Filme filme,int id,String horario,Sala sala,int poltr,double preco) {
		this.filme = filme;
		this.id = id;
		this.horario = horario;
		this.sala = sala;
		this.poltronasDisponiveis= poltr;
		this.precoFull = preco;
	}//inicializa uma sessao
	
	public boolean cheia() {
		if(this.poltronasDisponiveis==0) {
			return true;
		}
		else {
			return false;
		}
	}// checa se existem poltronas disponiveis
	
	public double getPreco() {
		return this.precoFull;
	}
	
	public void ocupaPoltrona() {
		this.poltronasDisponiveis--;
	}// ocupa uma poltrona
	
	public void imprimeInfo() {
		System.out.print(this.filme.getNome()+" - "+this.horario);
	}
	
	public void imprimeLotacao() {
		if(this.cheia()) {
			System.out.println(this.filme.getNome()+" - "+this.horario+" - LOTADA");
		}
		else {
			System.out.println(this.filme.getNome()+" - "+this.horario+" - "+this.poltronasDisponiveis+"lugares disponiveis");
		}
		
	}
}
