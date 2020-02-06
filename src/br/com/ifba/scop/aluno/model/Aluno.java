/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.aluno.model;

import br.com.ifba.scop.infraestructure.pessoa.model.PessoaFisica;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Igor Lopes
 */

@Entity
public class Aluno extends PessoaFisica {
   
    @Column(name="Matrícula", length=100, nullable=false) //not null
    private String matricula;
    @Column(name="Ano", length=100, nullable=false) //not null
    private String ano; 
    @Column(name="Nome", length=100, nullable=false) //not null
    private String nome;

   
   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
