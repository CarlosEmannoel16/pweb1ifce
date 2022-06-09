package ifce.br.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifce.br.model.JogadorModel;
import ifce.br.repository.JogadorRepository;

@Service
public class JogadorService {
	
	
	
	@Autowired
	JogadorRepository jogadorRepository;
	
	public void cadastrar(JogadorModel jogador) {
		
		jogadorRepository.save(jogador);
		
	}
	
	public List<JogadorModel>  listar() {
		
		List<JogadorModel>  jogadores = jogadorRepository.findAll();
		return jogadores;
		
	}
	
	public void excluir(Integer id) {
		jogadorRepository.deleteById(id);
		
	}
	
	public Optional<JogadorModel> pegarPeloId(Integer id) {
		Optional<JogadorModel> listJogadores =  jogadorRepository.findById(id);
		return listJogadores;
	}
	

}
