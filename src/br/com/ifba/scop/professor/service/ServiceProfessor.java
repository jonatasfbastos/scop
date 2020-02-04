/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.professor.service;

import br.com.ifba.scop.infraestructure.exception.BusinessException;
import br.com.ifba.scop.professor.dao.DaoProfessor;
import br.com.ifba.scop.professor.dao.IDaoProfessor;
import br.com.ifba.scop.professor.model.Professor;
import java.util.List;

/**
 *
 * @author Bessa
 */
public class ServiceProfessor extends IServiceProfessor{
    
    // Representa a mensagem de erro se o Professor for null;
    public final static String PROFESSOR_NULL = "Professor null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String PROFESSOR = "O Professor já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Professora não existir na base de dados;
    public final static String PROFESSOR_NAO_EXISTE = "O Professor NÃO existe na base de dados";
    // Representa a mensagem de erro se o Professor for inválido;
    public final static String PROFESSOR_INVALIDO = "Professor inválido";
    
    private final IDaoProfessor daoProfessor = new DaoProfessor();
    

    @Override
    public Professor saveProfessor(Professor professor) {
        if(professor == null){
            // Tratamento de exceção
            throw new BusinessException(PROFESSOR_NULL);
        }
        if(this.validaProfessor(professor) == false){
            // Tratamento de exceção
           throw new BusinessException(PROFESSOR_INVALIDO);
        }
        if(this.professorExistente(professor)){
            // Tratamento de exceção
            throw new BusinessException(PROFESSOR);
        }
        // Salvando objeto na base de dados
        return daoProfessor.save(professor);
    }

    @Override
    public void deleteProfessor(Professor professor) {
        if(professor == null){
            // Tratamento de exceção
            throw new BusinessException(PROFESSOR_NULL);
        }else if(this.daoProfessor.findById(professor.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(PROFESSOR_NAO_EXISTE);
        }else{
            this.daoProfessor.delete(professor);
        }
    }
    
    // Atualização do professor na base de dados
    @Override
    public Professor updateProfessor(Professor professor) {
        if(professor == null) {
               // Tratamento de exceção
           throw new BusinessException(PROFESSOR_NULL);

        }else if(this.daoProfessor.findById(professor.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(PROFESSOR_NAO_EXISTE);
            
        }else if(this.validaProfessor(professor) == false){
               // Tratamento de exceção
               throw new BusinessException(PROFESSOR_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoProfessor.update(professor);
           }
    }

    @Override
    public List<Professor> getAllProfessor() {
        return daoProfessor.findAll();
    }

    @Override
    public Professor getByIdProfessor(Long id) {
        return daoProfessor.findById(id);
    }

    @Override
    public List<Professor> findByProfessor(String Professor) {
        return daoProfessor.FindByNomeProfessor(Professor);
    }
    
    // MÉTODOS DE VALIDAÇÃO ##############################################################
    
    public boolean validaProfessor(Professor professor){
        return true;
    }

    public boolean professorExistente(Professor professor) {
        // 
        List<Professor> all = this.daoProfessor.findAll();
        return false;
    }
    
}
