/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.service;

import br.com.ifba.scop.patente.model.Patente;
import br.com.ifba.scop.infraestructure.support.StringUtil;
import br.com.ifba.scop.patente.dao.IDAOPatente;
import java.util.List;

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
    public boolean savePatente(Patente patente) {
        this.setSuccess(true);
        // numero da patente, se negativo
        if (patente.getNumero() < 1) {
            this.setSuccess(false);
            return this.patenteSuccess();
        }
        // titulo invenção - testa - vazio ou nulo
        if (StringUtil.getInstance().isEmpty(patente.getTituloInvencao())) {
            this.success = false;
            return this.patenteSuccess();
        }
        if (StringUtil.getInstance().isNull(patente.getTituloInvencao())) {
            this.setSuccess(false);
            return this.patenteSuccess();
        }
        // area invenção - testa - vazio ou nulo
        if (StringUtil.getInstance().isEmpty(patente.getAreaInvencao())) {
            this.setSuccess(false);
            return this.patenteSuccess();
        }
        if (StringUtil.getInstance().isNull(patente.getAreaInvencao())) {
            this.setSuccess(false);
            return this.patenteSuccess();
        }
        // se chegou até aqui, dados aprovados
        /*
        Aqui é enviado os dados para o dao que, se retornar true,
        foram inseridos com sucesso, do contrário, em algum momento
        fora encontrado um erro ou exeção.
        */
        this.setSuccess(this.getDaoPatente().savePatente(patente));
        return this.patenteSuccess();
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
    
    /**
     * This method returns all data inside database
     * @return a list of Patente Object.
     */
    @Override
    public List<Patente> takeAllPatente() {
        return this.getDaoPatente().takeAll();
    }
    
}
