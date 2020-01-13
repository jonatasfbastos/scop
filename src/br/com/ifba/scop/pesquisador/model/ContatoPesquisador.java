/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.pesquisador.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.ForeignKey;



/**
 *
 * @author mvictor
 */
@Entity
public class ContatoPesquisador extends AbstractEntity{
    
    
    
    private String Telefone;
    private String Celular;
    private String Email;
    
    @ManyToOne
    @JoinColumn(name="pessoa", nullable=false)
    private Pesquisador pesquisador = new Pesquisador();
    
    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
