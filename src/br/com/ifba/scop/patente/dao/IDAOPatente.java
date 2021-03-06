/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.dao;

import br.com.ifba.scop.patente.model.Patente;

/**
 * Interface para o dao de patente.
 * @author abel,felipe,edcleia, igor
 */
public interface IDAOPatente {
    // save a patente
    public abstract boolean savePatente(Patente patente);
    // delete a patente
    public abstract boolean deletePatente(Patente patente);
    // update a patente
    public abstract boolean updatePatente(Patente patente);
    // returns all patentes
    public abstract java.util.List<Patente> takeAll();
    // search by id
    public abstract java.util.List<Patente> findByArea(Patente patente);
    // search by title patente
    public abstract java.util.List<Patente> findByTitle(Patente patente);
    // search by number patente
    public abstract java.util.List<Patente> findByNumber(Patente patente);
}
