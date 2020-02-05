/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.tecnicoadiministrativo.model;

import br.com.ifba.scop.infraestructure.pessoa.model.PessoaFisica;

/**
 *
 * @author Gusdb
 */
public class Tecnico extends PessoaFisica{
    private String contrato;
    private String setor;

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
