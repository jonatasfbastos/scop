/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.model;

/**
 *
 * @author beatriz
 */
//pegar dados da equipe executora

public class ProjetoPesquisaEquipeExecutora {
    private String nome;
    private String titulacao;
    private String vinculo;
    private boolean informacao;
    //boolean porque só pode ser estudante ou servidor
    
    //métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public boolean isInformacao() {
        return informacao;
    }

    public void setInformacao(boolean informacao) {
        this.informacao = informacao;
    }
}
