package Controller;

import Model.FilmeModel;
import Services.FilmeService;
import View.FilmeView;

public class FilmeController {
	
	
	public void cadastroFilme(FilmeModel filme) {
		FilmeService filmeService = new FilmeService();
		filmeService.cadastrarFilme(filme);
	}
	
	public void editarFilme(FilmeModel filme) {
		
		
	}

	
	public void excluirFilme(long id) {
		FilmeService filmeService = new FilmeService();
		filmeService.excluirFilme(id);
		
	}
	
	public void buscarFilme(Integer id) {
		FilmeService filmeService = new FilmeService();
		FilmeModel filme = filmeService.pegarFilmePeloId(id);
		FilmeView filmeView = new FilmeView();
		filmeView.MostrarFilme(filme);
		
	}
	
	public void atualizarFilme(FilmeModel filme) {
		FilmeService filmeService = new FilmeService();
		filmeService.atualizarFilme(filme);
		FilmeView filmeView = new FilmeView();
		filmeView.MostrarFilme(filme);
	}
}
