/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

/**
 *
 * @author jonatasfbastos
 */
public class ProjetoPesquisa extends AbstractEntity{
    
    private String titulo;
    //teste
    
    //criar as relacionamento entre as tabelas.
    
    //um para um
    @OneToOne(cascade= CascadeType.ALL)
    private EnderecoProjetoPesquisa Endereco;
    
    //um para muitos
    @OneToMany(cascade = CascadeType.ALL)
    private ContatoProjetoPesquisa Contato;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public EnderecoProjetoPesquisa getEndereco() {
        return Endereco;
    }

    public void setEndereco(EnderecoProjetoPesquisa Endereco) {
        this.Endereco = Endereco;
    }

    public ContatoProjetoPesquisa getContato() {
        return Contato;
    }

    public void setContato(ContatoProjetoPesquisa Contato) {
        this.Contato = Contato;
    }
    
}
