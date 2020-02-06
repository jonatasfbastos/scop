/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.aluno.model;

import br.com.ifba.scop.infraestructure.pessoa.model.PessoaFisica;
import javax.persistence.Entity;

/**
 *
 * @author Igor Lopes
 */

@Entity
public class Aluno extends PessoaFisica {
    private String matricula;
    private int ano;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
