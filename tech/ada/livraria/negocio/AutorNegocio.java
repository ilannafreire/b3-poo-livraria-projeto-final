package tech.ada.livraria.negocio;


import tech.ada.livraria.model.Autor;
import tech.ada.livraria.persistencia.AutorBancoDeDados;

import java.util.ArrayList;

public class AutorNegocio {

    private AutorBancoDeDados bancoDeDados;

    public AutorNegocio(AutorBancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }


    public  void salvar(Autor autor) {
        if (autor.getNome() != null && !autor.getNome().isBlank()) {

        }
    }

    public void obterAutores() {
        ArrayList<Autor> autoresSalvos = bancoDeDados.getAutores();

        for(Autor autor : autoresSalvos) {
            System.out.println("Nome: " + autor.getNome());
        }
    }
}
