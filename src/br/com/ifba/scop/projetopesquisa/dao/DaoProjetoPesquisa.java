/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.List;

/**
 *
 * @author jonatasfbastos
 */
public class DaoProjetoPesquisa extends BaseDao<ProjetoPesquisa> implements IDaoProjetoPesquisa{

    @Override
    public List<ProjetoPesquisa> findByTitulo(ProjetoPesquisa projetoPesquisa) {
        
        String query = "FROM ProjetoPesquisa WHERE upper(titulo) like upper('" + projetoPesquisa.getTitulo() +"'%";
        
        return BaseDao.entityManager.createNamedQuery(query).getResultList();
    }

    
}
