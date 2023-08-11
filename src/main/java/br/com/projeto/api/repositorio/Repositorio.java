package br.com.projeto.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Cliente;

@Repository//Aqui estamos configurando para ações em SQL
public interface Repositorio extends CrudRepository<Cliente, Long>{//CrudRepository me permite usar diversos métodos do JPA para realizar operações CRUD e dentro de <> eu passo a entidade no qual
    //vou utilizar e o tipo dela
    
}
