/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.service;

import br.com.ifba.scop.patente.model.Patente;
import br.com.ifba.scop.infraestructure.support.StringUtil;
import br.com.ifba.scop.patente.dao.IDAOPatente;

/**
 *
 * @author abel
 */
public class ServicePatente implements IServicePatente {
    private boolean success;
    private final IDAOPatente daoPatente;
    
    /**
     * Construtor of this service.
     */
    public ServicePatente() {
        this.success = false;
        // instanciando dao
        this.daoPatente = 
                new br.com.ifba.scop.patente.dao.DAOPatente();
    }
    
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
        this.setSuccess(true);
        // numero da patente, se negativo
        if (patente.getNumero() < 1) {
            this.setSuccess(false);
            return;
        }
        // titulo invenção - testa - vazio ou nulo
        if (StringUtil.getInstance().isEmpty(patente.getTituloInvencao())) {
            this.success = false;
            return;
        }
        if (StringUtil.getInstance().isNull(patente.getTituloInvencao())) {
            this.setSuccess(false);
            return;
        }
        // area invenção - testa - vazio ou nulo
        if (StringUtil.getInstance().isEmpty(patente.getAreaInvencao())) {
            this.setSuccess(false);
            return;
        }
        if (StringUtil.getInstance().isNull(patente.getAreaInvencao())) {
            this.setSuccess(false);
            return;
        }
        // se chegou até aqui, dados aprovados
        this.getDaoPatente().savePatente(patente);
    }

    /**
     * Valida dados para fazer atualização - pelo número da patente.
     * @param patente Objeto Patente.
     */
    @Override
    public void updatePatente(Patente patente) {
        this.setSuccess(true);
        // numero da patente, se negativo 
        if (patente.getId() < 1) {
            this.setSuccess(false);
            return;
        }
        if (patente.getNumero() < 1) {
            this.setSuccess(false);
            return;
        }
        // titulo invenção - testa - vazio ou nulo
        if (StringUtil.getInstance().isEmpty(patente.getTituloInvencao())) {
            this.success = false;
            return;
        }
        if (StringUtil.getInstance().isNull(patente.getTituloInvencao())) {
            this.setSuccess(false);
            return;
        }
        // area invenção - testa - vazio ou nulo
        if (StringUtil.getInstance().isEmpty(patente.getAreaInvencao())) {
            this.setSuccess(false);
            return;
        }
        if (StringUtil.getInstance().isNull(patente.getAreaInvencao())) {
            this.setSuccess(false);
            return;
        }
        // se chegou até aqui, dados aprovados // enviando para o dao
        this.getDaoPatente().updatePatente(patente);
    }
    
    /**
     * Valida dados para deletar.
     * @param patente Objeto Patente.
     */
    @Override
    public void deletePatente(Patente patente) {
        this.setSuccess(true);
        // verifica se o id fornecido é valido.
        if (patente.getId() < 1) {
            this.setSuccess(false);
        }
        // se chegou até aqui, dados aprovados // enviando para o dao
        this.getDaoPatente().deletePatente(patente);
    }

    /**
     * Returns the success or not of the operation.
     * @return Boolean.
     */
    @Override
    public boolean patenteSuccess() {
        return this.success;
    }

    /**
     * Only for teste.
     * @param success 
     */
    private void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * This method returns a dao of Patente object.
     * @return 
     */
    private IDAOPatente getDaoPatente() {
        return this.daoPatente;
    }
    
}
