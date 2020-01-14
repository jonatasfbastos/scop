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
    
    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getTituloInvencao() {
        return tituloInvencao;
    }

    public void setTituloInvencao(String tituloInvencao) {
        this.tituloInvencao = tituloInvencao;
    }

    public String getAreaInvencao() {
        return areaInvencao;
    }

    public void setAreaInvencao(String areaInvencao) {
        this.areaInvencao = areaInvencao;
    }
    
}
