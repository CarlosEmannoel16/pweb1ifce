package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
