/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.grupopesquisa.dao;

import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import br.com.ifba.scop.infraestructure.dao.BaseDao;
import java.util.List;

/**
 *
 * @author beatriz
 */
public class DaoGrupoPesquisa extends BaseDao<GrupoPesquisa> implements IDaoGrupoPesquisa{
    @Override
    public List<GrupoPesquisa> findByTitulo(String titulo) {
        
        String query = "select pp from ProjetoPesquisa pp WHERE upper(pp.titulo) like upper('" + titulo +"%')";
        
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
}