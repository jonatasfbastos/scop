/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.pesquisador.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import java.util.List;

/**
 *
 * @author Gustavo Dourado
 */
public class DaoPesquisador extends BaseDao<Pesquisador> implements IDaoPesquisador {

    public DaoPesquisador() {
         //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List<Pesquisador> findByMatricula(String matricula){
        
        String query = "select p from Pesquisador p WHERE upper(p.matricula) like upper('" + matricula +"%')";
        
        return BaseDao.entityManager.createQuery(query).getResultList();
        
    }

}
