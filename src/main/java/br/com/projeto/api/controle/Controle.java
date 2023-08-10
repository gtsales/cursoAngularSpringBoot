package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String teste(){

        return "Hello World!";

    }

}
