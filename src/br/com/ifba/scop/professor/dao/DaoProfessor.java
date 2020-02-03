/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.professor.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.professor.model.Professor;
import java.util.List;

/**
 *
 * @author Bessa
 */
public class DaoProfessor extends BaseDao<Professor> implements IDaoProfessor{

    @Override
    public List<Professor> FindByNomeProfessor(String professor) {
        String query = "select p from professor p WHERE upper(p.professor) like upper('" + professor +"%')";
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
    
}
