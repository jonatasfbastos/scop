/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import java.io.Serializable;
import javax.persistence.Entity;

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
    
}
