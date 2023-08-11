package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Cliente;
import br.com.projeto.api.repositorio.Repositorio;

@RestController
public class Controle {
    
    @Autowired
    private Repositorio acao;

    @PostMapping("/")
    public Cliente cadastrar(@RequestBody Cliente c){//Aqui é passado o tipo de informação que estou esperando "Cliente" e o "c" é o objeto que vai receber

        return acao.save(c);//c é um objeto que contém as características da classe Cliente

    }

    @GetMapping("/")
    public Iterable<Cliente> selecionar(){//Iterable declara que posso percorrer os elementos 1 por 1, e dento de <> eu declaro que elemento será percorrido

        return acao.findAll();

    }

    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente c){//Aqui é passado o tipo de informação que estou esperando "Cliente" e o "c" é o objeto que vai enviar

        return acao.save(c);

    }

    @DeleteMapping("/{codigo}")
    public String remover(@PathVariable long codigo){

        String retorno = "Excluído com sucesso !!!";
        acao.deleteById(codigo);
        return retorno;
    }

}
