/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestructure.telefone.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import br.com.ifba.scop.infraestructure.pessoa.Pessoa;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author itallo007
 */

@Entity
public class Telefone extends AbstractEntity implements Serializable{
    
    private String numero;
    
    private String ddd;
    
    private String tipoTelefine;
    
    @ManyToOne
    private Pessoa pessoa;

    //Metodos Acessores
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTipoTelefine() {
        return tipoTelefine;
    }

    public void setTipoTelefine(String tipoTelefine) {
        this.tipoTelefine = tipoTelefine;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
