/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.model;

import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Temporal;
/**
 *
 * @author jonatasfbastos
 */

@Entity
//pegar dados do cadastro do projeto de pesquisa
public class ProjetoPesquisa extends AbstractEntity implements Serializable{
    
//    private Pesquisador coordenador;
//    Precisa corrigir o nome da classe
    private GrupoPesquisa grupoPesquisa;
    private String titulo;
    private String campus;
    private String subarea;
    private String linhaPesquisa;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataTermino;
    private boolean finaciamento;
    private String justificativa;
    private String espaco;
    
     //boolean porque pode existir financiamento ou não, e data término é a data prevista
    
    //métodos acessores

    public GrupoPesquisa getGrupoPesquisa() {
        return grupoPesquisa;
    }

    public void setGrupoPesquisa(GrupoPesquisa grupoPesquisa) {
        this.grupoPesquisa = grupoPesquisa;
    }

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

    public String getLinhaPesquisa() {
        return linhaPesquisa;
    }

    public void setLinhaPesquisa(String linhaPesquisa) {
        this.linhaPesquisa = linhaPesquisa;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Calendar dataTermino) {
        this.dataTermino = dataTermino;
    }

    public boolean isFinaciamento() {
        return finaciamento;
    }

    public void setFinaciamento(boolean finaciamento) {
        this.finaciamento = finaciamento;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getEspaco() {
        return espaco;
    }

    public void setEspaco(String espaco) {
        this.espaco = espaco;
    }  
    
  }
