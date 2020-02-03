/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.aluno.dao;

import br.com.ifba.scop.aluno.model.Aluno;
import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import java.util.List;

/**
 *
 * @author Igor Lopes
 */
public interface IDaoAluno extends IBaseDao<Aluno>{

     /**
     *
     * @param aluno
     * @return
     */
    public abstract List<Aluno> FindByNomeAluno(String aluno);
}
