/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.pesquisador.service;


import br.com.ifba.scop.infraestructure.exception.BusinessException;
import br.com.ifba.scop.infraestructure.support.StringUtil;
import br.com.ifba.scop.pesquisador.dao.DaoPesquisador;
import br.com.ifba.scop.pesquisador.dao.IDaoPesquisador;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import static br.com.ifba.scop.projetopesquisa.service.ServiceProjetoPesquisa.PROJ_EXISTE;
import static br.com.ifba.scop.projetopesquisa.service.ServiceProjetoPesquisa.PROJ_INVALIDO;
import static br.com.ifba.scop.projetopesquisa.service.ServiceProjetoPesquisa.PROJ_NULL;
import java.util.List;


public class ServicePesquisador implements IServicePesquisador{
    
    // Representa a mensagem de erro se o Projeto de Pesquisa for nulo.
    public final static String PSQDOR_NULL = "Pesquisador nulo";
    // Representa a mensagem de erro se o Projeto de Pesquisa já existir.
    public final static String PSQDOR_EXISTE = "O Pesquisador já existe, sua operação não pode ser complitada";
    // Representa a mensagem de erro se o Projeto de Pesquisa não existir na base de dados (na hora do update).
    public final static String PSQDOR_NAO_EXISTE= "Pesquisador inexistente!";
    // Representa a mensagem de erro se o Projeto de Pesquisa for inválido.
    public final static String PSQDOR_INVALIDO = "Pesquisador inválido";
    
    // Objeto que faz a comunicação com a camada Dao
    private final IDaoPesquisador daoPesquisador = new DaoPesquisador();

    //Salva Projeto de Pesquisa. Retorna o Projeto que foi salvo.
    @Override
    public Pesquisador savePesquisador(Pesquisador pesquisador) {
         if(pesquisador == null){
            // Tratamento de exceção
            throw new BusinessException(PROJ_NULL);
            
        }else if(this.validaPesquisador(pesquisador) == false){
            // Tratamento de exceção
            throw new BusinessException(PROJ_INVALIDO);
            
        }else if(this.pesquisadorExistente(pesquisador)){
            // Tratamento de exceção
            throw new BusinessException(PROJ_EXISTE);
            
        }else{
            // Salvando objeto na base de dados
            return this.daoPesquisador.save(pesquisador);
        }
    }

    //Atualiza Projeto de Pesquisa. Retorna o Projeto que foi atualizado.
    @Override
    public Pesquisador updatePesquisador(Pesquisador pesquisador) {
        if(pesquisador == null) {
            // Tratamento de exceção
            throw new BusinessException(PSQDOR_NULL);
            
        }else if(this.daoPesquisador.findById(pesquisador.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(PSQDOR_NAO_EXISTE);
            
        }else if(this.validaPesquisador(pesquisador) == false){
            // Tratamento de exceção
            throw new BusinessException(PSQDOR_INVALIDO);
            
        }else {
            return this.daoPesquisador.update(pesquisador);
        }
    }
    
    //Deleta Projeto de Pesquisa. Sem Retorno.
    @Override
    public void deletePesquisador(Pesquisador pesquisador) {
        if(pesquisador == null){
            // Tratamento de exceção
            throw new BusinessException(PSQDOR_NULL);
        }else if(this.daoPesquisador.findById(pesquisador.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(PSQDOR_NAO_EXISTE);
        }else{
            this.daoPesquisador.delete(pesquisador);
        }
    }

    // Busca todos os Projetos de Pesquisa salvos. Retorna uma lista de Projetos.
    @Override
    public List<Pesquisador> getAll() {
        return daoPesquisador.findAll();
    }

    // Busca Projeto de Pesquisa pelo nome. Retorna um Projeto de Pesquisa.
    // Ainda não foi implementado.
    @Override
    public Pesquisador findByMatricula(Pesquisador pesquisador) {
        return (Pesquisador) daoPesquisador.findByMatricula(pesquisador);
    }

    
    //Verifica se já existe algum Projeto de Pesquisa com o mesmo titulo na base de dados
    public boolean pesquisadorExistente(Pesquisador pesquisador) {
        // Recebe todos os Projetos de Pesquisa da base de dados
        List<Pesquisador> todos = this.daoPesquisador.findAll();
        
        //Percorre a lista de Projetos de Pesquisa
        for(int i = 0; i < todos.size(); i++){
            //Verifica se a matricula é igual ao de algum da lista
            if(pesquisador.getMatricula().equals(todos.get(i).getMatricula())){
                return true;
            }
        }
        return false;
    }

    // Verifica se o Projeto de Pesquisa é valido. Retorna true ou false.
    // Ainda não foi implementado.
    public boolean validaPesquisador(Pesquisador pesquisador) {
        
        StringUtil util = StringUtil.getInstance();
        
        if(pesquisador == null) {
            return false;
        }
        
        if( util.isNullOrEmpty(pesquisador.getCpf())           ||
            util.isNullOrEmpty(pesquisador.getRg())            ||
            util.isNullOrEmpty(pesquisador.getTitulação())     ||
            util.isNullOrEmpty(pesquisador.getNome())          ||
            util.isNullOrEmpty(pesquisador.getInstituição())   ||
            util.isNullOrEmpty(pesquisador.getMatricula())     ||
            util.isNullOrEmpty(pesquisador.getOrgaoEmisor())   ||
            util.isNullOrEmpty(pesquisador.getEmail())          ) {
        
            return false;
        }
        
     
        
        return true;
        
    }
    
       
}
