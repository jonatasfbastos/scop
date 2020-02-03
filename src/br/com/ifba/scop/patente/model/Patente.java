/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * This class represents the entity of Patentes.
 * @author abel
 */
@Entity
public class Patente extends AbstractEntity implements Serializable {

    // atributos
    private long numero;
    private String tituloInvencao;
    private String areaInvencao;
    private int dia;
    private int mes;
    private int ano;
    // chave estrangueira referente a Pesquisador
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name="fk_pesquisador")
    private Pesquisador pesquisador;

    /**
     * Construtor.
     */
    public Patente() {
        super();
    }
    
    /**
     * Returns a register number of a patent.
     * @return Long.
     */
    public long getNumero() {
        return this.numero;
    }

    /**
     * Inserts a register number of a patent.
     * @param numero Long. 
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }
    
    // titulo de invenção - nome

    /**
     * Returns a title of invention - name of it.
     * @return String
     */
    public String getTituloInvencao() {
        return this.tituloInvencao;
    }

    /**
     * Inserts a title of invention - name of it.
     * @param tituloInvencao String
     */
    public void setTituloInvencao(String tituloInvencao) {
        this.tituloInvencao = tituloInvencao;
    }
    
    // area de invenção

    /**
     * Returns the area of a patent.
     * @return 
     */
    public String getAreaInvencao() {
        return this.areaInvencao;
    }

    /**
     * Inserts the area of a patente
     * @param areaInvencao 
     */
    public void setAreaInvencao(String areaInvencao) {
        this.areaInvencao = areaInvencao;
    }
    
    // data
    
    /**
     * Returns the day.
     * @return Integer
     */
    public int getDia() {
        return this.dia;
    }

    /**
     * Inserts the day.
     * @param dia Integer
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Returns the month
     * @return Integer
     */
    public int getMes() {
        return this.mes;
    }

    /**
     * Inserts the month
     * @param mes 
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Returns the year.
     * @return Integer
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * Inserts the year.
     * @param ano Integer
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Returns the foreign key.
     * @return Pesquisador
     */
    public Pesquisador getPesquisador() {
        return pesquisador;
    }

    /**
     * Inserts the foreign key.
     * @param pesquisador Pesquisador
     */
    public void setPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }
    
    
}
