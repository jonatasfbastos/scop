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
    public abstract boolean saveAluno(Aluno aluno);
    // delete o Aluno
    public abstract boolean deleteAluno(Aluno aluno);
    // update O Aluno
    public abstract boolean updateAluno(Aluno aluno);
    // retornar todos os alunos
    public abstract java.util.List<Aluno> takeAll();
    // Procurar por matricula
    public abstract java.util.List<Aluno> findByMatricula(Aluno aluno);
    // Procurar por nome
    public abstract java.util.List<Aluno> findByNome(Aluno aluno);
    // Procurar por ano
    public abstract java.util.List<Aluno> findByAno(Aluno aluno);

    public List<Aluno> FindByNomeAluno(String Aluno);
    
}
