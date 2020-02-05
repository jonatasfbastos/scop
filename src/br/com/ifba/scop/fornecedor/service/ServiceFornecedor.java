/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.fornecedor.service;


import br.com.ifba.scop.fornecedor.dao.DaoFornecedor;
import br.com.ifba.scop.fornecedor.dao.IDaoFornecedor;
import br.com.ifba.scop.fornecedor.model.Fornecedor;
import br.com.ifba.scop.infraestructure.exception.BusinessException;
import java.util.List;
/**
 *
 * @author mvictor
 */
public class ServiceFornecedor implements IServiceFornecedor{

    // Representa a mensagem de erro se o Grupo de Pesquisa for nulo.
    public final static String FORNECEDOR_NULL = "Fornecedor null";
    // Representa a mensagem de erro se o Grupo de Pesquisa já existir.
    public final static String FORNECEDOR = "O Fornecedor já existe, sua operação não pode ser completada";
    // Representa a mensagem de erro se o Grupo de Pesquisa não existir na base de dados (na hora do update).
    public final static String FORNECEDOR_NAO_EXISTE = "O Fornecedor NÃO existe na base de dados";
    // Representa a mensagem de erro se o Grupo de Pesquisa for inválido.
    public final static String FORNECEDOR_INVALIDO = "Fornecedor inválido";
    
   // Objeto que faz a comunicação com a camada Dao
    private final IDaoFornecedor daoFornecedor = new DaoFornecedor();
    
    //salva no banco, retorna grupo de pesquisa salvo

    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
         if(fornecedor == null){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NULL);
        }
        
        if(this.validaFornecedor(fornecedor) == false){
            // Tratamento de exceção
           throw new BusinessException(FORNECEDOR_INVALIDO);
        }
        
        if(this.fornecedorExistente(fornecedor)){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR);
        }
        
        // Salvando objeto na base de dados
        return this.daoFornecedor.save(fornecedor);
    }
    
    //atualiza grupo de pesuqisa já existente

    /**
     *
     * @param fornecedor
     * @return
     */
    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null) {
               // Tratamento de exceção
           throw new BusinessException(FORNECEDOR_NULL);

        }else if(this.daoFornecedor.findById(fornecedor.getId()) == null) {
               // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NAO_EXISTE);

           }else if(this.validaFornecedor(fornecedor) == false){
               // Tratamento de exceção
               throw new BusinessException(FORNECEDOR_INVALIDO);

           }else {
                //Atualiza o objeto na base de dados
               return this.daoFornecedor.update(fornecedor);
           }
    }
    
    //deleta grupo de pesquisa existente 

    /**
     *
     * @param fornecedor
     */

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NULL);
        }else if(this.daoFornecedor.findById(fornecedor.getId()) == null) {
            // Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NAO_EXISTE);
        }else{
            this.daoFornecedor.delete(fornecedor);
        }
    }
    
    //lista todos os grupos de pesquisa

    /**
     *
     * @return
     */
   
    @Override
    public List<Fornecedor> getAllFornecedor() {
        return daoFornecedor.findAll();
    }
    
    //retorna pelo id

    @Override
    public Fornecedor getByIdFornecedor(Long id) {
        return this.daoFornecedor.findById(id);
    }
    
      
    //precisa implementar

    /**
     *
     * @param grupoPesquisa
     * @return
     */
    
    public boolean validaFornecedor(Fornecedor fornecedor) {
        return true;
    }
    
    //Verifica se já existe algum Projeto de Pesquisa com o mesmo titulo na base de dados

    /**
     *
     * @param fornecedor
     * @return
     */

    public boolean fornecedorExistente(Fornecedor fornecedor) {
        // Recebe todos os Projetos de Pesquisa da base de dados
        List<Fornecedor> todos = this.daoFornecedor.findAll();
        
        //Percorre a lista de Projetos de Pesquisa
       /* for(int i = 0; i < todos.size(); i++){
            //Verifica se o titulo é igual ao de algum da lista
            if(grupoPesquisa.getTitulo().equals(todos.get(i).getTitulo())){
                return true;
            }
        }*/
        return false;
    }

    @Override
    public List<Fornecedor> findByFornecedor(String titulo) {
        return daoFornecedor.findByNomeFornecedor(titulo);
    }
    
    
}
