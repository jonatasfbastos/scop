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
     * Valida dados para inserir na base de dados.
     * @param patente Objeto Patente.
     * @return Boolean
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
        // testa inconsistencia de dia e mês
        if (patente.getDia() > 31 || patente.getMes() > 12) {
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
     * @return Boolean
     */
    @Override
    public boolean updatePatente(Patente patente) {
        this.setSuccess(true);
        // numero da patente, se negativo 
        if (patente.getId() < 1) {
            this.setSuccess(false);
            return this.patenteSuccess();
        }
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
        // testa inconsistencia de dia e mês
        if (patente.getDia() > 31 || patente.getMes() > 12) {
            this.setSuccess(false);
            return this.patenteSuccess();
        }
        // se chegou até aqui, dados aprovados // enviando para o dao
        this.setSuccess(this.getDaoPatente().updatePatente(patente));
        return this.patenteSuccess();
    }
    
    /**
     * Valida dados para deletar.
     * @param patente Objeto Patente.
     * @return Boolean
     */
    @Override
    public boolean deletePatente(Patente patente) {
        this.setSuccess(true);
        // verifica se o id fornecido é valido.
        if (patente.getId() < 1) {
            this.setSuccess(false);
            return this.patenteSuccess();
        }
        // se chegou até aqui, dados aprovados // enviando para o dao
        this.setSuccess(this.getDaoPatente().deletePatente(patente));
        return this.patenteSuccess();
    }

    /**
     * Returns the success or not of the operation.
     * @return Boolean.
     */
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
    public List<Patente> getAllPatente() {
        return this.getDaoPatente().takeAll();
    }
    
    /**
     * Search by Area of patente.
     * @param patente Instance
     * @return A List of Patente Instance
     */
    @Override
    public List<Patente> searchPatenteArea(Patente patente) {
        if (StringUtil.getInstance().isNullOrEmpty(patente.getAreaInvencao())) {
            // o parametro nunca pode ser um valor negativo
            return null;
        }
        return this.getDaoPatente().findByArea(patente);
    }
    
    /**
     * This method returns a search by title.
     * @param patente Patente Object
     * @return A Patente Object List.
     */
    @Override
    public List<Patente> searchPatenteTitle(Patente patente) {
        if (StringUtil.getInstance().isNullOrEmpty(patente.getTituloInvencao())) {
            // quando os dados para pesquisa são reprovados
            return null;
        }
        return this.getDaoPatente().findByTitle(patente);
    }
    
    /**
     * This method returns a search by number.
     * @param patente Patente Instance
     * @return A List of Patente Instances
     */
    @Override
    public List<Patente> searchPatenteNumber(Patente patente) {
        if (patente.getNumero() < 1) {
            // um numero de patente não pode ser menor que 1
            return null;
        }
        return this.getDaoPatente().findByNumber(patente);
    }
    
}
