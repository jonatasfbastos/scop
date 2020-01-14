/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisaOrientador;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisaEquipeExecutora;
/**
 *
 * @author jonatasfbastos
 */

//pegar dados do cadastro do projeto de pesquisa
public class ProjetoPesquisa extends AbstractEntity{
    
    private String titulo;
    private String campus;
    private String subarea;
    private String linhaDePesquisa;
    private String data;
    private String dataTermino;
    private boolean finaciamento;
    private String justFinanciamento;
    private String espaco;
    
     //boolean porque pode existir financiamento ou não, e data término é a data prevista
    
    //métodos acessores
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getSubarea() {
        return subarea;
    }

    public void setSubarea(String subarea) {
        this.subarea = subarea;
    }

    public String getLinhaDePesquisa() {
        return linhaDePesquisa;
    }

    public void setLinhaDePesquisa(String linhaDePesquisa) {
        this.linhaDePesquisa = linhaDePesquisa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public boolean isFinaciamento() {
        return finaciamento;
    }

    public void setFinaciamento(boolean finaciamento) {
        this.finaciamento = finaciamento;
    }

    public String getJustFinanciamento() {
        return justFinanciamento;
    }

    public void setJustFinanciamento(String justFinanciamento) {
        this.justFinanciamento = justFinanciamento;
    }

    public String getEspaco() {
        return espaco;
    }

    public void setEspaco(String espaco) {
        this.espaco = espaco;
    }
  }
