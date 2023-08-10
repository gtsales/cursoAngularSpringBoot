package br.com.projeto.api.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.projeto.api.repositorio.Repositorio;

public class Controle {
    
    @Autowired
    private Repositorio acao;

    @GetMapping("/")
    public String teste(){

        return "Hello World!";

    }

}
