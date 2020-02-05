/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.professor.model;

import br.com.ifba.scop.infraestructure.pessoa.model.PessoaFisica;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Bessa
 */

@Entity
public class Professor extends PessoaFisica{
    
    @Column(name="Matrícula", length=100, nullable=false) //not null
    private String matricula;
    @Column(name="Titulação", length=100, nullable=false) //not null
    private String titulacao;
    
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
