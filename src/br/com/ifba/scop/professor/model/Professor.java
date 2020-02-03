/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.professor.model;

import br.com.ifba.scop.infraestructure.pessoa.model.PessoaFisica;

/**
 *
 * @author Bessa
 */
public class Professor extends PessoaFisica{
    private String matricula;
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
