package br.unicamp.ic.mc322.cinema;
import org.json.*;

public class Controller {
	private Cinema cine;
	private CatalogoFilme catalogo;
	private JSONObject usuarios;
	
	
	
	public Controller() {
		this.catalogo = new CatalogoFilme();
		this.cine = new Cinema("Kinoplex",this.catalogo);
	}//inicializa o controlador com o cinema Kinoplex e o catalogo ja definido
	
	
	public void mostrarCatalogo(){
		this.catalogo.MostrarFilmes();
	}//imprime os filmes do catalogo
	
	public void addUser(String nome,String senha) {
		try{
			// TODO procurar se o usuario existe no JSON
			// TODO criar um novo usuario usando o construtor da classe Usuario
			// TODO adicionar o novo usuario ao JSON com suporte a historico de pedidos
			
		}
		catch(JSONException e) {
			
		}
	}
	
	
	
}

