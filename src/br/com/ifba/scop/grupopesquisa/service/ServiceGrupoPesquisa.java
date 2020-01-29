/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.grupopesquisa.service;


import br.com.ifba.scop.grupopesquisa.dao.DaoGrupoPesquisa;
import br.com.ifba.scop.grupopesquisa.dao.IDaoGrupoPesquisa;
import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import br.com.ifba.scop.infraestructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author beatriz
 */
public class ServiceGrupoPesquisa implements IServiceGrupoPesquisa{
    // Representa a mensagem de erro se o Grupo de Pesquisa for nulo.
    public final static String GRUPO_NULL = "Grupo de Pesquisa null";
    // Representa a mensagem de erro se o Grupo de Pesquisa já existir.
    public final static String GRUPO_EXISTE = "O Grupo de Pesquisa já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Grupo de Pesquisa não existir na base de dados (na hora do update).
    public final static String GRUPO_NAO_EXISTE = "O Grupo de Pesquisa NÃO existe na base de dados";
    // Representa a mensagem de erro se o Grupo de Pesquisa for inválido.
    public final static String GRUPO_INVALIDO = "Grupo de Pesquisa inválido";
    
    
   // Objeto que faz a comunicação com a camada Dao
    private final IDaoGrupoPesquisa daoGrupoPesquisa = new DaoGrupoPesquisa();
    
    //salva no banco, retorna grupo de pesquisa salvo
    @Override
    public GrupoPesquisa saveGrupoPesquisa(GrupoPesquisa grupoPesquisa) {
         if(grupoPesquisa == null){
            // Tratamento de exceção
            throw new BusinessException(GRUPO_NULL);
        }
        
        if(this.validaGrupoPesquisa(grupoPesquisa) == false){
            // Tratamento de exceção
           throw new BusinessException(GRUPO_INVALIDO);
        }
        
        if(this.grupoExistente(grupoPesquisa)){
            // Tratamento de exceção
            throw new BusinessException(GRUPO_EXISTE);
        }
        
        // Salvando objeto na base de dados
        return this.daoGrupoPesquisa.save(grupoPesquisa);
    }
    
    //atualiza grupo de pesuqisa já existente
    @Override
    public GrupoPesquisa updateGrupoPesquisa(GrupoPesquisa grupoPesquisa) {
        if(grupoPesquisa == null) {
               // Tratamento de exceção
           throw new BusinessException(GRUPO_NULL);

        }else if(this.daoGrupoPesquisa.findById(grupoPesquisa.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(GRUPO_NAO_EXISTE);

           }else if(this.validaGrupoPesquisa(grupoPesquisa) == false){
               // Tratamento de exceção
               throw new BusinessException(GRUPO_INVALIDO);

           }else {
                //Atualiza o objeto na base de dados
               return this.daoGrupoPesquisa.update(grupoPesquisa);
           }
    }
    
    //deleta grupo de pesquisa existente 
    @Override
    public void deleteGrupoPesquisa(GrupoPesquisa grupoPesquisa) {
        if(grupoPesquisa == null){
            // Tratamento de exceção
            throw new BusinessException(GRUPO_NULL);
        }else if(this.daoGrupoPesquisa.findById(grupoPesquisa.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(GRUPO_NAO_EXISTE);
        }else{
            this.daoGrupoPesquisa.delete(grupoPesquisa);
        }
    }
    
    //lista todos os grupos de pesquisa
    @Override
    public List<GrupoPesquisa> getAllGrupoPesquisa() {
        return daoGrupoPesquisa.findAll();
    }
    
    //retorna pelo id
    @Override
    public GrupoPesquisa getByIdGrupoPesquisa(Long id) {
        return this.daoGrupoPesquisa.findById(id);
    }
    
    //retorna o grupo de pesquisa pelo título
    @Override
    public List<GrupoPesquisa> findByNomeGrupoPesquisa(String titulo) {
         return daoGrupoPesquisa.findByNomeGrupoPesquisa(titulo);
    }
      
    //precisa implementar
    public boolean validaGrupoPesquisa(GrupoPesquisa grupoPesquisa) {
        return true;
    }
    
    //Verifica se já existe algum Projeto de Pesquisa com o mesmo titulo na base de dados
    public boolean grupoExistente(GrupoPesquisa grupoPesquisa) {
        // Recebe todos os Projetos de Pesquisa da base de dados
        List<GrupoPesquisa> todos = this.daoGrupoPesquisa.findAll();
        
        //Percorre a lista de Projetos de Pesquisa
       /* for(int i = 0; i < todos.size(); i++){
            //Verifica se o titulo é igual ao de algum da lista
            if(grupoPesquisa.getTitulo().equals(todos.get(i).getTitulo())){
                return true;
            }
        }*/
        return false;
    }
}
