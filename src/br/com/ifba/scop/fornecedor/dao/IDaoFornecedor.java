/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.fornecedor.dao;

import br.com.ifba.scop.fornecedor.model.Fornecedor;
import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface IDaoFornecedor extends IBaseDao<Fornecedor>{
    //Busca um Grupo de Pesquisa pelo título.

    /**
     *
     * @param CNPJ
     * @return 
     */
    public abstract List<Fornecedor> findByCNPJ(String CNPJ);
    public abstract List<Fornecedor> findByIE(String IE);

    
}
