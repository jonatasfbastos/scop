/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.professor.service;

import br.com.ifba.scop.professor.model.Professor;
import java.util.List;

/**
 *
 * @author Bessa
 */
public abstract class IServiceProfessor {
    // Salva professor na base de dados
    public abstract Professor saveProfessor(Professor professor);
    // Deleta o professor da base de dados
    public abstract void deleteProfessor(Professor professor);
    // Metodo que atualiza um Grupo de Pesquisa que já existe na base de dados
    public abstract Professor  updateProfessor (Professor professor);
    // Metodo que retorna todos os Grupo de Pesquisa da base de dados
    public abstract List<Professor> getAllProfessor ();
    // Método que retorna um Grupo de Pesquisa pelo Id
    public abstract Professor  getByIdProfessor (Long id);
    // Metodo que busca um Grupo de Pesquisa na base de dados através do nome
    public abstract List<Professor> findByProfessor (String Professor);
}
