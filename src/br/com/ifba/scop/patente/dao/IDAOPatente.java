/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.dao;

import br.com.ifba.scop.patente.model.Patente;

/**
 *
 * @author abel,felipe,edcleia
 */
public interface IDAOPatente {
    public abstract void savePatente(Patente patente);
    public abstract void deletePatente(Patente patente);
    public abstract void updatePatente(Patente patente);
    public abstract java.util.List<Patente> takeAll();
}
