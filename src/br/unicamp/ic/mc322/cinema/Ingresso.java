package br.unicamp.ic.mc322.cinema;

public class Ingresso {
	public static int MEIA = 1;
	public static int INTEIRA = 0;
	
	private Sessao sessao;
	private Poltrona poltrona;
	private double preco;
	private boolean tipo; // meia ou inteira
	private String nome;
	
	public Ingresso(Sessao sessao) {
		this.sessao = sessao;
	}
	
	public void setPoltrona(Poltrona poltrona) {
		this.poltrona = poltrona;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void geraPreco(int meia) {
		if(meia == MEIA)
			this.preco = sessao.getPreco()/2;
		else
			this.preco = sessao.getPreco();
	}
	
	public void imprimeIngresso() {
		this.sessao.imprimeInfo();
		System.out.println("poltrona:"+this.poltrona.getNum()+this.nome+" entrada " + (tipo ? "MEIA" : "INTEIRA") +this.preco+ "\n");
	}
}
