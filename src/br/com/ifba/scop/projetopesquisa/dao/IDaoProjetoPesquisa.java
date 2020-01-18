/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.projetopesquisa.dao;

import br.com.ifba.scop.infraestructure.dao.IBaseDao;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.List;

/**
 *
 * @author jonatasfbastos
 */
public interface IDaoProjetoPesquisa extends IBaseDao<ProjetoPesquisa>{
    
    //Busca um Projeto de Pesquisa pelo título.
    public abstract List<ProjetoPesquisa> findByTitulo(String titulo);
    
}
