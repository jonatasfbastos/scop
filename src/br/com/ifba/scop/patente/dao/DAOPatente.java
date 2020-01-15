/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.patente.model.Patente;

/**
 * This class is the dao of Patente entity.
 * @author abel,felipe,edcleia
 */
public class DAOPatente extends BaseDao<Patente> implements IDAOPatente {

    /**
     * Construtor
     */
    public DAOPatente() {
        super();
    }

    /**
     * It registers inside database a new patente.
     * @param patente Patente Object.
     */
    @Override
    public void savePatente(Patente patente) {
        this.save(patente);
    }

    /**
     * It is for delete a patente inside database.
     * @param patente Patente Object.
     */
    @Override
    public void deletePatente(Patente patente) {
        this.delete(patente);
    }

    /**
     * It is for update data about a patente.
     * @param patente Patente Object.
     */
    @Override
    public void updatePatente(Patente patente) {
        this.update(patente);
    }
    
    
}
