package ifce.br.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


import ifce.br.model.JogadorModel;
import ifce.br.service.JogadorService;

@Controller
public class JogadorController {
	
	@Autowired
	JogadorService jogadorService;
	
	
	@GetMapping("/")
	public ModelAndView cadastroView(JogadorModel jogador) {
		List<JogadorModel> jogadores = jogadorService.listar();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("listarJogador", jogadores);
		return mv;
	}
	
	@GetMapping("/cadastro")
	public String homeController() {
		return "cadastro";
	
	}
	
	@GetMapping("/cadastro/action")
	public String cadastro(JogadorModel jogador) {
		jogadorService.cadastrar(jogador);
		return "redirect:/";
	}
	
	@GetMapping("/jogador/deletar/{id}")
	public String deleteJogador(@PathVariable Integer id) {
		jogadorService.excluir(id);
		return "redirect:/";
		
	}
	
		

}
