package br.unicamp.ic.mc322.cinema;

public class Poltrona {
	public static int LIVRE = 0;
	public static int OCUPADA = 1;
	private int status;
	private String posicao;
	
	public int getStatus() {
		return status;
	}
	public String getNum() {
		return this.posicao;
	}
	public void setNum(String num) {
		this.posicao =num;
	}

	public void setStatus(int status) {
		if(status ==LIVRE || status ==OCUPADA) {
			this.status = status;
		}
	}

	public Poltrona() {
		this.status = LIVRE;
	}

}
