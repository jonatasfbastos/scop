/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.aluno.service;

import br.com.ifba.scop.aluno.model.Aluno;
import java.util.List;

/**
 *
 * @author Igor Lopes
 */
public abstract class IServiceAluno {
    // Salva aluno na base de dados
    public abstract Aluno saveAluno(Aluno aluno);
    // Deleta o aluno da base de dados
    public abstract void deleteAluno(Aluno aluno);
    // Metodo que atualiza Aluno que já existe na base de dados
    public abstract Aluno  updateAluno (Aluno aluno);
    // Metodo que retorna todos os Alunos da base de dados
    public abstract List<Aluno> getAllAluno ();
    // Método que retorna um Aluno pelo Id
    public abstract Aluno  getByIdAluno (Long id);
    // Metodo que busca um Aluno na base de dados através do nome
    public abstract List<Aluno> findByAluno (String Aluno);
}
