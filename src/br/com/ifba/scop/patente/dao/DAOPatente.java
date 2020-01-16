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
    private String sql;

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
        // setting sql command
        this.setSql("SELECT c.id FROM Patente AS c WHERE c.numero=:numero "
                + "OR c.tituloInvencao=:title OR c.areaInvencao=:area");
        // mandando query // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(this.getSql());
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
        // setting sql command
        this.setSql("SELECT c.id FROM Patente AS c WHERE "
                + "c.numero=:numero AND c.id=:id");
        // mandando query // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(this.getSql());
        query.setParameter("numero", patente.getNumero());
        query.setParameter("id", patente.getId());
        if (query.getResultList().isEmpty()) {
            // não foi encontrado patente correspondente - erro
            return false;
        }
        // setting sql command again, anothe context
        this.setSql("SELECT c.id FROM Patente AS c WHERE "
                + "c.tituloInvencao=:title OR c.areaInvencao=:area");
        // inserindo comando na querry e inserindo os dados
        query = entityManager.createQuery(this.getSql());
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
    
    /**
     * 
     * @param idnum
     * @return 
     */
    @Override
    public Patente findByID(long idnum) {
        return this.findById(idnum);
    }
    
    /**
     * This method is for search by title.
     * @param patente Patente Object.
     * @return Patente Object
     */
    @Override
    public List<Patente> findByTitle(Patente patente) {
        this.setSql("SELECT c FROM Patente WHERE c.tituloInvencao=:title");
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(this.getSql());
        query.setParameter("title", patente.getTituloInvencao());
        return query.getResultList();
    }
    
    // Getter and Setter

    /**
     * Returns a sql command.
     * @return String
     */
    private String getSql() {
        return this.sql;
    }

    /**
     * Inserts a sql command.
     * @param sql String
     */
    private void setSql(String sql) {
        this.sql = sql;
    }
    
}
