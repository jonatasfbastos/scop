/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.professor.dao;

import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import br.com.ifba.scop.professor.model.Professor;
import java.util.List;

/**
 *
 * @author lab02
 */
public interface IDaoProfessor extends IBaseDao<Professor>{

    /**
     *
     * @param professor
     * @return
     */
    public abstract List<Professor> FindByNomeProfessor(String professor);
}
