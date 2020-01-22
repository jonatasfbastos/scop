/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.service;

import br.com.ifba.scop.patente.model.Patente;
import java.util.List;

/**
 * ServicePatente's interface.
 * @author abel
 */
public interface IServicePatente {
    // inserts inside database
    public abstract boolean savePatente(Patente patente);
    // updates a patente
    public abstract boolean updatePatente(Patente patente);
    // deletes a patente
    public abstract boolean deletePatente(Patente patente);
    // returns all patentes 
    public abstract List<Patente> getAllPatente();
    // search a patente by patente area
    public abstract List<Patente> searchPatenteArea(Patente patente);
    // search a patente by title of it
    public abstract List<Patente> searchPatenteTitle(Patente patente);
    // search a patente by number of it
    public abstract List<Patente> searchPatenteNumber(Patente patente);
}
