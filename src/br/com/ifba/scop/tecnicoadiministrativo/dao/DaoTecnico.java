/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.tecnicoadiministrativo.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.tecnicoadiministrativo.model.Tecnico;
import java.util.List;

/**
 *
 * @author Gusdb
 */
public class DaoTecnico extends BaseDao<Tecnico> implements IDaoTecnico {
    
    @Override
    public List<Tecnico> FindByNomeTecnico(String tecnico){
        String query = "select t from tecnico t WHERE upper(t.tecnico) like upper('" + tecnico +"%')";
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
    
}
