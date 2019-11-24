package br.unicamp.ic.mc322.cinema;

public class Sala {
 
	private int num;
	private Poltrona mapa[][];
	private int tipo;//0 para normal e 1 para VIP
	
	public Sala(int num,int x,int y,int tipo){
		this.num = num;
		this.mapa = new Poltrona[x][y];
		this.tipo = tipo;
		for(int i =1;i<x;i++){
			for(int j=1;j<y;j++){
				mapa[i][j].setNum(toAlphabetic(i)+j);
			}
		}
	}//inicializa uma sala
	
	public int getTipo() {
		return this.tipo;
	}
	public void setPoltrona(String xy) {
		for(Poltrona fileira[] : this.mapa){
			for(Poltrona lugar : fileira){
				if(lugar.getNum()==xy) {
					lugar.setStatus(Poltrona.OCUPADA);
				}
			}
		}
	}
	public void imprimeMapa() {
		System.out.println("Poltrona ocupadas estao marcadas com X");
		for(Poltrona fileira[] : this.mapa){
			for(Poltrona lugar : fileira){
				if(lugar.getStatus()==Poltrona.LIVRE){
					System.out.print("["+lugar.getNum()+" ]");
				}
				else{
					System.out.print("[ X ]");
				}
			}
			System.out.print("\n");
		}
	}
	public static String toAlphabetic(int i) {
	    if( i<0 ) {
	        return "-"+toAlphabetic(-i-1);
	    }

	    int quot = i/26;
	    int rem = i%26;
	    char letter = (char)((int)'A' + rem);
	    if( quot == 0 ) {
	        return ""+letter;
	    } else {
	        return toAlphabetic(quot-1) + letter;
	    }
	}
}
