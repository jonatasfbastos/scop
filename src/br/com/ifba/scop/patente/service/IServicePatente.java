/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.patente.service;

import br.com.ifba.scop.patente.model.Patente;
import java.util.List;

/**
 *
 * @author abel
 */
public interface IServicePatente {
    public abstract boolean savePatente(Patente patente);
    public abstract void updatePatente(Patente patente);
    public abstract void deletePatente(Patente patente);
    public abstract boolean patenteSuccess();
    public abstract List<Patente> takeAllPatente();
}
