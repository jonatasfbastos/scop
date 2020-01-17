/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.pesquisador.dao;

import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import java.util.List;

/**
 *
 * @author Bessa
 */
public interface IDaoPesquisador extends IBaseDao<Pesquisador>{
    public abstract List<Pesquisador> findByMatricula(Pesquisador pesquisador);
    
}
