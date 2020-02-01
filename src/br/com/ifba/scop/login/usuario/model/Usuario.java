/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.login.usuario.model;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Cliente
 */
@Entity
@Table (name = "USUARIO")
public class Usuario extends AbstractEntity implements Serializable{
    
    @Column(name="LOGIN", length=100, nullable=false)
    private String login;
	
    @Column(name="SENHA", length=100, nullable=false)
    private String senha;
	
   // @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
   // @JoinColumn(name="tipousuario_id")
   // private TipoUsuario tipoUsuario;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
