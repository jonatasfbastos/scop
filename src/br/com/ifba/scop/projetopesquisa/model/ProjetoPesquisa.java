/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;

/**
 *
 * @author jonatasfbastos
 */
public class ProjetoPesquisa extends AbstractEntity{
    
    private String titulo;
    //teste

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
