/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.fornecedor.dao;

import br.com.ifba.scop.fornecedor.model.Fornecedor;
import br.com.ifba.scop.infraestructure.dao.BaseDao;
import java.util.List;

/**
 *
 * @author mvictor
 */
public class DaoFornecedor extends BaseDao<Fornecedor> implements IDaoFornecedor{

    @Override
    public List<Fornecedor> findByNomeFornecedor(String nome) {
        String query = "select f from fornecedor f WHERE upper(f.nome) like upper('" + nome +"%')";   
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
    
}
