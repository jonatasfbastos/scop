/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.service;

import br.com.ifba.scop.infraestructure.exception.BusinessException;
import br.com.ifba.scop.infraestructure.support.StringUtil;
import br.com.ifba.scop.projetopesquisa.dao.DaoProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.dao.IDaoProjetoPesquisa;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.List;

/**
 *
 * @author jonatasfbastos
 */
public class ServiceProjetoPesquisa implements IServiceProjetoPesquisa{
    
    // Representa a mensagem de erro se o Projeto de Pesquisa for nulo.
    public final static String PROJ_NULL = "Projeto de Pesquisa null";
    // Representa a mensagem de erro se o Projeto de Pesquisa já existir.
    public final static String PROJ_EXISTE = "O Projeto de Pesquisa já existe, sua operação não pode ser complitada";
    // Representa a mensagem de erro se o Projeto de Pesquisa não existir na base de dados (na hora do update).
    public final static String PROJ_NAO_EXISTE = "O Projeto de Pesquisa NÃO existe na base de dados";
    // Representa a mensagem de erro se o Projeto de Pesquisa for inválido.
    public final static String PROJ_INVALIDO = "Projeto de Pesquisa inválido";
    
    // Objeto que faz a comunicação com a camada Dao
    private final IDaoProjetoPesquisa daoProjetoPesquisa = new DaoProjetoPesquisa();

    //Salva Projeto de Pesquisa. Retorna o Projeto que foi salvo.
    @Override
    public ProjetoPesquisa saveProjetoPesquisa(ProjetoPesquisa projetoPesquisa) {
        
        if(projetoPesquisa == null){
            // Tratamento de exceção
            throw new BusinessException(PROJ_NULL);
            
        }
        
        if(this.validaProjetoPesquisa(projetoPesquisa) == false){
            // Tratamento de exceção
           throw new BusinessException(PROJ_INVALIDO);
            
        }
        
        if(this.projetoExistente(projetoPesquisa)){
            // Tratamento de exceção
            throw new BusinessException(PROJ_EXISTE);
            
        }
        
        // Salvando objeto na base de dados
        return this.daoProjetoPesquisa.save(projetoPesquisa);
    }

    //Atualiza Projeto de Pesquisa. Retorna o Projeto que foi atualizado.
    @Override
    public ProjetoPesquisa updateProjetoPesquisa(ProjetoPesquisa projetoPesquisa) {
        if(projetoPesquisa == null) {
            // Tratamento de exceção
            throw new BusinessException(PROJ_NULL);
            
        }else if(this.daoProjetoPesquisa.findById(projetoPesquisa.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(PROJ_NAO_EXISTE);
            
        }else if(this.validaProjetoPesquisa(projetoPesquisa) == false){
            // Tratamento de exceção
            throw new BusinessException(PROJ_INVALIDO);
            
        }else {
            return this.daoProjetoPesquisa.update(projetoPesquisa);
        }
    }
    
    //Deleta Projeto de Pesquisa. Sem Retorno.
    @Override
    public void deleteProjetoPesquisa(ProjetoPesquisa projetoPesquisa) {
        if(projetoPesquisa == null){
            // Tratamento de exceção
            throw new BusinessException(PROJ_NULL);
        }else if(this.daoProjetoPesquisa.findById(projetoPesquisa.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(PROJ_NAO_EXISTE);
        }else{
            this.daoProjetoPesquisa.delete(projetoPesquisa);
        }
    }

    // Busca todos os Projetos de Pesquisa salvos. Retorna uma lista de Projetos.
    @Override
    public List<ProjetoPesquisa> getAll() {
        return daoProjetoPesquisa.findAll();
    }

    // Busca Projeto de Pesquisa pelo título. Retorna um Projeto de Pesquisa.
    // Ainda não foi implementado.
    @Override
    public ProjetoPesquisa findByTitulo(ProjetoPesquisa projetoPesquisa) {
        return (ProjetoPesquisa) daoProjetoPesquisa.findByTitulo(projetoPesquisa);
    }

    
    //Verifica se já existe algum Projeto de Pesquisa com o mesmo titulo na base de dados
    public boolean projetoExistente(ProjetoPesquisa projetoPesquisa) {
        // Recebe todos os Projetos de Pesquisa da base de dados
        List<ProjetoPesquisa> todos = this.daoProjetoPesquisa.findAll();
        
        //Percorre a lista de Projetos de Pesquisa
        for(int i = 0; i < todos.size(); i++){
            //Verifica se o titulo é igual ao de algum da lista
            if(projetoPesquisa.getTitulo().equals(todos.get(i).getTitulo())){
                return true;
            }
        }
        return false;
    }

    // Verifica se o Projeto de Pesquisa é valido. Retorna true ou false.
    // Ainda não foi implementado.
    public boolean validaProjetoPesquisa(ProjetoPesquisa projetoPesquisa) {
        
        StringUtil util = StringUtil.getInstance();
        
        if(projetoPesquisa == null) {
            return false;
        }
        
        if(util.isEmpty(projetoPesquisa.getTitulo())) {
            return false;
        }
        
        if(util.isEmpty(projetoPesquisa.getCampus())) {
            return false;
        }
        
        if(util.isEmpty(projetoPesquisa.getSubArea())) {
            return false;
        }
        if(util.isEmpty(projetoPesquisa.getLinhaPesquisa())) {
            return false;
        }
        
        if(projetoPesquisa.getDataInicio() == null) {
            return false;
        }
        
        if(util.isEmpty(projetoPesquisa.getViabilidadeTec())) {
            return false;
        }
        
        return true;
        
    }
    
}
