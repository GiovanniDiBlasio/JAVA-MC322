package br.unicamp.ic.mc322.cinema;

public class Context {
	private EstadoPoltrona state;
	
	public Context() {
		state=null;
	}
	public void setState(EstadoPoltrona state) {
		this.state=state;
	}
	public EstadoPoltrona getState() {
		return state;
	}
}
