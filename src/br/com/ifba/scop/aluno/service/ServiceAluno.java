/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.aluno.service;

import br.com.ifba.scop.aluno.dao.DaoAluno;
import br.com.ifba.scop.aluno.dao.IDaoAluno;
import br.com.ifba.scop.aluno.model.Aluno;
import br.com.ifba.scop.infraestructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author Igor Lopes
 */
public class ServiceAluno extends IServiceAluno{
    
     // Representa a mensagem de erro se o Professor for null;
    public final static String ALUNO_NULL = "Aluno null";
    // Representa a mensagem de erro se o Professor já existir;
    public final static String ALUNO = "O Aluno já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Professora não existir na base de dados;
    public final static String ALUNO_NAO_EXISTE = "O Aluno NÃO existe na base de dados";
    // Representa a mensagem de erro se o Professor for inválido;
    public final static String ALUNO_INVALIDO = "Aluno inválido";
    
    private final IDaoAluno daoAluno = new DaoAluno();
    


    @Override
    public Aluno saveAluno(Aluno aluno) {
        if(aluno == null){
            // Tratamento de exceção
            throw new BusinessException(ALUNO_NULL);
        }
        if(this.validaAluno(aluno) == false){
            // Tratamento de exceção
           throw new BusinessException(ALUNO_INVALIDO);
        }
        if(this.alunoExistente(aluno)){
            // Tratamento de exceção
            throw new BusinessException(ALUNO);
        }
        // Salvando objeto na base de dados
        return daoAluno.save(aluno);
    }

    @Override
    public void deleteAluno(Aluno aluno) {
        if(aluno == null){
            // Tratamento de exceção
            throw new BusinessException(ALUNO_NULL);
        }else if(this.daoAluno.findById(aluno.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(ALUNO_NAO_EXISTE);
        }else{
            this.daoAluno.delete(aluno);
        }    }

    @Override
    public Aluno updateAluno(Aluno aluno) {
        if(aluno == null) {
               // Tratamento de exceção
           throw new BusinessException(ALUNO_NULL);

        }else if(this.daoAluno.findById(aluno.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(ALUNO_NAO_EXISTE);
            
        }else if(this.validaAluno(aluno) == false){
               // Tratamento de exceção
               throw new BusinessException(ALUNO_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoAluno.update(aluno);
           }
    }

    @Override
    public List<Aluno> getAllAluno() {
            return daoAluno.findAll();
    }

    @Override
    public Aluno getByIdAluno(Long id) {
         return daoAluno.findById(id);
    }

    @Override
    public List<Aluno> findByAluno(String Aluno) {
        return daoAluno.FindByNomeAluno(Aluno);
    }

    private boolean validaAluno(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean alunoExistente(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
