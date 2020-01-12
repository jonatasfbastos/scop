/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.registropatentes.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author abel
 */
@Entity
public class RegistroPatentes extends AbstractEntity implements Serializable {

    /**
     * Construtor.
     */
    public RegistroPatentes() {
        super();
    }
    
}
