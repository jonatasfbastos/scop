/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.patente.model.Patente;
import java.util.List;
import javax.persistence.Query;

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
     * @return Boolean
     */
    @Override
    public boolean savePatente(Patente patente) {
        final String sql =
                "SELECT c.id FROM Patente AS c WHERE c.numero=:numero "
                + "OR c.tituloInvencao=:title OR c.areaInvencao=:area";
        // mandando query
        Query query = entityManager.createQuery(sql);
        // mandando parametro para o query
        query.setParameter("numero", patente.getNumero());
        query.setParameter("title", patente.getTituloInvencao());
        query.setParameter("area", patente.getAreaInvencao());
        if (!query.getResultList().isEmpty()) {
            // foi encontrado patente correspondente - erro
            return false;
        }
        try {
            this.save(patente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * It is for delete a patente inside database.
     * @param patente Patente Object.
     * @return Boolean
     */
    @Override
    public boolean deletePatente(Patente patente) {
        // testando se o comando funcionará bem, retornando booleano
        try {
            this.delete(patente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * It is for update data about a patente.
     * @param patente Patente Object.
     * @return Boolean
     */
    @Override
    public boolean updatePatente(Patente patente) {
        String sql =
                "SELECT c.id FROM Patente AS c WHERE c.numero=:numero "
                + "AND c.id=:id";
        // mandando query
        Query query = entityManager.createQuery(sql);
        // mandando parametro para o query
        query.setParameter("numero", patente.getNumero());
        query.setParameter("id", patente.getId());
        if (query.getResultList().isEmpty()) {
            // não foi encontrado patente correspondente - erro
            return false;
        }
        sql = "SELECT c.id FROM Patente AS c WHERE "
                + "c.tituloInvencao=:title OR c.areaInvencao=:area";
        query = entityManager.createQuery(sql);
        query.setParameter("title", patente.getTituloInvencao());
        query.setParameter("area", patente.getAreaInvencao());
        if (!query.getResultList().isEmpty()) {
            // foi encontrado patente correspondente - erro
            return false;
        }
        // verificando se operação foi concluida com sucesso ou não
        try {
            this.update(patente);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
    /**
     * This method returns all instances of database about patente
     * @return List of Patente Object.
     */
    @Override
    public List<Patente> takeAll() {
        return this.findAll();
    }
    
}
