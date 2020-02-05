/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.tecnicoadiministrativo.service;

import br.com.ifba.scop.infraestructure.exception.BusinessException;
import br.com.ifba.scop.tecnicoadiministrativo.dao.DaoTecnico;
import br.com.ifba.scop.tecnicoadiministrativo.dao.IDaoTecnico;
import br.com.ifba.scop.tecnicoadiministrativo.model.Tecnico;
import java.util.List;

/**
 *
 * @author Gusdb
 */
public class ServiceTecnico extends IServiceTecnico {
     // Representa a mensagem de erro se o Tecnico for null;
    public final static String TECNICO_NULL = "Tecnico null";
    // Representa a mensagem de erro se o Tecnico já existir;
    public final static String TECNICO = "O Tecnico já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Tecnico não existir na base de dados;
    public final static String TECNICO_NAO_EXISTE = "O Tecnico NÃO existe na base de dados";
    // Representa a mensagem de erro se o Tecnico for inválido;
    public final static String TECNICO_INVALIDO = "Tecnico inválido";
    
    private final IDaoTecnico daoTecnico = new DaoTecnico();
    
    @Override
    public Tecnico saveTecnico(Tecnico tecnico) {
        if(tecnico == null){
            // Tratamento de exceção
            throw new BusinessException(TECNICO_NULL);
        }
        if(this.validaTecnico(tecnico) == false){
            // Tratamento de exceção
           throw new BusinessException(TECNICO_INVALIDO);
        }
        if(this.tecnicoExistente(tecnico)){
            // Tratamento de exceção
            throw new BusinessException(TECNICO);
        }
        // Salvando objeto na base de dados
        return daoTecnico.save(tecnico);
    }
    
    @Override
    public void deleteTecnico(Tecnico tecnico) {
        if(tecnico == null){
            // Tratamento de exceção
            throw new BusinessException(TECNICO_NULL);
        }else if(this.daoTecnico.findById(tecnico.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(TECNICO_NAO_EXISTE);
        }else{
            this.daoTecnico.delete(tecnico);
        }
    }
    
     // Atualização do professor na base de dados
    @Override
    public Tecnico updateTecnico(Tecnico tecnico) {
        if(tecnico == null) {
               // Tratamento de exceção
           throw new BusinessException(TECNICO_NULL);

        }else if(this.daoTecnico.findById(tecnico.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(TECNICO_NAO_EXISTE);
            
        }else if(this.validaTecnico(tecnico) == false){
               // Tratamento de exceção
               throw new BusinessException(TECNICO_INVALIDO);
        }else {
            //Atualiza o objeto na base de dados
            return this.daoTecnico.update(tecnico);
           }
    }

    @Override
    public List<Tecnico> getAllTecnico() {
        return daoTecnico.findAll();
    }

    @Override
    public Tecnico getByIdTecnico(Long id) {
        return daoTecnico.findById(id);
    }

    @Override
    public List<Tecnico> findByTecnico(String tecnico) {
        return daoTecnico.FindByNomeTecnico(tecnico);
    }
   
    
    // MÉTODOS DE VALIDAÇÃO ##############################################################
    
    public boolean validaTecnico(Tecnico tecnico){
        return true;
    }

    public boolean tecnicoExistente(Tecnico tecnico) {
        // 
        List<Tecnico> all = this.daoTecnico.findAll();
        return false;
    }

}
