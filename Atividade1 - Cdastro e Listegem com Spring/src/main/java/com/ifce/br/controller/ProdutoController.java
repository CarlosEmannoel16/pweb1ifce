package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Produto;
import com.ifce.br.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/home")
	public String home() { 
		return "home.html";
	}
	
	@GetMapping("/produto/salvar")
	public String salvar(Produto produto) {
		produtoService.salvarProduto(produto);
		return "sucesso.html";
		
	}
	
	@GetMapping("/produto/listar")
	public ModelAndView listarProdutos() {
		List<Produto> produtos = produtoService.listarProdutos();
		ModelAndView mv = new ModelAndView("listar");
		mv.addObject("listarProdutos", produtos);
		return mv;
	}
}
