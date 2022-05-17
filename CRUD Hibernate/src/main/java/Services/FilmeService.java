package Services;

import Model.FilmeModel;
import Repository.FilmeRepository;

public class FilmeService {
	
	
	public void cadastrarFilme(FilmeModel filme) {
		FilmeRepository filmeRepository = new FilmeRepository();
		filmeRepository.salvarFilme(filme);
	}

	
	public void excluirFilme(long id) {
		FilmeRepository filmeRepository = new FilmeRepository();
		filmeRepository.excluirFilme(id);
	}
	
	public FilmeModel pegarFilmePeloId(long id) {
		FilmeRepository filmeRepository = new FilmeRepository();
		FilmeModel filme  = filmeRepository.pegarFilmePeloId(id);
		return filme;
	}
	
	public void atualizarFilme(FilmeModel filme) {
		FilmeRepository filmeRepository = new FilmeRepository();
		filmeRepository.EditarFilme(filme);
	}
}
