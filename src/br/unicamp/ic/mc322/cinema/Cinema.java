package br.unicamp.ic.mc322.cinema;

import java.util.ArrayList;

public class Cinema {
	private String nome;
	private ArrayList<Sessao> sessoes = new ArrayList<Sessao>();
	private ArrayList<Sala> salas = new ArrayList<Sala>();
	private CatalogoFilme catalogo;
	
	public Cinema(String name,CatalogoFilme catalogo) {
		this.nome = name;
		this.catalogo = catalogo;
		this.salas = new ArrayList<Sala>();
		this.sessoes = new ArrayList<Sessao>();
		this.novaSala(1, 3, 1, 0);
		this.novaSessao(1, this.catalogo.getFilme(0),"14:00",this.getSala(1),3, 30.00);
		this.novaSessao(1, this.catalogo.getFilme(0),"20:00",this.getSala(1),3, 30.00);
	}//as listas de salas e sessoes começam vazias
	
	public void novaSessao(int id,Filme filme,String horario,Sala sala,int numPoltr,double preco) {
		Sessao nova = new Sessao(filme,id,horario,sala,numPoltr,preco);
		this.sessoes.add(nova);
	}//adiciona uma sessao na lista de sessoes
	
	public void novaSala(int num,int x,int y,int tipo) {
		Sala nova = new Sala(num,x,y,tipo);
		this.salas.add(nova);
	}//adiciona uma sala na lista de salas
	
	public void mostraSala(int num){
		this.salas.get(num-1).imprimeMapa();
	}//imprime as poltronas da sala
	
	public void mostraSessao(int num) {
		this.sessoes.get(num-1).imprimeInfo();
	}//imprime as informacoes da sessao
	
	public String getNome() {
		return this.nome;
	}// retorna o nome do Cinema
	public Sala getSala(int i) {
		return this.salas.get(i-1);
	}
}
