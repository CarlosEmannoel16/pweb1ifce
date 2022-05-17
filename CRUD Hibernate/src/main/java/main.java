import Controller.FilmeController;
import Model.FilmeModel;

public class main {

	public static void main(String[] args) {
		//Cdastro filme 1
		FilmeModel filme1 = new FilmeModel();
		filme1.setNome("A era do gelo");
		filme1.setDuracao(120);
		filme1.setGenero("comédia");
		filme1.setPreco(1.10);
		FilmeController filmeController = new FilmeController();
		filmeController.cadastroFilme(filme1);

		//Cadastro filme 2
		FilmeModel filme2 = new FilmeModel();
		filme2.setNome("A era do gelo 2");
		filme2.setDuracao(160);
		filme2.setGenero("comédia");
		filme2.setPreco(1.10);
		filmeController.cadastroFilme(filme2);
		
		//Exluir Filme
		filmeController.excluirFilme(1);
		
		//Pegar Filme
	     filmeController.buscarFilme(2);
	     
	     //Editar Filme
	     filme2.setNome("A era do gelo 3");
	     filmeController.atualizarFilme(filme2);
		
	
	}

}
