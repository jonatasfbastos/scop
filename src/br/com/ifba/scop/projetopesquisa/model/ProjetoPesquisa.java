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
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
/**
 *
 * @author jonatasfbastos
 */

//pegar dados do cadastro do projeto de pesquisa
@Entity
public class ProjetoPesquisa extends AbstractEntity implements Serializable{
    
    /*
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Pesquisador coordenador;
    //Precisa corrigir o nome da classe pesquisador
    */
    
    /*      AVISOOOOOO!!!!!!
    Ao Adicionar um atributo not null a essa clase, o método validaProjeto
    da classe ServiceProjetoPesquisa deve ser revisado e implementado se necessario
    */
    
    // Relacionamento muitos para muitos com a classe GrupoPesquisa
    @ManyToMany
    private List<GrupoPesquisa> gruposPesquisa;
    
    @Column(name="titulo", length=100, nullable=false) //not null
    private String titulo;
    
    @Column(name="campus", length=100, nullable=false) //not null
    private String campus;
    
    @Column(name="subarea", length=100, nullable=false) //not null
    private String subArea;
    
    @Column(name="linha_pesquisa", length=100, nullable=false) //not null
    private String linhaPesquisa;
    
    @Column(name="data_inicio", nullable=false) //not null
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    
    @Column(name="data_termino")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataTermino;
    
    @Column(name="financiada")
    private boolean financiada = true; // Por default é true
    
    @Column(name="financiamento") 
    private String finaciamento;
    
    @Column(name="viabilidade_tec", nullable=false) //not null
    private String viabilidadeTec;
    
    @Column(name="espaco")
    private String espaco;
    
     //boolean porque pode existir financiamento ou não, e data término é a data prevista
    
    //métodos acessores

//    public Collection<GrupoPesquisa> getGruposPesquisa() {
//        return gruposPesquisa;
//    }

    public void setGruposPesquisa(List<GrupoPesquisa> gruposPesquisa) {
        this.gruposPesquisa = gruposPesquisa;
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

    public String getSubArea() {
        return subArea;
    }

    public void setSubArea(String subarea) {
        this.subArea = subarea;
    }

    public String getLinhaPesquisa() {
        return linhaPesquisa;
    }

    public void setLinhaPesquisa(String linhaPesquisa) {
        this.linhaPesquisa = linhaPesquisa;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getFinaciamento() {
        return finaciamento;
    }

    public void setFinaciamento(String finaciamento) {
        this.finaciamento = finaciamento;
    }

    public String getViabilidadeTec() {
        return viabilidadeTec;
    }

    public void setViabilidadeTec(String justificativa) {
        this.viabilidadeTec = justificativa;
    }

    public String getEspaco() {
        return espaco;
    }

    public void setEspaco(String espaco) {
        this.espaco = espaco;
    }  

    public boolean isFinanciada() {
        return financiada;
    }

    public void setFinanciada(boolean financiada) {
        this.financiada = financiada;
    }
    
}
