package com.ifce.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Produto;
import com.ifce.br.repository.ProdutoRepository;

 
@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public void salvarProduto(Produto produto) {
		produtoRepository.save(produto);
	}
	
	public List<Produto> listarProdutos(){
		
		return produtoRepository.findAll();
		
	}

}
