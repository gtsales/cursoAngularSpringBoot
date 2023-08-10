package br.com.projeto.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Cliente;

@Repository//Aqui estamos configurando para ações em SQL
public interface Repositorio extends CrudRepository<Cliente, Long>{
    
}
