/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.service;

import br.com.ifba.scop.patente.model.Patente;
import br.com.ifba.scop.infraestructure.support.StringUtil;

/**
 *
 * @author abel
 */
public class ServicePatente implements IServicePatente {
    
    /**
     * Option for validate data string.
     */
    static {
        StringUtil.getInstance();
    }

    /**
     * Valida dados para inserir na base de dados.
     * @param patente Objeto Patente.
     */
    @Override
    public void savePatente(Patente patente) {
        
    }

    /**
     * Valida dados para fazer atualização.
     * @param patente Objeto Patente.
     */
    @Override
    public void updatePatente(Patente patente) {
        
    }
    
    /**
     * Valida dados para deletar.
     * @param patente Objeto Patente.
     */
    @Override
    public void deletePatente(Patente patente) {
        
    }
    
}
