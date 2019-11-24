package br.unicamp.ic.mc322.cinema;

import java.util.ArrayList;
public class Pedido {
	public static int CARTAO = 1;
	public static int BOLETO = 0;
	public static long  MIN = 100000000000L;
	public static long MAX = 10000000000000L;
	private ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
	private int formaPag; // 0 - cartao  |  1 - boleto
	
	public Pedido() {
		
		
	}
	
	public void imprimeIngressos() {
		for(Ingresso i : ingressos) {
			i.imprimeIngresso();
		}
	}
	
	public void setFormPag(int f) {
		this.formaPag =f;
	}
	
	public void addIngresso(Ingresso novo) {
		this.ingressos.add(novo);
	}
//	public void rmvIngresso(Ingresso novo) {
//		try {
//			this.ingressos.remove(novo);
//		}
//		catch(){
//			
//		}
//	}
	public void pagamento() {
		if(this.formaPag==CARTAO) {
			System.out.println("Digite o numero do seu cartao e depois pressione Enter:");
			//funcao que escaneia e ve se o numero eh valido ou nao
			System.out.println("Digite a senha do seu cartao:");
			//funcao que le a senha e faz alguma checagem
		}
		else {
			System.out.println("O numero do codigo de barras do seu boleto e':");
			System.out.println(MIN+(long)(Math.random()*(MAX-MIN)));
			//imprime um numero long de 13 digitos que reperesenta o codigo de barras
		}
	}

}
