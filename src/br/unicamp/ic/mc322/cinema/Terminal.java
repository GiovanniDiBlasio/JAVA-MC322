package br.unicamp.ic.mc322.cinema;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.lang.RuntimeException;



public class Terminal {
	private Controller ctl;
	
	public Terminal() {
		this.ctl = new Controller();
		System.out.println("Sistema Inicializado");
	}
	
	
	public void comecarOperacao() {
		int op =0;
		text();
		while(op!=9) {
			op = getOp("opcao:");
			switch(op) {
			case 1: // criar usuario novo
				
			
			case 2: // entrar como usuario
				
				System.out.println("Boas Vindas _____ !");
				System.out.println("1 - Comprar Ingressos");
				System.out.println("2 - Vizualizar Historico de Compras");
				System.out.println("8 - Encerrar Sessão");
				System.out.println("");
				while(op!=9 && op!=8) {
					op = getOp("opcao:");
					switch(op) {
					case 1:{ // realizar reserva
						this.ctl.mostrarCatalogo();
						
						break;
						}
					case 2: {// vizualizar historico
						// TODO funcao que pega o historico do usuario do JSON
						}
					}
					
				}
				if(op!=9)
					text();
			}
		}
		System.out.println("Sistema Finalizado, volte sempre!");
	
	}
	private void text() {
		System.out.println("---- CINEMINHA FELIZ ----");
		System.out.println("");
		System.out.println("1 - Novo Usuario");
		System.out.println("2 - Entre com seu Usuario");
		System.out.println("");
	}
	private int getOp(String str)throws RuntimeException {
		Reader r = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(r);

		System.out.println("Entre com " + str);
		try {
			st.nextToken();
			if(st.ttype==-3 || st.nval>9 || st.nval<=0) {
				throw new IOException();
			}
			
		} catch (IOException e) {
			System.out.println("ERRO: Opcao Invalida!");
			return (0);
		}
		return ((int) st.nval);
	}
	
}
