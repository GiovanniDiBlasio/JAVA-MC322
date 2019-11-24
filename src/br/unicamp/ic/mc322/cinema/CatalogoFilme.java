package br.unicamp.ic.mc322.cinema;
import java.util.ArrayList;



public class CatalogoFilme {
	private ArrayList<Filme> filmes = new ArrayList<Filme>();
	public CatalogoFilme() {
		this.filmes.add(new Filme(1,120.00,"The Joker","14",
				"O filme conta a historia do coringa, um vilao classico do mundo das HQs",
				"Taika Watiti"));
		this.filmes.add(new Filme(2,170.00,"Avengers","10",
				"Os herois mais famosos do cinema se reunem para derrtar uma ameaça nunca antes vista e salvar a Terra",
				"Russo Brothers"));
	}//inicializa o catalogo com os 2 filmes indicados no roteiro
	
	public void MostrarFilmes() {
		for(Filme i : this.filmes) {
			System.out.println("Filme-"+i.getNome()+" Faixa Etaria:"+i.getFaixaEtaria()+" Dirigido por:"+i.getDiretor());
			System.out.println("Sinopse:"+i.getSinopse());
			System.out.print("\n");
		}
		
	}
	public Filme getFilme(int i) {
		return this.filmes.get(i);
	}
}
