package br.com.thiagobarso.cursomichellibritoonyoutube.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiagobarso.cursomichellibritoonyoutube.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
