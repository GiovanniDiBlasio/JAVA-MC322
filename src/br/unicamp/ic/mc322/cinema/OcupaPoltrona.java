package br.unicamp.ic.mc322.cinema;

public class OcupaPoltrona implements EstadoPoltrona {
	public void doAction(Context context) {
		context.setState(this);
	}
	public String toString() {
		return "Poltrona Ocupada";
	}

}
